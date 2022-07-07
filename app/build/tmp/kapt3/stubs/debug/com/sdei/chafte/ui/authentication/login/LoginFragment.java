package com.sdei.chafte.ui.authentication.login;

import java.lang.System;

/**
 * Created by Vishal Sharma on 2019-12-06.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0014J\u0006\u0010#\u001a\u00020\"J\u0016\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\b\u0010(\u001a\u00020\"H\u0014J\"\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\"H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006/"}, d2 = {"Lcom/sdei/chafte/ui/authentication/login/LoginFragment;", "Lcom/sdei/chafte/utils/base/BaseFragment;", "Lcom/sdei/chafte/databinding/FragmentLoginBinding;", "Lcom/sdei/chafte/ui/authentication/login/LoginVM;", "()V", "RC_SIGN_IN", "", "value", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/FragmentLoginBinding;", "setBinding", "(Lcom/sdei/chafte/databinding/FragmentLoginBinding;)V", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "layoutId", "getLayoutId", "()I", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getMGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setMGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/authentication/login/LoginVM;", "setViewModel", "(Lcom/sdei/chafte/ui/authentication/login/LoginVM;)V", "bindData", "", "disconnectFromFacebook", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "app_debug"})
public final class LoginFragment extends com.sdei.chafte.utils.base.BaseFragment<com.sdei.chafte.databinding.FragmentLoginBinding, com.sdei.chafte.ui.authentication.login.LoginVM> {
    public com.facebook.CallbackManager callbackManager;
    public com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private final int RC_SIGN_IN = 1;
    private java.util.HashMap _$_findViewCache;
    
    public LoginFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.authentication.login.LoginVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.authentication.login.LoginVM value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setBinding(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.databinding.FragmentLoginBinding value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    public final void setCallbackManager(@org.jetbrains.annotations.NotNull()
    com.facebook.CallbackManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getMGoogleSignInClient() {
        return null;
    }
    
    public final void setMGoogleSignInClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    public final void disconnectFromFacebook() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}