package com.sdei.chafte.utils.base

import android.graphics.Typeface
import java.lang.reflect.Field;
import android.content.Context;

object  FontsOverride {
    fun setDefaultFont(context: Context, staticTypefaceFieldName: String?, fontAssetName: String?) {
        val regular = Typeface.createFromAsset(
            context.getAssets(),
            fontAssetName
        )
        replaceFont(staticTypefaceFieldName, regular)
    }

    internal fun replaceFont(staticTypefaceFieldName: String?, newTypeface: Typeface?) {
        try {
            val staticField: Field = Typeface::class.java.getDeclaredField(staticTypefaceFieldName)
            staticField.setAccessible(true)
            staticField.set(null, newTypeface)
        } catch (e: NoSuchFieldException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }
}
