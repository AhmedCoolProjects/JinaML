package com.sujina.jinaml.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "this is settings fragment"
    }
    val text : LiveData<String> = _text

}