package com.sdei.chafte.ui.home.message

import android.os.Bundle
import android.util.Log
import android.view.View
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentMessageBinding
import com.sdei.chafte.databinding.FragmentSearchBinding
import com.sdei.chafte.model.CategoryData
import com.sdei.chafte.model.RecentSuggestion
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordActivity
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.message.chat.ChatActivity
import com.sdei.chafte.ui.home.search.SearchVm
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.chafte.utils.socket.MessageEvent
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.json.JSONObject
import org.intellij.lang.annotations.Language
import org.json.JSONArray
import java.util.*
import kotlin.collections.ArrayList


class MessageFragment : BaseFragment<FragmentMessageBinding, MessageVM>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_message
    override var viewModel: MessageVM
        get() = setUpVM(activity as HomeActivity, MessageVM(baseActivity.application,baseActivity.initialSocket()))
        set(value) {}
    override var binding: FragmentMessageBinding
        get() = setUpBinding()
        set(value) {}

    var eventListen=false

    val recentSuggestion = ArrayList<RecentSuggestion>()
    private val bindList = RecyclerBindingList<RecentSuggestion>()

    override fun bindData() {
        binding.mvm = viewModel
    }

    override fun initListeners() {
        eventListen=true
        viewModel.getAllChatHeads(baseActivity.getData(SessionManager.USER_ID)!!)
        EventBus.getDefault().register(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        if (event.type.equals("getAllChatHeads")) {
            if (eventListen) {
                eventListen = false
            try {
                var jsonObject = JSONObject(event.message)
                var recentConnection = jsonObject.getJSONArray("recentSuggestions")
                if (recentConnection != null) {
                        val mapper = ObjectMapper().registerModule(KotlinModule())
                        try {
                            val recentConnect: ArrayList<RecentSuggestion> = mapper.readValue(recentConnection.toString())
                            recentSuggestion.addAll(recentConnect)
                        } catch (e: java.lang.Exception) {
                            e.printStackTrace()
                        }
                        //val jsonObject: JSONObject = recentConnection.getJSONObject(i)
                        //  recentSuggestion.add(recentConnection.get(i))
                }

                Log.e("recentSuggestion", " " + recentSuggestion.size + " ")
                //   recentSuggestion.addAll(recentConnection)
                bindList.itemsList = recentSuggestion
                binding?.list = bindList
                binding?.click = this
            } catch (ex: Exception) {
                Log.v("TEST", "Exception1: " + ex.message)
            }
           }
        }
    }

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id == R.id.clRecentConnect){
           /* val bundle = Bundle()
            bundle.putString("key", "About")
            navigateActivity(ChatActivity(),bundle)*/
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }
}