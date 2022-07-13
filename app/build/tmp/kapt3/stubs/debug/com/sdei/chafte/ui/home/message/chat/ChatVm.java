package com.sdei.chafte.ui.home.message.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0013J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006/"}, d2 = {"Lcom/sdei/chafte/ui/home/message/chat/ChatVm;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "socketManager", "Lcom/sdei/chafte/utils/socket/SocketManager;", "(Landroid/app/Application;Lcom/sdei/chafte/utils/socket/SocketManager;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "(Landroid/app/Application;)V", "callSendMessage", "", "getCallSendMessage", "()Z", "setCallSendMessage", "(Z)V", "chatHeadID", "", "getChatHeadID", "()Ljava/lang/String;", "setChatHeadID", "(Ljava/lang/String;)V", "messageObservable", "Landroidx/databinding/ObservableField;", "getMessageObservable", "()Landroidx/databinding/ObservableField;", "progressObservable", "getProgressObservable", "receiver_id", "getReceiver_id", "setReceiver_id", "sender_id", "getSender_id", "setSender_id", "socketMng", "getSocketMng", "()Lcom/sdei/chafte/utils/socket/SocketManager;", "setSocketMng", "(Lcom/sdei/chafte/utils/socket/SocketManager;)V", "getChatHeadsId", "", "senderId", "receiverId", "getMessage", "sendMessage", "app_debug"})
public final class ChatVm extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.Nullable()
    private com.sdei.chafte.utils.socket.SocketManager socketMng;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> messageObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String chatHeadID = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String receiver_id = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sender_id = "";
    private boolean callSendMessage = false;
    
    public ChatVm(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.sdei.chafte.utils.socket.SocketManager socketManager) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProgressObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sdei.chafte.utils.socket.SocketManager getSocketMng() {
        return null;
    }
    
    public final void setSocketMng(@org.jetbrains.annotations.Nullable()
    com.sdei.chafte.utils.socket.SocketManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getMessageObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChatHeadID() {
        return null;
    }
    
    public final void setChatHeadID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiver_id() {
        return null;
    }
    
    public final void setReceiver_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSender_id() {
        return null;
    }
    
    public final void setSender_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCallSendMessage() {
        return false;
    }
    
    public final void setCallSendMessage(boolean p0) {
    }
    
    public final void getChatHeadsId(@org.jetbrains.annotations.NotNull()
    java.lang.String senderId, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverId) {
    }
    
    public final void getMessage() {
    }
    
    public final void sendMessage() {
    }
}