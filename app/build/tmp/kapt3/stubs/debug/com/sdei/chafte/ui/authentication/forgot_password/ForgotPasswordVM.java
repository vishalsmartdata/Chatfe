package com.sdei.chafte.ui.authentication.forgot_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010D\u001a\u00020EJ\u0010\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020E2\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010M\u001a\u00020E2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020E2\u0006\u0010N\u001a\u00020OH\u0002J\u0006\u0010Q\u001a\u00020EJ\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006J\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006J\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0006\u0010W\u001a\u00020ER\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00100R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u00100R \u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u00100R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0016R\u001a\u0010<\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010\u001bR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0016R\"\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000b\u00a8\u0006X"}, d2 = {"Lcom/sdei/chafte/ui/authentication/forgot_password/ForgotPasswordVM;", "Lcom/sdei/chafte/utils/base/BaseVM;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "VerifyOtpResponse", "Landroidx/lifecycle/MutableLiveData;", "", "getVerifyOtpResponse", "()Landroidx/lifecycle/MutableLiveData;", "setVerifyOtpResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "app", "getApp", "()Landroid/app/Application;", "setApp", "changePasswordRespose", "getChangePasswordRespose", "setChangePasswordRespose", "confirmPasswordObserver", "Landroidx/databinding/ObservableField;", "getConfirmPasswordObserver", "()Landroidx/databinding/ObservableField;", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "emailOrPhoneNumber", "getEmailOrPhoneNumber", "optionEmail", "", "getOptionEmail", "setOptionEmail", "optionEmailSelected", "getOptionEmailSelected", "()Z", "setOptionEmailSelected", "(Z)V", "optionPhoneNumberSelected", "getOptionPhoneNumberSelected", "setOptionPhoneNumberSelected", "optionPhonenumber", "getOptionPhonenumber", "setOptionPhonenumber", "otpFirstObserver", "getOtpFirstObserver", "setOtpFirstObserver", "(Landroidx/databinding/ObservableField;)V", "otpFouthObserver", "getOtpFouthObserver", "setOtpFouthObserver", "otpSecondObserver", "getOtpSecondObserver", "setOtpSecondObserver", "otpThirdObserver", "getOtpThirdObserver", "setOtpThirdObserver", "passwordObserver", "getPasswordObserver", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "progressObservable", "getProgressObservable", "sendOtpResponse", "getSendOtpResponse", "setSendOtpResponse", "OtpVerification", "", "callChangePassword", "changePasswordPojo", "Lcom/sdei/chafte/pojoclasses/ChangePasswordPojo;", "callSendOtp", "sendOtpPojo", "Lcom/sdei/chafte/pojoclasses/SendOtpPojo;", "callSendOtpWithPhoneNumber", "callVerifyOtpEmail", "verifyEmailPhonePojo", "Lcom/sdei/chafte/pojoclasses/VerifyEmailPhonePojo;", "callVerifyOtpWithPhoneNumber", "changePassword", "observerOptionEmail", "observerOtpResponse", "observerPhonenumber", "observerVerifyOtpResponse", "observerchangePassword", "sendOtpVerification", "app_debug"})
public final class ForgotPasswordVM extends com.sdei.chafte.utils.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> passwordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> confirmPasswordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> emailOrPhoneNumber = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> optionEmail;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> optionPhonenumber;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> progressObservable = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> sendOtpResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> VerifyOtpResponse;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.String> changePasswordRespose;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpFirstObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpSecondObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpThirdObserver;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> otpFouthObserver;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneNumber = "";
    private boolean optionEmailSelected = false;
    private boolean optionPhoneNumberSelected = false;
    @org.jetbrains.annotations.Nullable()
    private android.app.Application app;
    
    public ForgotPasswordVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPasswordObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getConfirmPasswordObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEmailOrPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOptionEmail() {
        return null;
    }
    
    public final void setOptionEmail(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOptionPhonenumber() {
        return null;
    }
    
    public final void setOptionPhonenumber(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getProgressObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSendOtpResponse() {
        return null;
    }
    
    public final void setSendOtpResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVerifyOtpResponse() {
        return null;
    }
    
    public final void setVerifyOtpResponse(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getChangePasswordRespose() {
        return null;
    }
    
    public final void setChangePasswordRespose(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpFirstObserver() {
        return null;
    }
    
    public final void setOtpFirstObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpSecondObserver() {
        return null;
    }
    
    public final void setOtpSecondObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpThirdObserver() {
        return null;
    }
    
    public final void setOtpThirdObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getOtpFouthObserver() {
        return null;
    }
    
    public final void setOtpFouthObserver(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getOptionEmailSelected() {
        return false;
    }
    
    public final void setOptionEmailSelected(boolean p0) {
    }
    
    public final boolean getOptionPhoneNumberSelected() {
        return false;
    }
    
    public final void setOptionPhoneNumberSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.Nullable()
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> observerOptionEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> observerPhonenumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerVerifyOtpResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerchangePassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> observerOtpResponse() {
        return null;
    }
    
    public final void sendOtpVerification() {
    }
    
    private final void callSendOtpWithPhoneNumber(com.sdei.chafte.pojoclasses.SendOtpPojo sendOtpPojo) {
    }
    
    private final void callSendOtp(com.sdei.chafte.pojoclasses.SendOtpPojo sendOtpPojo) {
    }
    
    public final void OtpVerification() {
    }
    
    private final void callVerifyOtpWithPhoneNumber(com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo verifyEmailPhonePojo) {
    }
    
    private final void callVerifyOtpEmail(com.sdei.chafte.pojoclasses.VerifyEmailPhonePojo verifyEmailPhonePojo) {
    }
    
    public final void changePassword() {
    }
    
    private final void callChangePassword(com.sdei.chafte.pojoclasses.ChangePasswordPojo changePasswordPojo) {
    }
}