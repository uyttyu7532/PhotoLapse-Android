package com.example.utils

import android.content.Context
import android.content.SharedPreferences

class PreferenceUtil(context: Context) {
    private val imageAlphaPrefs: SharedPreferences =
        context.getSharedPreferences("backGroundAlpha", Context.MODE_PRIVATE)

    fun getFloat(key: String, defValue: Float): Float {
        return imageAlphaPrefs.getFloat(key, defValue)
    }

    fun setFloat(key: String, value: Float) {
        imageAlphaPrefs.edit().putFloat(key, value).apply()
    }
}
