package com.sujina.jinaml.ui.voiceRecognition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VoiceViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "this is the voice"
    }
    val text : LiveData<String> = _text
}