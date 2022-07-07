package com.sdei.chafte.ui.home.setting.friendlist

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentViewFriendlistBinding
import com.sdei.chafte.databinding.FragmentViewProfileBinding
import com.sdei.chafte.model.FriendsArr
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.ui.home.setting.my_events.ViewUserProfileActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.getCalculatedAge
import com.sdei.chafte.utils.getDateShow
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso

class FriendListActivity : BaseActivity<FragmentViewFriendlistBinding, SettingVm>(),
    RecyclerCallback {
    override val binding: FragmentViewFriendlistBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.fragment_view_friendlist
    override var viewModel: SettingVm
        get() = setUpVM(
            this,
            SettingVm(application,getData(SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override val context: Context
        get() = this

    var friendListArrayList = ArrayList<FriendsArr>()
    val bindingFriendListList = RecyclerBindingList<FriendsArr>()

    override fun bindData() {
        binding.flVM = viewModel
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    showProgress()
                false ->   hideProgress()
            }
        })
        friendListArrayList.clear()
        friendListArrayList = intent.getSerializableExtra("friend_list") as ArrayList<FriendsArr>
        bindingFriendListList.itemsList = friendListArrayList
        binding?.friendlist = bindingFriendListList
        binding?.click = this

    }

    override fun initListeners() {

        binding.imageBack.setOnClickListener {
            if (supportFragmentManager.backStackEntryCount > 1) {
                supportFragmentManager.popBackStack()
            } else {
                super.onBackPressed()
                finish()
            }
        }


    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.clFriendList) {
            val bundle = Bundle()
            bundle.putString("user_id", friendListArrayList[position]._id)
            navigateActivity(ViewUserProfileActivity(),bundle)
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}