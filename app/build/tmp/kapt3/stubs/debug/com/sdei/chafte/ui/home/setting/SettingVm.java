package com.sdei.chafte.ui.home.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020,J\u001a\u00100\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u00101\u001a\u0004\u0018\u00010\u0005J\u0006\u00102\u001a\u00020,J\u0018\u00103\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u0005J \u00104\u001a\u00020,2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005J\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bJ\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bJ\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bJ\u001e\u0010:\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u0018\u00010\bJ\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR2\u0010\u001e\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR\"\u0010\'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\r\u00a8\u0006<"}, d2 = {"Lcom/sdei/chafte/ui/home/setting/SettingVm;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "authentication", "", "(Landroid/app/Application;Ljava/lang/String;)V", "accountVisibilityReponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sdei/chafte/model/AccountVisibilityData;", "getAccountVisibilityReponse", "()Landroidx/lifecycle/MutableLiveData;", "setAccountVisibilityReponse", "(Landroidx/lifecycle/MutableLiveData;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "(Landroid/app/Application;)V", "authentication_token", "getAuthentication_token", "()Ljava/lang/String;", "setAuthentication_token", "(Ljava/lang/String;)V", "logoutResponse", "getLogoutResponse", "setLogoutResponse", "registrationReponse", "getRegistrationReponse", "setRegistrationReponse", "roomResponse", "Ljava/util/ArrayList;", "Lcom/sdei/chafte/model/MyEventData;", "Lkotlin/collections/ArrayList;", "getRoomResponse", "setRoomResponse", "sendRequestResponse", "getSendRequestResponse", "setSendRequestResponse", "userProfileReponse", "Lcom/sdei/chafte/model/UserProfileData;", "getUserProfileReponse", "setUserProfileReponse", "addprivacyInfo", "", "accountVisibilityBinding", "Lcom/sdei/chafte/pojoclasses/AccountVisibilityPojo;", "doLogoutProcess", "getMyEventRoom", "user_id", "getPrivacyInfo", "getProfile", "getSendRequest", "own_id", "observerAccpuntVisibilityResponse", "observerFriendRequestResponse", "observerLogoutResponse", "observerPrivacyResponse", "observerRoomResponse", "observerUserProfileResponse", "app_debug"})
public final class SettingVm extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authentication_token = "";
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> logoutResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> sendRequestResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.MyEventData>> roomResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.UserProfileData> userProfileReponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> registrationReponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.AccountVisibilityData> accountVisibilityReponse;
    
    public SettingVm(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.Nullable()
    java.lang.String authentication) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthentication_token() {
        return null;
    }
    
    public final void setAuthentication_token(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLogoutResponse() {
        return null;
    }
    
    public final void setLogoutResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSendRequestResponse() {
        return null;
    }
    
    public final void setSendRequestResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.MyEventData>> getRoomResponse() {
        return null;
    }
    
    public final void setRoomResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.MyEventData>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.UserProfileData> getUserProfileReponse() {
        return null;
    }
    
    public final void setUserProfileReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.UserProfileData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRegistrationReponse() {
        return null;
    }
    
    public final void setRegistrationReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.AccountVisibilityData> getAccountVisibilityReponse() {
        return null;
    }
    
    public final void setAccountVisibilityReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.AccountVisibilityData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerLogoutResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.AccountVisibilityData> observerAccpuntVisibilityResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerPrivacyResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerFriendRequestResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.UserProfileData> observerUserProfileResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.sdei.chafte.model.MyEventData>> observerRoomResponse() {
        return null;
    }
    
    public final void doLogoutProcess() {
    }
    
    public final void addprivacyInfo(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.pojoclasses.AccountVisibilityPojo accountVisibilityBinding) {
    }
    
    public final void getPrivacyInfo() {
    }
    
    public final void getMyEventRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id) {
    }
    
    public final void getProfile(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String user_id) {
    }
    
    public final void getSendRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String user_id, @org.jetbrains.annotations.NotNull()
    java.lang.String own_id) {
    }
}