package com.example.schedulemanager.ui.home

import android.content.Context
import android.os.Bundle
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.schedulemanager.R
import com.example.schedulemanager.databinding.ActivityOpenNoteBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson

class OpenNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_note)
        val index = intent.getIntExtra("index" , 0)
        val tittle = findViewById<TextView>(R.id.tvtittle)
        val body = findViewById<EditText>(R.id.ecNoteEdit)
        val savebutton = findViewById<FloatingActionButton>(R.id.fbsavebutton)

        body.setText(NoteList[index].NoteBody)
        tittle.text = (NoteList[index].NoteTittle)
        savebutton.setOnClickListener {
            NoteList[index].NoteBody = body.text.toString()
            val sharedpef = this.getSharedPreferences("NotesList" , Context.MODE_PRIVATE)
            val editor = sharedpef.edit()
            val gson = Gson()
            val json = gson.toJson(NoteList)
            editor.putString("Notes" , json)
            editor.apply()
            finish()
        }
        val relativelayout : RelativeLayout = findViewById(R.id.currentview)
        relativelayout.setBackgroundColor(colorPickcr(NoteList[index].colorScheme).toArgb())
    }
}