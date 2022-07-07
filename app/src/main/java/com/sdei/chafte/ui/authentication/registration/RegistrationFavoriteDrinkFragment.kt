package com.sdei.chafte.ui.authentication.registration

import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentRegistrationFouthpageBinding
import com.sdei.chafte.model.DrinkModel
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback

class RegistrationFavoriteDrinkFragment  : BaseFragment<FragmentRegistrationFouthpageBinding, RegistrationVM>() ,
    RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_registration_fouthpage
    override var viewModel: RegistrationVM
        get() = setUpVM(activity as RegistrationActivity, RegistrationVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentRegistrationFouthpageBinding
        get() = setUpBinding()
        set(value) {}

    var arrayList = ArrayList<DrinkModel>()

    override fun bindData() {
        binding.vm = viewModel
    }

    override fun initListeners() {

      //  binding.recyclerDrink.layoutManager = LinearLayoutManager(baseActivity.mContext, LinearLayoutManager.HORIZONTAL ,true)

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })


        viewModel.observerDrinkResponse()?.observe (this, Observer {
            val bindingList = RecyclerBindingList<DrinkModel>()
            arrayList.addAll(it)
            bindingList.itemsList = arrayList
            binding?.list = bindingList
            binding?.click = this
            Log.e("drinkData",""+it.size)
        })

        viewModel.getAllDrink()

    }

    override fun onItemClick(view: View?, position: Int) {
        if (view?.id == R.id.clParent) {
            viewModel.drinkObserver.set(arrayList.get(position)._id)
            viewModel.buttonClickForNext(0)
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {
    }

    override fun itemAction(type: String?, position: Int) {
    }
}