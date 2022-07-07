package com.sdei.chafte.ui.home.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u000206H\u0014J\u001a\u00108\u001a\u0002062\b\u00109\u001a\u0004\u0018\u00010&2\u0006\u0010:\u001a\u00020\u0016H\u0016J\"\u0010;\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0016H\u0016J\u001a\u0010@\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010:\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u001a\u0010-\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001cR$\u00100\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006A"}, d2 = {"Lcom/sdei/chafte/ui/home/search/SearchFragment;", "Lcom/sdei/chafte/utils/base/BaseFragment;", "Lcom/sdei/chafte/databinding/FragmentSearchBinding;", "Lcom/sdei/chafte/ui/home/search/SearchVm;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "bindList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/SearchData;", "bindPeopleList", "Lcom/sdei/chafte/model/PeopleData;", "bindRecentSearchList", "Lcom/sdei/chafte/model/RecentSearchData;", "bindTimeList", "Lcom/sdei/chafte/model/BottomMenu;", "value", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/FragmentSearchBinding;", "setBinding", "(Lcom/sdei/chafte/databinding/FragmentSearchBinding;)V", "layoutId", "", "getLayoutId", "()I", "page", "getPage", "setPage", "(I)V", "peopleList", "Ljava/util/ArrayList;", "getPeopleList", "()Ljava/util/ArrayList;", "recentSearchList", "getRecentSearchList", "searchList", "getSearchList", "search_type", "", "getSearch_type", "()Ljava/lang/String;", "setSearch_type", "(Ljava/lang/String;)V", "timelist", "getTimelist", "totalcount", "getTotalcount", "setTotalcount", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/search/SearchVm;", "setViewModel", "(Lcom/sdei/chafte/ui/home/search/SearchVm;)V", "bindData", "", "initListeners", "itemAction", "type", "position", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onItemClick", "app_debug"})
public final class SearchFragment extends com.sdei.chafte.utils.base.BaseFragment<com.sdei.chafte.databinding.FragmentSearchBinding, com.sdei.chafte.ui.home.search.SearchVm> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.BottomMenu> timelist = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.BottomMenu> bindTimeList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String search_type = "Chat";
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.SearchData> searchList = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.SearchData> bindList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.RecentSearchData> recentSearchList = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.RecentSearchData> bindRecentSearchList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.PeopleData> peopleList = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.PeopleData> bindPeopleList = null;
    private int totalcount = 10;
    private int page = 0;
    private java.util.HashMap _$_findViewCache;
    
    public SearchFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.search.SearchVm getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.search.SearchVm value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setBinding(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.databinding.FragmentSearchBinding value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.BottomMenu> getTimelist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearch_type() {
        return null;
    }
    
    public final void setSearch_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.SearchData> getSearchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.RecentSearchData> getRecentSearchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.PeopleData> getPeopleList() {
        return null;
    }
    
    public final int getTotalcount() {
        return 0;
    }
    
    public final void setTotalcount(int p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, int position) {
    }
    
    @java.lang.Override()
    public void onChildItemClick(@org.jetbrains.annotations.Nullable()
    android.view.View view, int parentIndex, int childIndex) {
    }
    
    @java.lang.Override()
    public void itemAction(@org.jetbrains.annotations.Nullable()
    java.lang.String type, int position) {
    }
}