package com.sdei.chafte.ui.authentication.login;

import java.lang.System;

/**
 * Created by Vishal Sharma on 2019-12-06.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JN\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0016J\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nJ\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018\u00a8\u0006-"}, d2 = {"Lcom/sdei/chafte/ui/authentication/login/LoginVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "gmailLoginReponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sdei/chafte/model/GmailData;", "getGmailLoginReponse", "()Landroidx/lifecycle/MutableLiveData;", "setGmailLoginReponse", "(Landroidx/lifecycle/MutableLiveData;)V", "loginReponse", "Lcom/sdei/chafte/model/LoginData;", "getLoginReponse", "setLoginReponse", "passwordObservable", "Landroidx/databinding/ObservableField;", "", "getPasswordObservable", "()Landroidx/databinding/ObservableField;", "progressObservable", "", "getProgressObservable", "usernameObservable", "getUsernameObservable", "doGmailLoginProcess", "", "designation", "googleEmail", "googleFirstName", "googleId", "googleLastName", "username", "facebookId", "profile", "loginType", "doLoginProcess", "observerGmailLoginResponse", "observerLoginResponse", "observerProgress", "app_debug"})
public final class LoginVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> usernameObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> passwordObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.LoginData> loginReponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.GmailData> gmailLoginReponse;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public LoginVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUsernameObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPasswordObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProgressObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.LoginData> getLoginReponse() {
        return null;
    }
    
    public final void setLoginReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.LoginData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.GmailData> getGmailLoginReponse() {
        return null;
    }
    
    public final void setGmailLoginReponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.GmailData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.GmailData> observerGmailLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.sdei.chafte.model.LoginData> observerLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> observerProgress() {
        return null;
    }
    
    public final void doLoginProcess() {
    }
    
    public final void doGmailLoginProcess(@org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    java.lang.String googleEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String googleFirstName, @org.jetbrains.annotations.NotNull()
    java.lang.String googleId, @org.jetbrains.annotations.NotNull()
    java.lang.String googleLastName, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String facebookId, @org.jetbrains.annotations.NotNull()
    java.lang.String profile, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType) {
    }
}