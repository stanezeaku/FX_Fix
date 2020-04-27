package com.ifeetech.fxfix.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()

    val text: LiveData<String>
            get() =  _text

    init {
        _text.value = "This is gallery Fragment"
    }
}