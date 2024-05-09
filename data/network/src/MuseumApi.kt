package com.jetbrains.kmpapp.data

interface MuseumApi {
    suspend fun getData(): List<MuseumObject>
}

