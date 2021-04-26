package com.sujina.jinaml.ui.textRecognition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.sujina.jinaml.R

class TextFragment : Fragment() {
    private lateinit var textViewModel: TextViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        textViewModel = ViewModelProvider(this).get(TextViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_text, container, false)
        val textView: TextView = root.findViewById(R.id.text_text)
        val fab: FloatingActionButton = root.findViewById(R.id.fab_text)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Camera will be setting up soon ;)", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        textViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root

    }
}