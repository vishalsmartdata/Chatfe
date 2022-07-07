package com.sdei.chafte.ui.home.filter

import android.app.DatePickerDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdei.chafte.R
import com.sdei.chafte.databinding.ActivityFilterBinding
import com.sdei.chafte.databinding.FragmentCompleteRegistrationBinding
import com.sdei.chafte.model.BottomMenu
import com.sdei.chafte.model.CategoryData
import com.sdei.chafte.model.RoomData
import com.sdei.chafte.ui.authentication.AuthenticationActivity
import com.sdei.chafte.ui.authentication.registration.RegistrationVM
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.HomeVM
import com.sdei.chafte.utils.base.BaseActivity
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import java.util.*
import kotlin.collections.ArrayList

class FilterActivity  : BaseActivity<ActivityFilterBinding, FilterVm>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.activity_filter
    override var viewModel: FilterVm
        get() = setUpVM(this, FilterVm(application))
        set(value) {}
    override var binding: ActivityFilterBinding
        get() = setUpBinding()
        set(value) {}

    val categorylist = ArrayList<CategoryData>()
    val timelist = ArrayList<BottomMenu>()
    val sortlist = ArrayList<BottomMenu>()

    private val bindList = RecyclerBindingList<CategoryData>()
    private val bindTimeList = RecyclerBindingList<BottomMenu>()
    private val bindSortList = RecyclerBindingList<BottomMenu>()

    var selected_category_id =""
    var selected_start_time =""
    var selected_sort_by =""
    var selected_date=""

    override fun bindData() {
        binding.faVM = viewModel
    }

    override fun initListeners() {
        viewModel.getAllCategory()
        val timeMenuArray = resources.getStringArray(R.array.time_array)
        for (i in timeMenuArray.indices) {
            timelist.add(BottomMenu(timeMenuArray[i]))
        }
        bindTimeList.itemsList = timelist
        binding.timelist = bindTimeList
        binding.click = this

        val sortArray = resources.getStringArray(R.array.sort_array)
        for (i in sortArray.indices) {
            sortlist.add(BottomMenu(sortArray[i]))
        }
        bindSortList.itemsList = sortlist
        binding.sortlist = bindSortList
        binding.click = this

        binding.txDateSelected.setOnClickListener {
            val calendar= Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener
            { view, year, monthOfYear, dayOfMonth ->
                var date="" + year+"-"+(monthOfYear+1) + "-" + dayOfMonth
                binding.txDateSelected.setText(date)
                 selected_date=date
                //showTime(date)
            }, year, month, day)
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show()
        }


        viewModel.observerCategoryResponse()?.observe (this, Observer {
            categorylist.addAll(it)
            bindList.itemsList = categorylist
            binding?.list = bindList
            binding?.click = this
            binding.recyclerView.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL ,false)
            binding.recyclerView.isHorizontalScrollBarEnabled=true
            Log.e("category_list",""+it.size)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    showProgress()
                false ->   hideProgress()
            }
        })

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        binding.txSubmit.setOnClickListener {

            var free_on_calnedar=false
           if(binding.chCalendar.isChecked){
               free_on_calnedar=true
           }
            val bundle = Bundle()
            bundle.putString("key", "filter")
            bundle.putString("category_id", selected_category_id)
            bundle.putString("start_time", selected_start_time)
            bundle.putString("sort_id", selected_sort_by)
            bundle.putString("date", selected_date)
            bundle.putString("free_on_Calendar", free_on_calnedar.toString())
            navigateActivity(HomeActivity(),bundle)
        }

        binding.imgCancel.setOnClickListener {
           /* val bundle = Bundle()
            bundle.putString("key", "login")
            navigateActivity(HomeActivity(),bundle)*/
            finish()
        }


    }

    override val context: Context
        get() = this

    override fun onItemClick(view: View?, position: Int) {
        if(view?.id== R.id.parentItem) {
            for (i in categorylist.indices) {
                if(position==i){
                    categorylist[i].selected=true
                }else {
                    categorylist[i].selected=false
                }
            }
            bindList.notifyDataChange()
            selected_category_id = categorylist[position]._id
        }
        else if(view?.id== R.id.lnTimeItem) {
            for (i in timelist.indices) {
                if(position==i){
                    timelist[i].selected=true
                }else {
                    timelist[i].selected=false
                }
            }
            bindTimeList.notifyDataChange()
            selected_start_time = timelist[position].title
        }
        else if(view?.id== R.id.lnSortItem) {
            for (i in sortlist.indices) {
                if(position==i){
                    sortlist[i].selected=true
                }else {
                    sortlist[i].selected=false
                }
            }
            bindSortList.notifyDataChange()
            selected_sort_by = sortlist[position].title
        }
    }

    override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {

    }

    override fun itemAction(type: String?, position: Int) {

    }


}