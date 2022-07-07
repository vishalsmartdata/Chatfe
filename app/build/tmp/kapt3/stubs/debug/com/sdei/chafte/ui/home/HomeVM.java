package com.sdei.chafte.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u001fJ8\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011J\"\u0010+\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006J\u001e\u0010.\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0018\u00010\u0006J\u001e\u0010/\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u0017\u0018\u00010\u0006R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR2\u0010\u0014\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR2\u0010\u001a\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u0017\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b\u00a8\u00060"}, d2 = {"Lcom/sdei/chafte/ui/home/HomeVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "addRoomResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sdei/chafte/model/JoinData;", "getAddRoomResponse", "()Landroidx/lifecycle/MutableLiveData;", "setAddRoomResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "cancelRoomResponse", "", "getCancelRoomResponse", "setCancelRoomResponse", "categoryResponse", "Ljava/util/ArrayList;", "Lcom/sdei/chafte/model/CategoryData;", "Lkotlin/collections/ArrayList;", "getCategoryResponse", "setCategoryResponse", "roomResponse", "Lcom/sdei/chafte/model/RoomData;", "getRoomResponse", "setRoomResponse", "getAddRoom", "", "header", "user_id", "room_id", "getAllCategory", "getAllRoom", "authentication", "selected_category_id", "selected_start_time", "selected_sort_by", "selected_date", "free_on_calenndar", "getCancelRoom", "observerAddRoomResponse", "observerCancelRoomResponse", "observerCategoryResponse", "observerRoomResponse", "app_debug"})
public final class HomeVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> categoryResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.RoomData>> roomResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> addRoomResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> cancelRoomResponse;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public HomeVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> getCategoryResponse() {
        return null;
    }
    
    public final void setCategoryResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.RoomData>> getRoomResponse() {
        return null;
    }
    
    public final void setRoomResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.RoomData>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> getAddRoomResponse() {
        return null;
    }
    
    public final void setAddRoomResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCancelRoomResponse() {
        return null;
    }
    
    public final void setCancelRoomResponse(@org.jetbrains.annotations.Nullable()
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
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.JoinData> observerAddRoomResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerCancelRoomResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> observerCategoryResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.RoomData>> observerRoomResponse() {
        return null;
    }
    
    public final void getAllCategory() {
    }
    
    public final void getAllRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String selected_category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String selected_start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String selected_sort_by, @org.jetbrains.annotations.NotNull()
    java.lang.String selected_date, @org.jetbrains.annotations.NotNull()
    java.lang.String free_on_calenndar) {
    }
    
    public final void getAddRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String header, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String room_id) {
    }
    
    public final void getCancelRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String header, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String room_id) {
    }
}