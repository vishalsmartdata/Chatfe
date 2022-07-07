package com.sdei.chafte.ui.home.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u001a\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u0013H\u0016J\"\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H\u0016J\u001a\u0010.\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020\u0013H\u0016J\b\u0010/\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020#H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/sdei/chafte/ui/home/notification/NotificationActivity;", "Lcom/sdei/chafte/utils/base/BaseActivity;", "Lcom/sdei/chafte/databinding/ActivityNotificationBinding;", "Lcom/sdei/chafte/ui/home/notification/NotificationVM;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "bindList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/FriendResult;", "bindPrivateRoomList", "Lcom/sdei/chafte/model/PrivateRoomResult;", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/ActivityNotificationBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "layoutId", "", "getLayoutId", "()I", "privateRoomList", "Ljava/util/ArrayList;", "getPrivateRoomList", "()Ljava/util/ArrayList;", "userList", "getUserList", "value", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/notification/NotificationVM;", "setViewModel", "(Lcom/sdei/chafte/ui/home/notification/NotificationVM;)V", "bindData", "", "initListeners", "itemAction", "type", "", "position", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onItemClick", "openSettings", "requestCalendarPermission", "it", "Lcom/sdei/chafte/model/JoinData;", "showSettingsDialog", "app_debug"})
public final class NotificationActivity extends com.sdei.chafte.utils.base.BaseActivity<com.sdei.chafte.databinding.ActivityNotificationBinding, com.sdei.chafte.ui.home.notification.NotificationVM> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.FriendResult> bindList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.FriendResult> userList = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.PrivateRoomResult> bindPrivateRoomList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.PrivateRoomResult> privateRoomList = null;
    private java.util.HashMap _$_findViewCache;
    
    public NotificationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.ActivityNotificationBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.notification.NotificationVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.notification.NotificationVM value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.FriendResult> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.PrivateRoomResult> getPrivateRoomList() {
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
    
    private final void requestCalendarPermission(com.sdei.chafte.model.JoinData it) {
    }
    
    private final void showSettingsDialog() {
    }
    
    private final void openSettings() {
    }
}