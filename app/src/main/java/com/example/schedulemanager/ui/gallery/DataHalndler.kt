package com.example.schedulemanager.ui.gallery

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun dataSetter(context: Context , userdata: TimeTableData) {
    val sharedpef = context.getSharedPreferences("timetabledata" , Context.MODE_PRIVATE)
    val editor = sharedpef.edit()
    val gson = Gson()
    val json = gson.toJson(userdata)
    editor.putString("TTdata" , json)
    editor.apply()
}

fun dataLoader(context: Context , userdata: TimeTableData) : TimeTableData{
    val shared = context.getSharedPreferences("timetabledata" , Context.MODE_PRIVATE)

    val json = shared.getString("TTdata" , null)

    if(json!=null){
        val turnsType = object : TypeToken<TimeTableData>(){}.type
        val turns = Gson().fromJson<TimeTableData>(json , turnsType)
        return turns
    }
    return userdata
}