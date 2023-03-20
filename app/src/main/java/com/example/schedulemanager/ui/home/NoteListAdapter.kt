package com.example.schedulemanager.ui.home

import android.content.Intent
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulemanager.R

class NoteListAdapter(
    something : ArrayList<NoteObject>
) : RecyclerView.Adapter<NoteListAdapter.ViewHolder>()  {
    var dataset = something

    inner class ViewHolder(itemView : View ) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                val Intent  = Intent(itemView.context , OpenNoteActivity::class.java)
                Intent.putExtra("index" , adapterPosition)
                itemView.context.startActivity(Intent)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.single_note_layout ,
                parent,
                false
            )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.itemView.findViewById<TextView>(R.id.tvTittleText).text = dataset[position].NoteTittle
        holder.itemView.findViewById<TextView>(R.id.tvbodytext).text = dataset[position].NoteBody
        holder.itemView.findViewById<CardView>(R.id.cvCardView).setCardBackgroundColor(colorPickcr(dataset[position].colorScheme).toArgb())
    }



    override fun getItemCount(): Int {
        return dataset.size
    }
}