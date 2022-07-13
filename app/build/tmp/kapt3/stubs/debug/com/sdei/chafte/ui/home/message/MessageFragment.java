package com.sdei.chafte.ui.home.message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0014J\u001a\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u0016H\u0016J\"\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020#H\u0016J\u001a\u0010/\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Lcom/sdei/chafte/ui/home/message/MessageFragment;", "Lcom/sdei/chafte/utils/base/BaseFragment;", "Lcom/sdei/chafte/databinding/FragmentMessageBinding;", "Lcom/sdei/chafte/ui/home/message/MessageVM;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "bindList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/RecentSuggestion;", "value", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/FragmentMessageBinding;", "setBinding", "(Lcom/sdei/chafte/databinding/FragmentMessageBinding;)V", "eventListen", "", "getEventListen", "()Z", "setEventListen", "(Z)V", "layoutId", "", "getLayoutId", "()I", "recentSuggestion", "Ljava/util/ArrayList;", "getRecentSuggestion", "()Ljava/util/ArrayList;", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/message/MessageVM;", "setViewModel", "(Lcom/sdei/chafte/ui/home/message/MessageVM;)V", "bindData", "", "initListeners", "itemAction", "type", "", "position", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onDestroyView", "onItemClick", "onMessageEvent", "event", "Lcom/sdei/chafte/utils/socket/MessageEvent;", "app_debug"})
public final class MessageFragment extends com.sdei.chafte.utils.base.BaseFragment<com.sdei.chafte.databinding.FragmentMessageBinding, com.sdei.chafte.ui.home.message.MessageVM> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    private boolean eventListen = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.RecentSuggestion> recentSuggestion = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.RecentSuggestion> bindList = null;
    private java.util.HashMap _$_findViewCache;
    
    public MessageFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.message.MessageVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.message.MessageVM value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.FragmentMessageBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setBinding(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.databinding.FragmentMessageBinding value) {
    }
    
    public final boolean getEventListen() {
        return false;
    }
    
    public final void setEventListen(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.RecentSuggestion> getRecentSuggestion() {
        return null;
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.utils.socket.MessageEvent event) {
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