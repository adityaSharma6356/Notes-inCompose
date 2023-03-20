package com.example.schedulemanager.ui.gallery

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import com.example.schedulemanager.R



class createTimeTableActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_time_table)
        findViewById<TextView>(R.id.tvsavebutton).setOnClickListener {
            dataSetter(
                context = this,
                userdata = TimeTableData(
                    LectureDuration = findViewById<EditText>(R.id.etlectureduration).text.toString()
                        .toInt(),
                    NumberOfSubjects = findViewById<EditText>(R.id.etnumberofsubjects).text.toString()
                        .toInt(),
                    LectureList = listOf(
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                        Lecture("", false),
                    ),
                    workingDays = findViewById<EditText>(R.id.etworkingdays).text.toString()
                        .toInt(),
                    startingTime = Time(
                        hour = findViewById<TimePicker>(R.id.etstartingtime).hour,
                        Minute = findViewById<TimePicker>(R.id.etstartingtime).minute
                    ),
                    endingTime = Time(
                        hour = findViewById<TimePicker>(R.id.etdayendingtime).hour,
                        Minute = findViewById<TimePicker>(R.id.etdayendingtime).minute
                    ),
                    breakDuration = findViewById<EditText>(R.id.etbreakduration).text.toString()
                        .toInt()
                )
            )
            finish()
        }
    }
}