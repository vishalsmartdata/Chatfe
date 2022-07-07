package com.sdei.chafte.ui.home.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0018\u00010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R2\u0010\t\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/sdei/chafte/ui/home/filter/FilterVm;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "categoryResponse", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/sdei/chafte/model/CategoryData;", "Lkotlin/collections/ArrayList;", "getCategoryResponse", "()Landroidx/lifecycle/MutableLiveData;", "setCategoryResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "dateObserver", "Landroidx/databinding/ObservableField;", "", "getDateObserver", "()Landroidx/databinding/ObservableField;", "progressObservable", "", "getProgressObservable", "getAllCategory", "", "observerCategoryResponse", "app_debug"})
public final class FilterVm extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> categoryResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> dateObserver = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public FilterVm(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProgressObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> getCategoryResponse() {
        return null;
    }
    
    public final void setCategoryResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDateObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.CategoryData>> observerCategoryResponse() {
        return null;
    }
    
    public final void getAllCategory() {
    }
}