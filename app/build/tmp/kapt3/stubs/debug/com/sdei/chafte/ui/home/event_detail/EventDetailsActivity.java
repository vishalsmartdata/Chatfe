package com.sdei.chafte.ui.home.event_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\u001a\u00100\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u00010\u001b2\u0006\u00102\u001a\u00020\u0017H\u0016J\"\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0016J\u001a\u00108\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00102\u001a\u00020\u0017H\u0016J\b\u00109\u001a\u00020.H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006:"}, d2 = {"Lcom/sdei/chafte/ui/home/event_detail/EventDetailsActivity;", "Lcom/sdei/chafte/utils/base/BaseActivity;", "Lcom/sdei/chafte/databinding/ActivityEventDetailsBinding;", "Lcom/sdei/chafte/ui/home/event_detail/EventDetailVm;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "bindList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/UserData;", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/ActivityEventDetailsBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "hasRoomJoin", "", "getHasRoomJoin", "()Z", "setHasRoomJoin", "(Z)V", "layoutId", "", "getLayoutId", "()I", "room_id", "", "getRoom_id", "()Ljava/lang/String;", "setRoom_id", "(Ljava/lang/String;)V", "room_type", "getRoom_type", "setRoom_type", "userList", "Ljava/util/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "value", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/event_detail/EventDetailVm;", "setViewModel", "(Lcom/sdei/chafte/ui/home/event_detail/EventDetailVm;)V", "bindData", "", "initListeners", "itemAction", "type", "position", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onItemClick", "setSelectionOption", "app_debug"})
public final class EventDetailsActivity extends com.sdei.chafte.utils.base.BaseActivity<com.sdei.chafte.databinding.ActivityEventDetailsBinding, com.sdei.chafte.ui.home.event_detail.EventDetailVm> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String room_type = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String room_id = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.UserData> userList = null;
    private boolean hasRoomJoin = false;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.UserData> bindList = null;
    private java.util.HashMap _$_findViewCache;
    
    public EventDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.ActivityEventDetailsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.event_detail.EventDetailVm getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.event_detail.EventDetailVm value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoom_type() {
        return null;
    }
    
    public final void setRoom_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoom_id() {
        return null;
    }
    
    public final void setRoom_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.UserData> getUserList() {
        return null;
    }
    
    public final boolean getHasRoomJoin() {
        return false;
    }
    
    public final void setHasRoomJoin(boolean p0) {
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    public void initListeners() {
    }
    
    private final void setSelectionOption() {
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