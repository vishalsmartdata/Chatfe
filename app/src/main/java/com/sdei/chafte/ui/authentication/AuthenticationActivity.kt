package com.sdei.chafte.ui.authentication

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Base64
import android.util.Log
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityAuthenticationBinding
import com.sdei.chafte.ui.authentication.intro.IntroFragment
import com.sdei.chafte.ui.authentication.login.LoginFragment
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.checkMyPermission
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


/**
 * Created by Vishal Sharma on 2019-12-06.
 */
class AuthenticationActivity : BaseActivity<ActivityAuthenticationBinding, BaseVM>() {
    override val binding: ActivityAuthenticationBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_authentication
    override var viewModel: BaseVM
        get() = setUpVM(
            this,
            BaseVM(application)
        )
        set(value) {}
    override val context: Context
        get() = this


    override fun bindData() {

        checkMyPermission(this)
        if(getBooleanData(SessionManager.INSIDE_APP)){
            openFragmentReplaceNoAnim(R.id.authContainer, LoginFragment(), "", false)
        }else {
            openFragmentReplaceNoAnim(R.id.authContainer, IntroFragment(), "", false)
            saveBooleanData(SessionManager.INSIDE_APP,true)
        }
    }

    override fun initListeners() {
        printHashKey(context)
    }

    fun printHashKey(pContext: Context) {
        try {
            val info = pContext.packageManager.getPackageInfo(
                pContext.packageName,
                PackageManager.GET_SIGNATURES
            )
            for (signature in info.signatures) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val hashKey: String = String(Base64.encode(md.digest(), 0))
                Log.e("HashKey", "printHashKey() Hash Key: $hashKey")
            }
        } catch (e: NoSuchAlgorithmException) {
            Log.e("HashKey","printHashKey()", e)
        } catch (e: Exception) {
            Log.e("HashKey", "printHashKey()", e)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        for (fragment in supportFragmentManager.fragments) {
            fragment.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
            finish()
        }
    }
}