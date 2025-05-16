package com.example.kmmregularframework

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform