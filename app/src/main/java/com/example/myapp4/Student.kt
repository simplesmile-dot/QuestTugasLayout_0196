package com.example.myapp4

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontFamily

data class Student(
    @StringRes val name: Int,
    @StringRes val phone: Int?,
    @StringRes val address: Int,
    @ColorRes val cardColor: Int,
    @ColorRes val addressColor: Int,
    val nameFont: FontFamily? = null
)