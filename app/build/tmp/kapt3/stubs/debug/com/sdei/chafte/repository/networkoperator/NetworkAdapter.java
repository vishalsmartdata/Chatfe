package com.sdei.chafte.repository.networkoperator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/sdei/chafte/repository/networkoperator/NetworkAdapter;", "", "()V", "NETWORK_URL", "", "getNetworkServices", "Lcom/sdei/chafte/repository/networkoperator/ApiService;", "setupRetrofitClient", "", "Companion", "app_debug"})
public final class NetworkAdapter {
    private final java.lang.String NETWORK_URL = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.sdei.chafte.repository.networkoperator.NetworkAdapter.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.sdei.chafte.repository.networkoperator.NetworkAdapter cInstance;
    @org.jetbrains.annotations.Nullable()
    private static com.sdei.chafte.repository.networkoperator.ApiService apiService;
    
    public NetworkAdapter() {
        super();
    }
    
    public final void setupRetrofitClient() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sdei.chafte.repository.networkoperator.ApiService getNetworkServices() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/sdei/chafte/repository/networkoperator/NetworkAdapter$Companion;", "", "()V", "apiService", "Lcom/sdei/chafte/repository/networkoperator/ApiService;", "getApiService", "()Lcom/sdei/chafte/repository/networkoperator/ApiService;", "setApiService", "(Lcom/sdei/chafte/repository/networkoperator/ApiService;)V", "cInstance", "Lcom/sdei/chafte/repository/networkoperator/NetworkAdapter;", "getCInstance", "()Lcom/sdei/chafte/repository/networkoperator/NetworkAdapter;", "setCInstance", "(Lcom/sdei/chafte/repository/networkoperator/NetworkAdapter;)V", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sdei.chafte.repository.networkoperator.NetworkAdapter getCInstance() {
            return null;
        }
        
        public final void setCInstance(@org.jetbrains.annotations.Nullable()
        com.sdei.chafte.repository.networkoperator.NetworkAdapter p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.sdei.chafte.repository.networkoperator.ApiService getApiService() {
            return null;
        }
        
        public final void setApiService(@org.jetbrains.annotations.Nullable()
        com.sdei.chafte.repository.networkoperator.ApiService p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sdei.chafte.repository.networkoperator.NetworkAdapter getInstance() {
            return null;
        }
    }
}