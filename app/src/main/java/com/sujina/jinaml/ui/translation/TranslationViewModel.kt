package com.sujina.jinaml.ui.translation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TranslationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "this is the translation, thanks GOD"
    }
    val text : LiveData<String> = _text

}