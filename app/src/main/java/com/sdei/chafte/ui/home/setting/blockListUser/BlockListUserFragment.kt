package com.sdei.chafte.ui.home.setting.blockListUser

import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentBlockListUserBinding
import com.sdei.chafte.model.Data
import com.sdei.chafte.ui.home.setting.SettingActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager


class BlockListUserFragment : BaseFragment<FragmentBlockListUserBinding,BlockListVm>(),RecyclerCallback {

    var blockUserList = mutableListOf<Data>()
    override val layoutId: Int
        get() = R.layout.fragment_block_list_user
    override var viewModel: BlockListVm
        get() = setUpVM(activity as SettingActivity,BlockListVm(baseActivity.application,baseActivity.getData(SessionManager.AUTHENTICATION)))
        set(value) {}
    override var binding: FragmentBlockListUserBinding
        get() = setUpBinding()
        set(value) {}


    private val bindList = RecyclerBindingList<Data>()


    // lateinit var  context: Context?=null
/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_block_list_user, container, false)
    }
*/
    override fun bindData() {
    binding.blVM=viewModel
        viewModel.getBlockedUser()
        /*binding.txblock.setOnClickListener {
            viewModel.getUnblockListUser(baseActivity.getData(SessionManager.AUTHENTICATION).toString())
        }*/


   // context=this
    binding.imgCancel.setOnClickListener {
        if (baseActivity.supportFragmentManager.backStackEntryCount > 1) {
            baseActivity.supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
    }

    override fun onItemClick(view: View?, position: Int) {
        if (view?.id == R.id.txUnblock) {


            val blockId = blockUserList.get(position).blockUser?.Id
            Log.d("blockId", "onItemClick: $blockId")
            blockId?.let { viewModel.getUnblockListUser(it) }
            //bindList.notifyDataChange()



        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }

    override fun initListeners() {

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it, true)
        })

        viewModel.observerBlockListResponse()?.observe(this, androidx.lifecycle.Observer {

            blockUserList.addAll(it)
            bindList.itemsList = it
            binding.listItem = bindList
            binding.click = this
           // blockId=it[0].blockUser?.Id
            Log.e("BlockData",""+it.size)
           // bindList.notifyDataChange()
        })

        viewModel.observerUnBlockResponse()?.observe(this, androidx.lifecycle.Observer {
            showSnackBar(binding.root, it, false)
            Log.d(" UnBlockData",""+it)
        })
    }


}