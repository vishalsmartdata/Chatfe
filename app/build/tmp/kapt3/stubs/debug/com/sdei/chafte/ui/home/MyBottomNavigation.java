package com.sdei.chafte.ui.home;

import java.lang.System;

/**
 * Created by Farshad Rezaei.
 *
 * Email: farshad7srt@gmail.com
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\tH\u0002J,\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0003\u0010\u0016\u001a\u00020\tJ,\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\tH\u0002J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/sdei/chafte/ui/home/MyBottomNavigation;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isImageLoaded", "", "navController", "Landroidx/navigation/NavController;", "handleImageItemNotSelected", "", "imageView", "Landroid/widget/ImageView;", "handleImageItemSelected", "handleProfileBottomNavigationItemSelection", "itemId", "fragmentNavigationId", "loadImage", "imageUrl", "", "placeHolderResourceId", "loadProfileImage", "setupWithNavController", "app_debug"})
public final class MyBottomNavigation extends com.google.android.material.bottomnavigation.BottomNavigationView {
    private androidx.navigation.NavController navController;
    private boolean isImageLoaded = false;
    private java.util.HashMap _$_findViewCache;
    
    public MyBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public MyBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public MyBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void loadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @androidx.annotation.IdRes()
    int itemId, @androidx.annotation.DrawableRes()
    int placeHolderResourceId, @androidx.annotation.IdRes()
    int fragmentNavigationId) {
    }
    
    private final void loadProfileImage(android.widget.ImageView imageView, java.lang.String imageUrl, @androidx.annotation.DrawableRes()
    int placeHolderResourceId, @androidx.annotation.IdRes()
    int itemId) {
    }
    
    public final void setupWithNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    private final void handleProfileBottomNavigationItemSelection(android.widget.ImageView imageView, int itemId, @androidx.annotation.IdRes()
    int fragmentNavigationId) {
    }
    
    private final void handleImageItemNotSelected(android.widget.ImageView imageView) {
    }
    
    private final void handleImageItemSelected(android.widget.ImageView imageView) {
    }
}