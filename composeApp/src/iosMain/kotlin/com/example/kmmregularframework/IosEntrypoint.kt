package com.example.kmmregularframework

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun createComposeViewController() = ComposeUIViewController { App() }