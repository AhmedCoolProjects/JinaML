package com.sujina.jinaml.ui.translation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sujina.jinaml.R

class TranslationFragment : Fragment() {
    private lateinit var translationViewModel: TranslationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        translationViewModel = ViewModelProvider(this).get(TranslationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_translation,container,false)

        return root
    }
}