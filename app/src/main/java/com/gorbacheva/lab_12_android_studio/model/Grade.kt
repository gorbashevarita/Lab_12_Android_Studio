package com.gorbacheva.lab_12_android_studio.model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)