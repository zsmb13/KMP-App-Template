package com.jetbrains.kmpapp

import android.os.Build

actual fun getPlatformName(): String {
    return "Android ${Build.VERSION.SDK_INT} on ${Build.MANUFACTURER} ${Build.MODEL}"
}
