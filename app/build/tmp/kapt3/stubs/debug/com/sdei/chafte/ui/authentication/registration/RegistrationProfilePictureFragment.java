package com.sdei.chafte.ui.authentication.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0014J\"\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-H\u0002J\u001c\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Lcom/sdei/chafte/ui/authentication/registration/RegistrationProfilePictureFragment;", "Lcom/sdei/chafte/utils/base/BaseFragment;", "Lcom/sdei/chafte/databinding/FragmentRegistrationFifthBinding;", "Lcom/sdei/chafte/ui/authentication/registration/RegistrationVM;", "()V", "PICK_IMAGE_MULTIPLE", "", "getPICK_IMAGE_MULTIPLE", "()I", "setPICK_IMAGE_MULTIPLE", "(I)V", "REQUEST_TAKE_PHOTO", "getREQUEST_TAKE_PHOTO", "value", "binding", "getBinding", "()Lcom/sdei/chafte/databinding/FragmentRegistrationFifthBinding;", "setBinding", "(Lcom/sdei/chafte/databinding/FragmentRegistrationFifthBinding;)V", "layoutId", "getLayoutId", "mCompressor", "Lcom/sdei/chafte/utils/FileCompressor;", "getMCompressor", "()Lcom/sdei/chafte/utils/FileCompressor;", "setMCompressor", "(Lcom/sdei/chafte/utils/FileCompressor;)V", "viewModel", "getViewModel", "()Lcom/sdei/chafte/ui/authentication/registration/RegistrationVM;", "setViewModel", "(Lcom/sdei/chafte/ui/authentication/registration/RegistrationVM;)V", "bindData", "", "dispatchTakePictureIntent", "initListeners", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "openGallery", "openSettings", "requestStoragePermission", "isCamera", "", "rotateImage", "Landroid/graphics/Bitmap;", "source", "angle", "", "selectImage", "showSettingsDialog", "app_debug"})
public final class RegistrationProfilePictureFragment extends com.sdei.chafte.utils.base.BaseFragment<com.sdei.chafte.databinding.FragmentRegistrationFifthBinding, com.sdei.chafte.ui.authentication.registration.RegistrationVM> {
    private int PICK_IMAGE_MULTIPLE = 111;
    private final int REQUEST_TAKE_PHOTO = 1;
    @org.jetbrains.annotations.Nullable()
    private com.sdei.chafte.utils.FileCompressor mCompressor;
    private java.util.HashMap _$_findViewCache;
    
    public RegistrationProfilePictureFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.ui.authentication.registration.RegistrationVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.ui.authentication.registration.RegistrationVM value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sdei.chafte.databinding.FragmentRegistrationFifthBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void setBinding(@org.jetbrains.annotations.NotNull()
    com.sdei.chafte.databinding.FragmentRegistrationFifthBinding value) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    public final int getPICK_IMAGE_MULTIPLE() {
        return 0;
    }
    
    public final void setPICK_IMAGE_MULTIPLE(int p0) {
    }
    
    public final int getREQUEST_TAKE_PHOTO() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sdei.chafte.utils.FileCompressor getMCompressor() {
        return null;
    }
    
    public final void setMCompressor(@org.jetbrains.annotations.Nullable()
    com.sdei.chafte.utils.FileCompressor p0) {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    private final void selectImage() {
    }
    
    private final void requestStoragePermission(boolean isCamera) {
    }
    
    private final void openGallery() {
    }
    
    private final void dispatchTakePictureIntent() {
    }
    
    private final void showSettingsDialog() {
    }
    
    private final void openSettings() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap source, float angle) {
        return null;
    }
}