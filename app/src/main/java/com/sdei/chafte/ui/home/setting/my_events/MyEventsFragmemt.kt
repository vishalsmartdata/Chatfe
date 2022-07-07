package com.sdei.chafte.ui.home.setting.my_events

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentEventFragmentBinding
import com.sdei.chafte.databinding.FragmentSettingBinding
import com.sdei.chafte.model.MyEventData
import com.sdei.chafte.model.RoomData
import com.sdei.chafte.ui.home.event_detail.EventDetailsActivity
import com.sdei.chafte.ui.home.setting.SettingActivity
import com.sdei.chafte.ui.home.setting.SettingVm
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager

class MyEventsFragmemt : BaseFragment<FragmentEventFragmentBinding, SettingVm>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_event_fragment
    override var viewModel: SettingVm
        get() = setUpVM(activity as SettingActivity, SettingVm(baseActivity.application,baseActivity.getData(
            SessionManager.AUTHENTICATION))
        )
        set(value) {}
    override var binding: FragmentEventFragmentBinding
        get() = setUpBinding()
        set(value) {}
    val roomList = ArrayList<MyEventData>()
    private val bindRoomList = RecyclerBindingList<MyEventData>()

    override fun bindData() {
        binding.meVM = viewModel
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })
        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
    }

    override fun initListeners(){
        binding.imgCancel.setOnClickListener {
            if (baseActivity.supportFragmentManager.backStackEntryCount > 1) {
                baseActivity.supportFragmentManager.popBackStack()
            } else {
                super.onBackPressed()
                baseActivity.finish()
            }
        }
        viewModel.getMyEventRoom(baseActivity.getData(SessionManager.AUTHENTICATION),baseActivity.getData(SessionManager.USER_ID))

        viewModel.observerRoomResponse()?.observe (this, Observer {
            roomList.clear()
            roomList.addAll(it)
            if(roomList.size==0){
                binding.txNodataFound.visibility= View.VISIBLE
            }else{
                binding.txNodataFound.visibility= View.GONE
            }
            bindRoomList.itemsList = roomList
            binding?.listItems = bindRoomList
            binding?.click = this
            Log.e("room_list",""+it.size)
        })
    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.clParent) {
            val bundle = Bundle()
            bundle.putString("key", "setting")
            bundle.putString("room_id", roomList[position]._id)
            baseActivity.navigateActivity(EventDetailsActivity(),bundle)
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}