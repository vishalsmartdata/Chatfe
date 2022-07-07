package com.sdei.chafte.utils.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/sdei/chafte/utils/base/BaseApplication;", "Landroid/app/Application;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver$ConnectivityReceiverListener;", "()V", "onCreate", "", "onEnterBackground", "onEnterForeground", "onNetworkConnectionChanged", "isConnected", "", "scheduleJob", "startConnectivityService", "stopConnectivityService", "app_debug"})
public final class BaseApplication extends android.app.Application implements androidx.lifecycle.LifecycleObserver, com.sdei.chafte.repository.networkcheck.ConnectivityReceiver.ConnectivityReceiverListener {
    
    public BaseApplication() {
        super();
    }
    
    @java.lang.Override()
    public void onNetworkConnectionChanged(boolean isConnected) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void startConnectivityService() {
    }
    
    private final void stopConnectivityService() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onEnterForeground() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onEnterBackground() {
    }
    
    private final void scheduleJob() {
    }
}