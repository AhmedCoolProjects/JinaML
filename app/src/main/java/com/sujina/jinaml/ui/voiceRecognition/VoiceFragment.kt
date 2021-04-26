package com.sujina.jinaml.ui.voiceRecognition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sujina.jinaml.R

class VoiceFragment : Fragment() {
    private lateinit var voiceViewModel: VoiceViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        voiceViewModel = ViewModelProvider(this).get(VoiceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_voice, container, false)

        return root
    }
}