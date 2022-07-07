package com.sdei.chafte.ui.home.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u0011J\u0018\u0010 \u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u0011J\u0010\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006J\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/sdei/chafte/ui/home/notification/NotificationVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "addRoomResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sdei/chafte/model/JoinData;", "getAddRoomResponse", "()Landroidx/lifecycle/MutableLiveData;", "setAddRoomResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "requestResponse", "", "getRequestResponse", "setRequestResponse", "userFriendRequest", "Lcom/sdei/chafte/model/NotificationData;", "getUserFriendRequest", "setUserFriendRequest", "getAcceptRequest", "", "authentication", "_id", "getAddRoom", "header", "user_id", "room_id", "getRejectRequest", "getUserRequets", "observerAddRoomResponse", "observerRequestResponse", "observerUserRequestResponse", "app_debug"})
public final class NotificationVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.NotificationData> userFriendRequest;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> requestResponse;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> addRoomResponse;
    
    public NotificationVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.NotificationData> getUserFriendRequest() {
        return null;
    }
    
    public final void setUserFriendRequest(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.NotificationData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRequestResponse() {
        return null;
    }
    
    public final void setRequestResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> getAddRoomResponse() {
        return null;
    }
    
    public final void setAddRoomResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> observerAddRoomResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerRequestResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.NotificationData> observerUserRequestResponse() {
        return null;
    }
    
    public final void getUserRequets(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication) {
    }
    
    public final void getAcceptRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String _id) {
    }
    
    public final void getRejectRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String _id) {
    }
    
    public final void getAddRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String header, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String room_id) {
    }
}