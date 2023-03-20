package com.example.schedulemanager.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.schedulemanager.databinding.FragmentGalleryBinding
import com.example.schedulemanager.ui.home.NoteListAdapter

class GalleryFragment : Fragment() {

    private lateinit var rvadapter : TimeTableAdapter
    private lateinit var rvview: RecyclerView
    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this)[GalleryViewModel::class.java]

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        binding.ivaddoreditbutton.setOnClickListener {
//            startActivity(Intent(context , createTimeTableActivity::class.java))
//        }

        rvview = binding.rvtimetablerecyclerview
        rvadapter = TimeTableAdapter()
        rvview.adapter = rvadapter
        rvview.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL , false)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}