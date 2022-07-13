package com.sdei.chafte.ui.home.message.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u001a\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u001aH\u0016J\b\u0010.\u001a\u00020(H\u0016J\"\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001aH\u0016J\u001a\u00104\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u000207H\u0007J\b\u00108\u001a\u00020(H\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00168TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00069"}, d2 = {"Lcom/sdei/chafte/ui/home/message/chat/ChatActivity;", "Lcom/sdei/chafte/utils/base/BaseActivity;", "Lcom/sdei/chafte/databinding/ActivityChatBinding;", "Lcom/sdei/chafte/ui/home/message/chat/ChatVm;", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerCallback;", "()V", "bindList", "Lcom/sdei/chafte/utils/common/recyclerviewbase/RecyclerBindingList;", "Lcom/sdei/chafte/model/ReceiveMessageModelItem;", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/ActivityChatBinding;", "callgetAllMessage", "", "getCallgetAllMessage", "()Z", "setCallgetAllMessage", "(Z)V", "callgetChatHeaderId", "getCallgetChatHeaderId", "setCallgetChatHeaderId", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "layoutId", "", "getLayoutId", "()I", "receiverMessageModelItem", "Ljava/util/ArrayList;", "getReceiverMessageModelItem", "()Ljava/util/ArrayList;", "value", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/home/message/chat/ChatVm;", "setViewModel", "(Lcom/sdei/chafte/ui/home/message/chat/ChatVm;)V", "bindData", "", "initListeners", "itemAction", "type", "", "position", "onBackPressed", "onChildItemClick", "view", "Landroid/view/View;", "parentIndex", "childIndex", "onItemClick", "onMessageEvent", "event", "Lcom/sdei/chafte/utils/socket/MessageEvent;", "onStop", "app_debug"})
public final class ChatActivity extends com.sdei.chafte.utils.base.BaseActivity<com.sdei.chafte.databinding.ActivityChatBinding, com.sdei.chafte.ui.home.message.chat.ChatVm> implements com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.sdei.chafte.model.ReceiveMessageModelItem> receiverMessageModelItem = null;
    private final com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<com.sdei.chafte.model.ReceiveMessageModelItem> bindList = null;
    private boolean callgetAllMessage = false;
    private boolean callgetChatHeaderId = false;
    private java.util.HashMap _$_findViewCache;
    
    public ChatActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.ActivityChatBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.home.message.chat.ChatVm getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.home.message.chat.ChatVm value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sdei.chafte.model.ReceiveMessageModelItem> getReceiverMessageModelItem() {
        return null;
    }
    
    public final boolean getCallgetAllMessage() {
        return false;
    }
    
    public final void setCallgetAllMessage(boolean p0) {
    }
    
    public final boolean getCallgetChatHeaderId() {
        return false;
    }
    
    public final void setCallgetChatHeaderId(boolean p0) {
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    public void initListeners() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
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