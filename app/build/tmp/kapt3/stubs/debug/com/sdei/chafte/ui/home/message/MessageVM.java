package com.sdei.chafte.ui.home.message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/sdei/chafte/ui/home/message/MessageVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "socketManager", "Lcom/sdei/chafte/utils/socket/SocketManager;", "(Landroid/app/Application;Lcom/sdei/chafte/utils/socket/SocketManager;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "(Landroid/app/Application;)V", "progressObservable", "Landroidx/databinding/ObservableField;", "", "getProgressObservable", "()Landroidx/databinding/ObservableField;", "socketMng", "getSocketMng", "()Lcom/sdei/chafte/utils/socket/SocketManager;", "setSocketMng", "(Lcom/sdei/chafte/utils/socket/SocketManager;)V", "getAllChatHeads", "", "userid", "", "app_debug"})
public final class MessageVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.Nullable()
    private com.sdei.chafte.utils.socket.SocketManager socketMng;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public MessageVM(@org.jetbrains.annotations.NotNull()
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
    
    public final void getAllChatHeads(@org.jetbrains.annotations.NotNull()
    java.lang.String userid) {
    }
}