package com.example.schedulemanager.ui.home

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


fun loadNotesList(context : Context) {
    val shared = context.getSharedPreferences("NotesList" , Context.MODE_PRIVATE)

    val json = shared.getString("Notes" , null)

    if(json!=null){
        val turnsType = object : TypeToken<MutableList<NoteObject>>() {}.type
        val turns = Gson().fromJson<ArrayList<NoteObject>>(json , turnsType)

        NoteList = turns
        if(NoteList.isEmpty()) {
            NoteList = ArrayList<NoteObject>()
        }
    }
}

fun CreateNoteObject(Tittle : String , body : String , color : Int , context : Context) {
    val sharedpef = context.getSharedPreferences("NotesList" , Context.MODE_PRIVATE)
    val editor = sharedpef.edit()

    val gson = Gson()
    NoteList.add(NoteObject(Tittle , body , color))
    val json = gson.toJson(NoteList)
    editor.putString("Notes" , json)

    editor.apply()

}