package com.example.schedulemanager.ui.home


var NoteList = ArrayList<NoteObject>()
var tempList = ArrayList<NoteObject>()

data class NoteObject(
    var NoteTittle : String ,
    var NoteBody : String ,
    var colorScheme : Int
    )
