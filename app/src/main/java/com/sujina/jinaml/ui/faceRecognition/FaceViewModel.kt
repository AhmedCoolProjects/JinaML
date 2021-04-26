package com.sujina.jinaml.ui.faceRecognition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FaceViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is the Face Recognition"
    }
    val text : LiveData<String> = _text
}