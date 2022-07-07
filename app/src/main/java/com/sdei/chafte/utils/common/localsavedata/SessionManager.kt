package com.sdei.totalcabmobility.utils.common.localsavedata

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.sdei.chafte.ui.authentication.AuthenticationActivity

class SessionManager(context: Context?) {
    private val mContext: Context? = null
    private val sharedPreferences: SharedPreferences

    fun setValue(key: String?, value: String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun setBooleanValue(key: String?, value: Boolean?) {
        sharedPreferences.edit().putBoolean(key, value!!).apply()
    }

    fun getBooleanValue(key: String?): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }

    fun getUserData(key: String?): String? {
        return sharedPreferences.getString(key, "")
    }

    fun logout(context: Context?) {
        var inside_app = getBooleanValue(INSIDE_APP)
        sharedPreferences.edit().clear().apply()
        val intent = Intent(context, AuthenticationActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        context?.startActivity(intent)
        setBooleanValue(INSIDE_APP, inside_app)
    }

    fun getvalue(key: String?): String? {
        return sharedPreferences.getString(key, "")
    }

    companion object {
        var INSIDE_APP = "inside_app"
        var USER_ID = "user_id"
        var AUTHENTICATION = "token"
        var USER_IMAGE = "image"
        var FIRST_NAME = "first_name"

    }

    init {
        //   this.sharedPreferences = sharedPreferences;
        sharedPreferences = PreferenceManager
            .getDefaultSharedPreferences(context)
    }
}
