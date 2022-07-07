package com.sdei.chafte.ui.home.search

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentSearchBinding
import com.sdei.chafte.databinding.RecentSearchLayoutBinding
import com.sdei.chafte.model.*
import com.sdei.chafte.pojoclasses.RecentRoomAddPojo
import com.sdei.chafte.pojoclasses.RecentUserAddPojo
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.event_detail.EventDetailsActivity
import com.sdei.chafte.ui.home.setting.my_events.ViewUserProfileActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.common.recyclerviewbase.PaginationScrollListener
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager


class SearchFragment : BaseFragment<FragmentSearchBinding, SearchVm>(), RecyclerCallback {
    override val layoutId: Int
        get() = R.layout.fragment_search
    override var viewModel: SearchVm
        get() = setUpVM(activity as HomeActivity, SearchVm(baseActivity.application))
        set(value) {}
    override var binding: FragmentSearchBinding
        get() = setUpBinding()
        set(value) {}

    val timelist = ArrayList<BottomMenu>()
    private val bindTimeList = RecyclerBindingList<BottomMenu>()
    var search_type = "Chat"
    val searchList = ArrayList<SearchData>()
    private val bindList = RecyclerBindingList<SearchData>()

    val recentSearchList = ArrayList<RecentSearchData>()
    private val bindRecentSearchList = RecyclerBindingList<RecentSearchData>()

    val peopleList = ArrayList<PeopleData>()
    private val bindPeopleList = RecyclerBindingList<PeopleData>()
    var totalcount = 10
    var page = 0

    override fun bindData() {
        binding.svm = viewModel

        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when (it) {
                true -> baseActivity.showProgress()
                false -> baseActivity.hideProgress()
            }
        })

    }

    override fun initListeners() {
        val timeMenuArray = resources.getStringArray(R.array.search_type)
        for (i in timeMenuArray.indices) {
            timelist.add(BottomMenu(timeMenuArray[i]))
            if (i == 0) {
                timelist[i].selected = true
            }
        }
        bindTimeList.itemsList = timelist
        binding.list = bindTimeList
        binding.click = this

        var isLastPage: Boolean = false
        var isLoading: Boolean = false

        viewModel.observerDeleteRecentResponse()?.observe(this, Observer {
            viewModel.getRecentSearch(baseActivity.getData(SessionManager.AUTHENTICATION))
        })

        viewModel.observerAddPeopleResponse()?.observe(this, Observer {
            val bundle = Bundle()
            bundle.putString("user_id", it)
            navigateActivity(ViewUserProfileActivity(), bundle)
        })

        viewModel.observerAddRoomResponse()?.observe(this, Observer {
            val bundle = Bundle()
            bundle.putString("key", "home")
            bundle.putString("room_id", it)
            baseActivity.navigateActivity(EventDetailsActivity(), bundle)
        })

        viewModel.observerRecentSearchResponse()?.observe(this, Observer {
            recentSearchList.clear()
            recentSearchList.addAll(it)
            if(recentSearchList.size>0){
                binding.txRecent.visibility=View.VISIBLE
                binding.view1.visibility=View.VISIBLE
                binding.recyclerViewItems.visibility=View.VISIBLE
            } else{
                binding.txRecent.visibility=View.GONE
                binding.view1.visibility=View.GONE
                binding.recyclerViewItems.visibility=View.GONE
            }
            bindRecentSearchList.itemsList = recentSearchList
            binding?.recentList = bindRecentSearchList
            binding?.click = this
        })

        viewModel.observerSearchResponse()?.observe(this, Observer {
            peopleList.clear()
            bindPeopleList.notifyDataChange()
            searchList.clear()
            searchList.addAll(it.data)
            bindList.itemsList = searchList
            binding?.searchlist = bindList
            binding?.click = this
            binding.txSearchtext.visibility = View.VISIBLE
            binding.recyclerViewSearch.visibility = View.VISIBLE
            binding.recyclerViewPeople.visibility = View.GONE
            totalcount = it.pageSize
            page = it.page
            isLoading = false


            var linerLayout = binding.recyclerViewSearch.layoutManager as LinearLayoutManager

            binding.recyclerViewSearch?.addOnScrollListener(object :
                PaginationScrollListener(linerLayout) {
                override fun isLastPage(): Boolean {
                    return isLastPage
                }

                override fun isLoading(): Boolean {
                    return isLoading
                }

                override fun loadMoreItems() {
                    isLoading = true
                    //you have to call loadmore items to get more data
                    if (binding.txSearch.text.toString()
                            .isNotEmpty() && !search_type.equals("People")
                    )
                        viewModel.getSearchRecords(
                            baseActivity.getData(SessionManager.AUTHENTICATION),
                            search_type,
                            binding.txSearch.text.toString(),
                            page.toString(),
                            totalcount.toString()
                        )

                    if (binding.txSearch.text.toString()
                            .isNotEmpty() && search_type.equals("People")
                    )
                        viewModel.getSearchPeople(
                            baseActivity.getData(SessionManager.AUTHENTICATION),
                            binding.txSearch.text.toString(),
                            page.toString(),
                            totalcount.toString()
                        )
                }

                override fun getTotalPageCount(): Int {
                    return totalcount
                }
            })


            var linerLayoutPeople = binding.recyclerViewPeople.layoutManager as LinearLayoutManager

            binding.recyclerViewPeople?.addOnScrollListener(object :
                PaginationScrollListener(linerLayoutPeople) {
                override fun isLastPage(): Boolean {
                    return isLastPage
                }

                override fun isLoading(): Boolean {
                    return isLoading
                }

                override fun loadMoreItems() {
                    isLoading = true
                    //you have to call loadmore items to get more data
                    if (binding.txSearch.text.toString()
                            .isNotEmpty() && !search_type.equals("People")
                    )
                        viewModel.getSearchRecords(
                            baseActivity.getData(SessionManager.AUTHENTICATION),
                            search_type,
                            binding.txSearch.text.toString(),
                            page.toString(),
                            totalcount.toString()
                        )

                    if (binding.txSearch.text.toString()
                            .isNotEmpty() && search_type.equals("People")
                    )
                        viewModel.getSearchPeople(
                            baseActivity.getData(SessionManager.AUTHENTICATION),
                            binding.txSearch.text.toString(),
                            page.toString(),
                            totalcount.toString()
                        )
                }

                override fun getTotalPageCount(): Int {
                    return totalcount
                }
            })
        })

        viewModel.observerPeopleResponse()?.observe(this, Observer {
            searchList.clear()
            bindList.notifyDataChange()
            peopleList.clear()
            peopleList.addAll(it.data)
            bindPeopleList.itemsList = peopleList
            binding?.peoplelist = bindPeopleList
            binding?.click = this
            binding.txSearchtext.visibility = View.VISIBLE
            binding.recyclerViewSearch.visibility = View.GONE
            binding.recyclerViewPeople.visibility = View.VISIBLE

            totalcount = it.pageSize
            page = it.page
        })

        binding.txSearch.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                totalcount = 10
                page = 0
                if (binding.txSearch.text.toString().isNotEmpty() && !search_type.equals("People"))
                    viewModel.getSearchRecords(
                        baseActivity.getData(SessionManager.AUTHENTICATION),
                        search_type,
                        binding.txSearch.text.toString(),
                        page.toString(),
                        totalcount.toString()
                    )

                if (binding.txSearch.text.toString().isNotEmpty() && search_type.equals("People"))
                    viewModel.getSearchPeople(
                        baseActivity.getData(SessionManager.AUTHENTICATION),
                        binding.txSearch.text.toString(),
                        page.toString(),
                        totalcount.toString()
                    )

                return@OnEditorActionListener true
            }
            false
        })

        viewModel.getRecentSearch(baseActivity.getData(SessionManager.AUTHENTICATION))
    }


override fun onItemClick(view: View?, position: Int) {
    if (view?.id == R.id.lnTimeItem) {
        for (i in timelist.indices) {
            if (position == i) {
                timelist[i].selected = true
            } else {
                timelist[i].selected = false
            }
        }
        bindTimeList.notifyDataChange()
        search_type = timelist[position].title
        if (search_type.equals("Chat Room")) {
            search_type = "Chat"
        }
        if (binding.txSearch.text.toString().isNotEmpty() && !search_type.equals("People")) {
            totalcount = 10
            page = 0
            viewModel.getSearchRecords(
                baseActivity.getData(SessionManager.AUTHENTICATION),
                search_type,
                binding.txSearch.text.toString(),
                page.toString(),
                totalcount.toString()
            )
        }

        if (binding.txSearch.text.toString().isNotEmpty() && search_type.equals("People")) {
            totalcount = 10
            page = 0
            viewModel.getSearchPeople(
                baseActivity.getData(SessionManager.AUTHENTICATION),
                binding.txSearch.text.toString(),
                page.toString(),
                totalcount.toString()
            )
        }

    }
    if (view?.id == R.id.searchLt) {
        var recentUserAddPojo= RecentRoomAddPojo(searchList[position]._id,searchList[position].endDate,searchList[position].endTime,searchList[position].image,searchList[position].roomName,searchList[position].startDate,searchList[position].startTime,searchList[position].roomClass)
        viewModel.getAddSearchRoom(baseActivity.getData(SessionManager.AUTHENTICATION),recentUserAddPojo)
    }
    if (view?.id == R.id.peopleLt) {
        var recentUserAddPojo= RecentUserAddPojo(peopleList[position]._id,peopleList[position].fname,peopleList[position].profileImg.image,peopleList[position].lname,"User")
        viewModel.getAddSearchPeople(baseActivity.getData(SessionManager.AUTHENTICATION),recentUserAddPojo)
    }
    if (view?.id == R.id.imgCancelItem) {
        viewModel.getDeleteSearchRoom(baseActivity.getData(SessionManager.AUTHENTICATION),recentSearchList[position]._id)
    }
}

override fun onChildItemClick(view: View?, parentIndex: Int, childIndex: Int) {
    Log.e("onChildItemClick", parentIndex.toString())
}

override fun itemAction(type: String?, position: Int) {
    Log.e("itemAction", position.toString())
}
}