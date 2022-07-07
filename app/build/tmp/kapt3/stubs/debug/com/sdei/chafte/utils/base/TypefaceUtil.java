package com.sdei.chafte.utils.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/sdei/chafte/utils/base/TypefaceUtil;", "", "()V", "overrideFont", "", "context", "Landroid/content/Context;", "defaultFontNameToOverride", "", "customFontFileNameInAssets", "app_debug"})
public final class TypefaceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.sdei.chafte.utils.base.TypefaceUtil INSTANCE = null;
    
    private TypefaceUtil() {
        super();
    }
    
    /**
     * Using reflection to override default typeface
     * NOTICE: DO NOT FORGET TO SET TYPEFACE FOR APP THEME AS DEFAULT TYPEFACE WHICH WILL BE OVERRIDDEN
     *
     * @param context                    to work with assets
     * @param defaultFontNameToOverride  for example "monospace"
     * @param customFontFileNameInAssets file name of the font from assets
     */
    public final void overrideFont(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultFontNameToOverride, @org.jetbrains.annotations.NotNull()
    java.lang.String customFontFileNameInAssets) {
    }
}