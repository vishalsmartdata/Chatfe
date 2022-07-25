package com.sdei.chafte.utils.base

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androidadvance.topsnackbar.TSnackbar
import com.sdei.chafte.R
import com.sdei.chafte.utils.socket.SocketManager
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

/**
 * Created by Vishal on 10/10/19.
 */

abstract class BaseActivity<myBinding : ViewDataBinding, V : ViewModel> : AppCompatActivity() {
    // since its going to be common for all the activities
    var mViewModel: ViewModel? = null
    lateinit var mContext: Context
    lateinit var sessionManager: SessionManager
    abstract val binding: myBinding

    lateinit var mViewBinding: ViewDataBinding
    lateinit var socketManager: SocketManager
    /**
     * @return toolbar resource id
     */
    @get:LayoutRes
    abstract val layoutId: Int

    /**
     * Override for set view model
     *
     * @return view model instance
     */
    abstract var viewModel: V

    /**
     *
     * @return context
     */
    var dialog: Dialog? = null
    protected abstract val context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = Color.WHITE
        }*/
        this.sessionManager = SessionManager(this)
        this.mViewBinding = DataBindingUtil.setContentView(this, layoutId)
        this.mContext = context
        this.mViewModel = viewModel
       /* if(!sessionManager.getvalue(SessionManager.USER_ID).equals(""))
        socketManager = SocketManager(sessionManager.getvalue(SessionManager.USER_ID))*/
        bindData()
    }

    override fun onStart() {
        super.onStart()
        initListeners()
    }

    fun hideKeyboard(view: View) {

        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    abstract fun bindData()

    abstract fun initListeners()

    fun initialSocket(): SocketManager {
        if(!sessionManager.getUserData(SessionManager.USER_ID).equals("")){
            socketManager = SocketManager(sessionManager.getvalue(SessionManager.USER_ID))
        }
        return socketManager
    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    /**
     * Common function for Set Up Binding ...
     */
    fun setUpBinding(): myBinding {
        return mViewBinding as myBinding
    }

    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseModel ...
     * You can also send parameters in constructor ...
     */
    fun setUpVM(activity: AppCompatActivity, obj: ViewModel): V {
        val provider = AppVMProvider()
        provider.createParams(obj)
        return ViewModelProvider(
            activity, provider
        ).get(obj::class.java) as V
    }

    fun showProgress() {
        dialog = Dialog(this)
        Log.e("dialogStatus", "dialog : $dialog")
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCancelable(false)
        dialog?.setContentView(R.layout.view_progress_dialog)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        if (!dialog!!.isShowing)
            dialog!!.show()
    }

    /**
     * Hide Progress Dialog ...
     *
     * @param isShowing
     */
    fun hideProgress() {

        if (dialog != null) {
            if (dialog!!.isShowing)
                dialog!!.dismiss()
        }
    }

    fun saveData(key: String?, token: String?) {
        sessionManager.setValue(key, token)
    }

    fun saveBooleanData(key: String?, token: Boolean?) {
        sessionManager.setBooleanValue(key, token)
    }
    fun getBooleanData(key: String?):Boolean {
        return sessionManager.getBooleanValue(key)
    }


    fun getData(key: String?): String? {
        return sessionManager.getvalue(key)
    }

    fun logout(context: Context?) {
        return sessionManager.logout(context)
    }

    /*fun performDataBinding(): ViewDataBinding {
        mViewDataBinding = DataBindingUtil.setContentView(this, layoutId)
        // this.mViewModel = if (mViewModel == null) getViewModel() else mViewModel
        // mViewDataBinding.setVariable(getBindingVariable(), mViewModel)
        //  mViewDataBinding.executePendingBindings()
        return mViewDataBinding
    }*/

    /* Method for showing SnackBar Alert ...
    *
    * @param view
    * @param message
    * @param isError
    */
    fun showSnackBar(view: View, message: String, isError: Boolean) {
        val snackBar = TSnackbar.make(view, message, TSnackbar.LENGTH_LONG)
        snackBar.setActionTextColor(Color.WHITE)
        val snackBarView = snackBar.view
        when (isError) {
            true -> snackBarView.setBackgroundColor(Color.parseColor("#ff0000"))
            false -> snackBarView.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.colorAccent
                )
            )
        }

//        val font = Typeface.createFromAsset(
//            assets,
//            "fonts/montserrat_regular.otf"
//        )

        val textView = snackBarView.findViewById<TextView>(R.id.snackbar_text)
        textView.setTextColor(Color.WHITE)
        textView.setPadding(
            0,
            (getStatusBarHeight() + resources.getDimension(R.dimen._30sdp).toInt()),
            0,
            0
        )
        textView.gravity = Gravity.CENTER
        //textView.typeface = font
        textView.textSize = resources.getDimension(R.dimen._5sdp)
        snackBar.show()
    }

    /**
     * Get Status Bar Height for the device ...
     * @return
     */
    fun getStatusBarHeight(): Int {
        var result = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId)
        }
        return result
    }

    fun navigateActivity(activity: AppCompatActivity, bundle: Bundle?) {
        val intent: Intent = if (bundle == null) {
            Intent(this, activity::class.java)
        } else {
            Intent(this, activity::class.java).putExtras(bundle)
        }

        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }

    fun openFragmentReplace(id: Int, fragment: Fragment, tag: String, addToBack: Boolean) {
        when (addToBack) {
            true -> supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(
                    R.anim.enter_from_right,
                    R.anim.exit_to_left,
                    R.anim.enter_from_left,
                    R.anim.exit_to_right
                )
                .replace(id, fragment, tag)
                .addToBackStack(null)
                .commit()

            false -> supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(
                    R.anim.enter_from_right,
                    R.anim.exit_to_left,
                    R.anim.enter_from_left,
                    R.anim.exit_to_right
                )
                .replace(id, fragment, tag)
                .commit()
        }
    }

    fun openFragmentReplaceNoAnim(
        id: Int,
        fragment: Fragment,
        tag: String,
        addToBack: Boolean
    ) {
        when (addToBack) {
            true -> supportFragmentManager
                .beginTransaction()
                .replace(id, fragment, tag)
                .addToBackStack(null)
                .commit()

            false -> supportFragmentManager
                .beginTransaction()
                .replace(id, fragment, tag)
                .commit()
        }
    }
    fun openFragmentReplaceNoAnimWithBundle(
        id: Int,
        fragment: Fragment,
        tag: String,
        addToBack: Boolean,
        bundle: Bundle?
    ) {
        when (addToBack) {
            true -> {
                if (bundle != null)
                    fragment.arguments = bundle
                supportFragmentManager
                    .beginTransaction()
                    .replace(id, fragment, tag)
                    .addToBackStack(null)
                    .commit()
            }

            false -> {
                if (bundle != null)
                    fragment.arguments = bundle
                supportFragmentManager
                    .beginTransaction()
                    .replace(id, fragment, tag)
                    .commit()
            }
        }
    }

}

