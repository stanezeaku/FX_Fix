package com.ifeetech.fxfix.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.alphavantage.co/"


private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface AlphaVantageApiService {
    @GET("query?function=FX_INTRADAY&from_symbol=EUR&to_symbol=USD&interval=5min&apikey=K2IQ33QKMFV6VXZ1")
    fun getFunction() :
            Call<String>
}

object AlphaVantageApi {
    val retrofitService : AlphaVantageApiService by lazy {
        retrofit.create(AlphaVantageApiService::class.java)
    }
}

