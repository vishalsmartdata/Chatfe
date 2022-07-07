package com.sdei.chafte.ui.home

import android.R.attr.path
import android.app.Dialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityHomeBinding
import com.sdei.chafte.databinding.SelectRoomLayoutBinding
import com.sdei.chafte.ui.home.calendar_week.CalendarWeekFragment
import com.sdei.chafte.ui.home.create_event.CreateEventActivity
import com.sdei.chafte.ui.home.filter.FilterActivity
import com.sdei.chafte.ui.home.message.MessageFragment
import com.sdei.chafte.ui.home.notification.NotificationActivity
import com.sdei.chafte.ui.home.profile.ProfileFragment
import com.sdei.chafte.ui.home.search.SearchFragment
import com.sdei.chafte.ui.home.setting.SettingActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.base.BaseVM
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso

/**
 * Created by Vishal Sharma on 2019-12-06.
 */
class HomeActivity : BaseActivity<ActivityHomeBinding, BaseVM>(), RecyclerCallback {
    override val binding: ActivityHomeBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.activity_home
    override var viewModel: BaseVM
        get() = setUpVM(this, HomeVM(application))
        set(value) {}
    override val context: Context
        get() = this

    override fun bindData() {
        binding.acVM=viewModel
        setUpToolbar()
        // setUpSideMenu()
    }

    private fun setUpToolbar() {
        setSupportActionBar(binding.toolbar)

        binding.title.text= (getString(R.string.home))

        if(getIntent().getStringExtra("key").equals("login")) {
            setFragment(HomeFragment())
            binding.bottomNavigation.selectedItemId=R.id.home
        }
        else if(getIntent().getStringExtra("key").equals("About")) {
            setFragment(ProfileFragment())
            binding.bottomNavigation.selectedItemId=R.id.profile_navigation
        }
        else if(getIntent().getStringExtra("key").equals("filter")) {
            binding.bottomNavigation.selectedItemId=R.id.home
            val frag = supportFragmentManager.beginTransaction()
            var fragment=HomeFragment()
            val mBundle = Bundle()
            mBundle.putString("category_id",getIntent().getStringExtra("category_id"))
            mBundle.putString("start_time",getIntent().getStringExtra("start_time"))
            mBundle.putString("sort_id",getIntent().getStringExtra("sort_id"))
            mBundle.putString("date",getIntent().getStringExtra("date"))
            mBundle.putString("free_on_Calendar",getIntent().getStringExtra("free_on_Calendar"))
            fragment.arguments = mBundle
            frag.replace(R.id.nav_fragment,fragment)
            frag.commit()
        }
      
        binding.imgPlus.setOnClickListener {
            setSelectionRoom()
        }
        binding.imgSetting.setOnClickListener {
            navigateActivity(SettingActivity(),null)
        }

        binding.imgFilter.setOnClickListener {
            navigateActivity(FilterActivity(),null)
        }
        binding.imgNotification.setOnClickListener {
            navigateActivity(NotificationActivity(),null)
        }
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.home -> {
                    binding.toolbar.visibility=View.VISIBLE
                    binding.imgSetting.visibility= View.GONE
                    binding.imgNotification.visibility= View.VISIBLE
                    binding.imgFilter.visibility= View.VISIBLE
                    binding.imgPlus.visibility= View.VISIBLE
                    binding.title.text= (getString(R.string.home))
                    setFragment(HomeFragment())
                    true
                }

                R.id.search -> {
                    binding.toolbar.visibility=View.VISIBLE
                    binding.imgPlus.visibility= View.GONE
                    binding.imgFilter.visibility= View.GONE
                    binding.title.text= (getString(R.string.search))
                    setFragment(SearchFragment())
                    true
                }

                R.id.chat -> {
                    binding.toolbar.visibility=View.VISIBLE
                    binding.imgPlus.visibility= View.GONE
                    binding.imgFilter.visibility= View.GONE
                    binding.title.text= (getString(R.string.message))
                    setFragment(MessageFragment())
                    true
                }
                R.id.calender -> {
                    binding.toolbar.visibility=View.GONE
                    binding.title.text= (getString(R.string.celendar))
                     setFragment(CalendarWeekFragment())
                    true
                }
                R.id.profile_navigation -> {
                    binding.toolbar.visibility=View.VISIBLE
                    binding.imgSetting.visibility= View.VISIBLE
                    binding.imgNotification.visibility= View.GONE
                    binding.imgFilter.visibility= View.GONE
                    binding.imgPlus.visibility= View.GONE
                    binding.title.text= (getString(R.string.profile))
                    setFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }

        if(getData(SessionManager.USER_IMAGE)!!.isNotBlank()) {
            Log.e("profile_image", getData(SessionManager.USER_IMAGE) + "")

            //val userProfileUrl ="http://54.190.192.105:6167/1653995551586-Screenshot_2022-05-28-14-49-45-954_com.whatsapp.jpg"
            binding.bottomNavigation.loadImage(
                getData(SessionManager.USER_IMAGE)!!, R.id.profile_navigation, R.drawable.ic_default_avatar
            )
        }

        else {
            var menuItem= bottomNavigationView.getMenu().findItem(R.id.profile_navigation)
            var firstletter= getData(SessionManager.FIRST_NAME)!!.get(0)

             menuItem?.setIcon(resources.getDrawable(R.drawable.ic_splash))
       }
    }

    override fun initListeners() {
        if(getData(SessionManager.USER_IMAGE)!!.isNotBlank()) {
            Log.e("profile_image", getData(SessionManager.USER_IMAGE) + "")

            binding.bottomNavigation.loadImage(
                getData(SessionManager.USER_IMAGE)!!, R.id.profile_navigation, R.drawable.ic_default_avatar
            )
        }
    }

    private fun setSelectionRoom() {
        val binding: SelectRoomLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.select_room_layout, null, false)
        binding?.svm = viewModel
       var selectRoomDialog = Dialog(this, R.style.DialogTheme)
        selectRoomDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        selectRoomDialog?.setContentView(binding.getRoot())
        selectRoomDialog?.window!!.setGravity(Gravity.BOTTOM)
        selectRoomDialog?.window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        binding.imgCancel.setOnClickListener {
            selectRoomDialog.dismiss()
        }
        binding.txPrivate.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "Private")
            navigateActivity(CreateEventActivity(),bundle)
            selectRoomDialog.dismiss()
        }
        binding.txPublic.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "Public")
            navigateActivity(CreateEventActivity(),bundle)
            selectRoomDialog.dismiss()
        }
        selectRoomDialog?.window!!.setBackgroundDrawableResource(R.color.black)
        selectRoomDialog.show()
    }

    fun setFragment(fr: Fragment) {
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.nav_fragment, fr)
        frag.commit()
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {
    }

    override fun itemAction(type: String?, position: Int) {
    }

    override fun onItemClick(view: View?, position: Int) {
        //  displayView(position)
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