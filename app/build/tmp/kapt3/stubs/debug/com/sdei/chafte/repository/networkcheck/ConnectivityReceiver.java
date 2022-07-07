package com.sdei.chafte.repository.networkcheck;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver$ConnectivityReceiverListener;", "(Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver$ConnectivityReceiverListener;)V", "getListener", "()Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver$ConnectivityReceiverListener;", "setListener", "isConnected", "", "context", "Landroid/content/Context;", "onReceive", "", "p1", "Landroid/content/Intent;", "ConnectivityReceiverListener", "app_debug"})
public final class ConnectivityReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private com.sdei.chafte.repository.networkcheck.ConnectivityReceiver.ConnectivityReceiverListener listener;
    
    public ConnectivityReceiver(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.repository.networkcheck.ConnectivityReceiver.ConnectivityReceiverListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.repository.networkcheck.ConnectivityReceiver.ConnectivityReceiverListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.repository.networkcheck.ConnectivityReceiver.ConnectivityReceiverListener p0) {
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeProtectedBroadcastReceiver"})
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent p1) {
    }
    
    private final boolean isConnected(android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sdei/chafte/repository/networkcheck/ConnectivityReceiver$ConnectivityReceiverListener;", "", "onNetworkConnectionChanged", "", "isConnected", "", "app_debug"})
    public static abstract interface ConnectivityReceiverListener {
        
        public abstract void onNetworkConnectionChanged(boolean isConnected);
    }
}