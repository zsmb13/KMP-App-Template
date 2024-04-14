package com.jetbrains.kmpapp

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformNameTest {
    @Test
    fun platformNameIsNotBlank() {
        assertTrue { getPlatformName().isNotBlank() }
    }
}
