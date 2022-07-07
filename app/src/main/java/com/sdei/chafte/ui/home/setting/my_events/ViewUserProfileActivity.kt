package com.sdei.chafte.ui.home.setting.my_events

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentViewProfileBinding
import com.sdei.chafte.model.FriendsArr
import com.sdei.chafte.model.UserFriendsArr
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.ui.home.setting.friendlist.FriendListActivity
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.getCalculatedAge
import com.sdei.chafte.utils.getDateShow
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import com.squareup.picasso.Picasso

class ViewUserProfileActivity : BaseActivity<FragmentViewProfileBinding, SettingVm>(),
    RecyclerCallback {
    override val binding: FragmentViewProfileBinding
        get() = setUpBinding()
    override val layoutId: Int
        get() = R.layout.fragment_view_profile
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

    var user_id=""
    var isFriendRequest=false


    override fun bindData() {
        binding.vpVM = viewModel
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    showProgress()
                false ->   hideProgress()
            }
        })
        user_id= getIntent().getStringExtra("user_id")!!
        viewModel.getProfile(getData(SessionManager.AUTHENTICATION), user_id)
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
        binding.imgAddFriend.setOnClickListener {
            if(!isFriendRequest)
            viewModel.getSendRequest(getData(SessionManager.AUTHENTICATION),user_id,getData(SessionManager.USER_ID)!!)
        }

        viewModel.observerUserProfileResponse()?.observe (this, Observer {
            Log.e("response_id",""+it._id)
            friendListArrayList.clear()
            friendListArrayList.addAll(it.friendsArr)

            bindingFriendListList.itemsList = friendListArrayList
            binding?.friendlist = bindingFriendListList
            binding?.click = this

            if(friendListArrayList.size==0){
                binding.txFriends.visibility=View.GONE
                binding.txViewFriends.visibility=View.GONE
            }

            Picasso.get()
                .load(it.profileImg.image)
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.imProfile)

            binding.txHeader.setText(it.fname)
            binding.txHeaderLast.setText(it.lname)
            if(it.aboutYourself.isNotEmpty() &&  it.aboutYourself.isNotBlank())
             //   binding.txAboutText.setText(it.about)
                Picasso.get()
                    .load(it.drink.image)
                    .error(R.drawable.ic_launcher_background)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(binding.imageDrink)
            binding.txDrinkName.setText(it.drink.drinkName)
            binding.txInterest.setText(it.dating.datings)
            binding.txIndentify.setText(it.gender.gen)
            binding.txHometown.setText(it.hometown.homeTown)

             isFriendRequest= it.isFriendRequest
            if(it.isFriendRequest){
                binding.imgAddFriend.setImageDrawable(getDrawable(R.drawable.ic_add_friend_blue))
            }else{
                binding.imgAddFriend.setImageDrawable(getDrawable(R.drawable.ic_add_friend_white))
            }

            var select_date= getDateShow(it.dob.birthdate)
            Log.e("selected_date",select_date.toString())
            var date= select_date?.split("-")?.toTypedArray()
            var year= date?.get(2)
            var month= date?.get(1)
            var days= date?.get(0)
            var age= getCalculatedAge(year!!.toInt(), month!!.toInt(), days!!.toInt())
            if(age!!.toInt() <= 0){
                age=month
                binding.txAge.setText(age + " Months")
            }else {
                binding.txAge.setText(age)
            }
        })

        viewModel.observerFriendRequestResponse()?.observe (this, Observer {
            showSnackBar(binding.root, it.toString(), false)
            viewModel.getProfile(getData(SessionManager.AUTHENTICATION), user_id)
           /* isFriendRequest=true
                binding.imgAddFriend.setImageDrawable(getDrawable(R.drawable.ic_add_friend_white))*/
        })

        binding.txViewFriends.setOnClickListener {
            val resultIntent = Intent(this, FriendListActivity::class.java)
            resultIntent.putParcelableArrayListExtra("friend_list", friendListArrayList as ArrayList<out Parcelable?>?)
            startActivity(resultIntent)
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