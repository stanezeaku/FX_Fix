package com.ifeetech.fxfix.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()

    val text: LiveData<String>
            get() =  _text

    init {
        _text.value = "This is share Fragment"

    }
}