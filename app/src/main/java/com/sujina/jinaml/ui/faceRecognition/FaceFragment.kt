package com.sujina.jinaml.ui.faceRecognition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sujina.jinaml.R

class FaceFragment : Fragment() {
    private lateinit var faceViewModel: FaceViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        faceViewModel = ViewModelProvider(this).get(FaceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_face_regonition,container,false)
       /* val textView: TextView = root.findViewById(R.id.text_face_fragment)
        faceViewModel.text.observe(viewLifecycleOwner,{
            textView.text = it
        })*/
        return root
    }
}