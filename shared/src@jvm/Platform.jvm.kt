package com.jetbrains.kmpapp

actual fun getPlatformName(): String {
    return "JVM ${System.getProperty("java.version")}"
}
