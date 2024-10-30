package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Vegetable(
    var name: String = "",
    var nutrition: String = "",
    var benefits: String = "",
    var description: String = "",
    var photo: Int = 0,
    var background: Int = 0
) :Parcelable
