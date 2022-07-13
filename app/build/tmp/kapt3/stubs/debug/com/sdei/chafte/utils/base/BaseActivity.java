package com.sdei.chafte.utils.base;

import java.lang.System;

/**
 * Created by Vishal on 10/10/19.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00104\u001a\u000205H&J\u0010\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109J\u0012\u0010:\u001a\u0004\u0018\u0001092\b\u00108\u001a\u0004\u0018\u000109J\u0006\u0010;\u001a\u00020\u0015J\u0006\u0010<\u001a\u000205J\u0006\u0010=\u001a\u000205J\b\u0010>\u001a\u000205H&J\u0006\u0010?\u001a\u00020,J\u0010\u0010@\u001a\u0002052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020\u00052\b\u0010C\u001a\u0004\u0018\u00010DJ\u0012\u0010E\u001a\u0002052\b\u0010F\u001a\u0004\u0018\u00010DH\u0014J\b\u0010G\u001a\u000205H\u0014J&\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u0002092\u0006\u0010M\u001a\u000207J&\u0010N\u001a\u0002052\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u0002092\u0006\u0010M\u001a\u000207J0\u0010O\u001a\u0002052\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u0002092\u0006\u0010M\u001a\u0002072\b\u0010C\u001a\u0004\u0018\u00010DJ\u001f\u0010P\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001092\b\u0010Q\u001a\u0004\u0018\u000107\u00a2\u0006\u0002\u0010RJ\u001a\u0010S\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001092\b\u0010Q\u001a\u0004\u0018\u000109J\u000b\u0010T\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010U\u001a\u00028\u00012\u0006\u0010B\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0004\u00a2\u0006\u0002\u0010WJ\u0006\u0010X\u001a\u000205J\u001e\u0010Y\u001a\u0002052\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u000207R\u0012\u0010\u0007\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00101\u001a\u00028\u0001X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$\u00a8\u0006^"}, d2 = {"Lcom/sdei/chafte/utils/base/BaseActivity;", "myBinding", "Landroidx/databinding/ViewDataBinding;", "V", "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "layoutId", "", "getLayoutId", "()I", "mContext", "getMContext", "setMContext", "(Landroid/content/Context;)V", "mViewBinding", "getMViewBinding", "setMViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "mViewModel", "getMViewModel", "()Landroidx/lifecycle/ViewModel;", "setMViewModel", "(Landroidx/lifecycle/ViewModel;)V", "sessionManager", "Lcom/sdei/totalcabmobility/utils/common/localsavedata/SessionManager;", "getSessionManager", "()Lcom/sdei/totalcabmobility/utils/common/localsavedata/SessionManager;", "setSessionManager", "(Lcom/sdei/totalcabmobility/utils/common/localsavedata/SessionManager;)V", "socketManager", "Lcom/sdei/chafte/utils/socket/SocketManager;", "getSocketManager", "()Lcom/sdei/chafte/utils/socket/SocketManager;", "setSocketManager", "(Lcom/sdei/chafte/utils/socket/SocketManager;)V", "viewModel", "getViewModel", "setViewModel", "bindData", "", "getBooleanData", "", "key", "", "getData", "getStatusBarHeight", "hideKeyboard", "hideProgress", "initListeners", "initialSocket", "logout", "navigateActivity", "activity", "bundle", "Landroid/os/Bundle;", "onCreate", "savedInstanceState", "onStart", "openFragmentReplace", "id", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "addToBack", "openFragmentReplaceNoAnim", "openFragmentReplaceNoAnimWithBundle", "saveBooleanData", "token", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "saveData", "setUpBinding", "setUpVM", "obj", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/lifecycle/ViewModel;)Landroidx/lifecycle/ViewModel;", "showProgress", "showSnackBar", "view", "Landroid/view/View;", "message", "isError", "app_debug"})
public abstract class BaseActivity<myBinding extends androidx.databinding.ViewDataBinding, V extends androidx.lifecycle.ViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.ViewModel mViewModel;
    public android.content.Context mContext;
    public com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager sessionManager;
    public androidx.databinding.ViewDataBinding mViewBinding;
    public com.sdei.chafte.utils.socket.SocketManager socketManager;
    
    /**
     * @return context
     */
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.ViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.ViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract myBinding getBinding();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ViewDataBinding getMViewBinding() {
        return null;
    }
    
    public final void setMViewBinding(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.utils.socket.SocketManager getSocketManager() {
        return null;
    }
    
    public final void setSocketManager(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.utils.socket.SocketManager p0) {
    }
    
    /**
     * @return toolbar resource id
     */
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    /**
     * Override for set view model
     *
     * @return view model instance
     */
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    /**
     * Override for set view model
     *
     * @return view model instance
     */
    public abstract void setViewModel(@org.jetbrains.annotations.NotNull()
    V p0);
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.content.Context getContext();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public abstract void bindData();
    
    public abstract void initListeners();
    
    @org.jetbrains.annotations.NotNull()
    public final com.sdei.chafte.utils.socket.SocketManager initialSocket() {
        return null;
    }
    
    public final void hideKeyboard() {
    }
    
    /**
     * Common function for Set Up Binding ...
     */
    @org.jetbrains.annotations.NotNull()
    public final myBinding setUpBinding() {
        return null;
    }
    
    /**
     * Common function for Set Up ViewModel...
     * if no ViewModel Available then use BaseModel ...
     * You can also send parameters in constructor ...
     */
    @org.jetbrains.annotations.NotNull()
    public final V setUpVM(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModel obj) {
        return null;
    }
    
    public final void showProgress() {
    }
    
    /**
     * Hide Progress Dialog ...
     *
     * @param isShowing
     */
    public final void hideProgress() {
    }
    
    public final void saveData(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void saveBooleanData(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean token) {
    }
    
    public final boolean getBooleanData(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    public final void logout(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isError) {
    }
    
    /**
     * Get Status Bar Height for the device ...
     * @return
     */
    public final int getStatusBarHeight() {
        return 0;
    }
    
    public final void navigateActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public final void openFragmentReplace(int id, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean addToBack) {
    }
    
    public final void openFragmentReplaceNoAnim(int id, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean addToBack) {
    }
    
    public final void openFragmentReplaceNoAnimWithBundle(int id, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean addToBack, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
}