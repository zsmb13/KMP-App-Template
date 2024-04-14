package com.jetbrains.kmpapp

import platform.UIKit.UIDevice

actual fun getPlatformName(): String {
    return "iOS ${UIDevice.currentDevice.systemVersion}"
}
