package com.ifeetech.client_jvm

import io.ktor.client.HttpClient
import io.ktor.client.request.get

class ClientsRequest {

    val client = HttpClient()

    suspend fun httpGet() {
        val content: String = client.get("https://en.wikipedia.org/wiki/Main_Page")
    }


}