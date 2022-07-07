package com.sdei.chafte.utils.base

import android.graphics.Typeface

import android.os.Build
import android.util.Log
import java.lang.Exception
import java.lang.reflect.Field
import android.content.Context


object TypefaceUtil {
    /**
     * Using reflection to override default typeface
     * NOTICE: DO NOT FORGET TO SET TYPEFACE FOR APP THEME AS DEFAULT TYPEFACE WHICH WILL BE OVERRIDDEN
     *
     * @param context                    to work with assets
     * @param defaultFontNameToOverride  for example "monospace"
     * @param customFontFileNameInAssets file name of the font from assets
     */
    fun overrideFont(
        context: Context,
        defaultFontNameToOverride: String,
        customFontFileNameInAssets: String
    ) {
        val customFontTypeface =
            Typeface.createFromAsset(context.getAssets(), customFontFileNameInAssets)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val newMap: MutableMap<String, Typeface> = HashMap()
            newMap["serif"] = customFontTypeface
            try {
                val staticField: Field = Typeface::class.java
                    .getDeclaredField("sSystemFontMap")
                staticField.setAccessible(true)
                staticField.set(null, newMap)
            } catch (e: NoSuchFieldException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            }
        } else {
            try {
                val defaultFontTypefaceField: Field =
                    Typeface::class.java.getDeclaredField(defaultFontNameToOverride)
                defaultFontTypefaceField.setAccessible(true)
                defaultFontTypefaceField.set(null, customFontTypeface)
            } catch (e: Exception) {
                Log.e(
                    TypefaceUtil::class.java.simpleName,
                    "Can not set custom font $customFontFileNameInAssets instead of $defaultFontNameToOverride"
                )
            }
        }
    }
}