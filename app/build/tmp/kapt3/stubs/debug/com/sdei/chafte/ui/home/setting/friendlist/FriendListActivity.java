package com.sdei.chafte.ui.home.setting.friendlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u001a\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u0019H\u0016J\"\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0019H\u0016J\u001a\u0010.\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006/"}, d2 = {"Lcom/sdei/chafte/ui/home/setting/friendlist/FriendListActivity;", "Lcom/sdei/chafte/utils/base/BaseActivity;", "Lcom/sdei/chafte/databinding/FragmentViewFriendlistBinding;", "Lcom/sdei/chafte/ui/home/setting/SettingVm;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/FragmentViewFriendlistBinding;", "bindingFriendListList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/FriendsArr;", "getBindingFriendListList", "()Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "friendListArrayList", "Ljava/util/ArrayList;", "getFriendListArrayList", "()Ljava/util/ArrayList;", "setFriendListArrayList", "(Ljava/util/ArrayList;)V", "layoutId", "", "getLayoutId", "()I", "value", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/setting/SettingVm;", "setViewModel", "(Lcom/sdei/chafte/ui/home/setting/SettingVm;)V", "bindData", "", "initListeners", "itemAction", "type", "", "position", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onItemClick", "app_debug"})
public final class FriendListActivity extends com.sdei.chafte.utils.base.BaseActivity<com.sdei.chafte.databinding.FragmentViewFriendlistBinding, com.sdei.chafte.ui.home.setting.SettingVm> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.sdei.chafte.model.FriendsArr> friendListArrayList;
    @org.jetbrains.annotations.NotNull()
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.FriendsArr> bindingFriendListList = null;
    private java.util.HashMap _$_findViewCache;
    
    public FriendListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.FragmentViewFriendlistBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.setting.SettingVm getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.setting.SettingVm value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.FriendsArr> getFriendListArrayList() {
        return null;
    }
    
    public final void setFriendListArrayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sdei.chafte.model.FriendsArr> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.FriendsArr> getBindingFriendListList() {
        return null;
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    public void initListeners() {
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