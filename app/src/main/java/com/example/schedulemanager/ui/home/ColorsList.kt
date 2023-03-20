package com.example.schedulemanager.ui.home

import android.graphics.Color
import android.graphics.Color.rgb


fun colorPickcr(value : Int) : Color{
    when(value) {
        0 -> return Color.valueOf(rgb(255, 142, 183))
        1 -> return Color.valueOf(rgb(54, 255, 211))
        2 -> return Color.valueOf(rgb(255, 204, 128))
        3 -> return Color.valueOf(rgb(140, 234, 255))
        4 -> return Color.valueOf(rgb(247, 173, 255))
        5 -> return Color.valueOf(rgb(16, 175, 242))
    }
    return Color.valueOf(1F,1F, 1F)
}