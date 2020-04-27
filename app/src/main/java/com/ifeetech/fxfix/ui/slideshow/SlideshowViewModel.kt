package com.ifeetech.fxfix.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()

    val text: LiveData<String>
        get() =  _text

    init {
        _text.value = "This is slideshow Fragment"
    }
}