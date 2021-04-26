package com.sujina.jinaml.ui.imageRecognition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImageViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "this is the image recognition"
    }
    val text : LiveData<String> = _text
}