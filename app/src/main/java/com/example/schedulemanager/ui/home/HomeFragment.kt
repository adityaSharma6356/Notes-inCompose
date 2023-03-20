package com.example.schedulemanager.ui.home

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulemanager.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson


class HomeFragment : Fragment()  {

    private lateinit var rvadapter : NoteListAdapter
    private lateinit var rvview: RecyclerView
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        rvview = binding.rvRecyclerview
        rvadapter = NoteListAdapter(NoteList)
        rvview.adapter = rvadapter
        rvview.layoutManager = GridLayoutManager(root.context , 2 )


        binding.fab.setOnClickListener {
            if (container != null) {
                val thisis = root.context
                val edittext = EditText(thisis)
                edittext.isSingleLine = true

                val alert: AlertDialog.Builder = AlertDialog.Builder(thisis)

                alert.setMessage("Enter Note Tittle")
                    .setTitle("Create new NOTE")
                    .setView(edittext)
                    .setPositiveButton(
                        "Add"
                    ) { dialog, whichButton ->
                        CreateNoteObject(edittext.text.toString(), "" , NoteList.size%5 , thisis)
                        rvadapter.dataset = NoteList
                        rvadapter.notifyItemInserted(NoteList.lastIndex)
                    }
                    .setNegativeButton(
                        "Cancel"
                    ) { dialog, whichButton ->
                    }
                    .setCancelable(false)
                    .show()
            }
        }



        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT ){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val deletedCourse: NoteObject =
                    NoteList.get(viewHolder.adapterPosition)

                val position = viewHolder.adapterPosition

                NoteList.removeAt(viewHolder.adapterPosition)

                rvadapter.notifyItemRemoved(viewHolder.adapterPosition)

                val json = Gson().toJson(NoteList)
                root.context.getSharedPreferences("NotesList" , Context.MODE_PRIVATE).edit().putString("Notes" , json).apply()

                Snackbar.make(rvview, "Deleted " + deletedCourse.NoteTittle, Snackbar.LENGTH_LONG)
                    .setAction(
                        "Undo"
                    ) {
                        NoteList.add(position, deletedCourse)
                        rvadapter.notifyItemInserted(position)
                        val jsonFormattedList = Gson().toJson(NoteList)
                        root.context.getSharedPreferences("NotesList", Context.MODE_PRIVATE).edit()
                            .putString("Notes", jsonFormattedList).apply()
                    }
                    .setBackgroundTint(colorPickcr(deletedCourse.colorScheme).toArgb())
                    .setTextColor(Color.BLACK)
                    .show()
            }
        }).attachToRecyclerView(rvview)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

















