package com.ifeetech.fxfix.ui.tradesessions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ifeetech.fxfix.network.AlphaVantageApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TradeSessionsViewModel : ViewModel() {


    private val _text = MutableLiveData<String>()

    val text: LiveData<String>
            get() =  _text


    init {
        getAlphaVantageFunction()
    }

    private fun getAlphaVantageFunction() {
        AlphaVantageApi.retrofitService.getFunction().enqueue(object: Callback<String> {
            override fun onFailure(call: Call<String>, t: Throwable) {
                _text.value = "Failure:" + t.message
            }

            override fun onResponse(call: Call<String>, response: Response<String>) {
                _text.value = response.body()
            }
        })

        _text.value = "Set the AlphaVantage API Response here"
    }


}