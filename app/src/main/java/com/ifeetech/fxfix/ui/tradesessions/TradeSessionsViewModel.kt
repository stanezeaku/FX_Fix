package com.ifeetech.fxfix.ui.tradesessions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TradeSessionsViewModel : ViewModel() {


    private val _text = MutableLiveData<String>()

    val text: LiveData<String>
            get() =  _text


}


