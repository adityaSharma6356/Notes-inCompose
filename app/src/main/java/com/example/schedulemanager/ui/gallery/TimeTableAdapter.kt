package com.example.schedulemanager.ui.gallery

import android.graphics.Color
import android.graphics.Color.rgb
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulemanager.R

class TimeTableAdapter : RecyclerView.Adapter<TimeTableAdapter.TimeTableViewHolder>() {
    val dataset = calander.datelist

    inner class TimeTableViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeTableViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.timetable_recycler_itemview ,
                parent,
                false
            )
        return TimeTableViewHolder(view)
    }

    override fun onBindViewHolder(holder: TimeTableViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.tvday).text = calander.datelist[position]
        holder.itemView.findViewById<TextView>(R.id.tvfirst).text = daydata(position , 0)
        holder.itemView.findViewById<TextView>(R.id.tvsecond).text = daydata(position , 1)
        holder.itemView.findViewById<TextView>(R.id.tvthird).text = daydata(position , 2)
        holder.itemView.findViewById<TextView>(R.id.tvfourth).text = daydata(position , 9)
        holder.itemView.findViewById<TextView>(R.id.tvfifth).text = daydata(position , 3)
        holder.itemView.findViewById<TextView>(R.id.tvsixth).text = daydata(position , 4)
        holder.itemView.findViewById<TextView>(R.id.tvseventh).text = daydata(position , 5)
        holder.itemView.findViewById<TextView>(R.id.tveigth).text = daydata(position , 6)

    }

    override fun getItemCount(): Int {
        return calander.datelist.size
    }

}