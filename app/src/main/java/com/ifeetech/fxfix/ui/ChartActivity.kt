package com.ifeetech.fxfix.ui

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ifeetech.fxfix.R
import com.ifeetech.fxfix.databinding.ActivityChartBinding

private const val CHART_URL =
    "https://tradingview.go2cloud.org/aff_c?offer_id=2&aff_id=4289&url_id=11"

class ChartActivity : AppCompatActivity() {


    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityChartBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_chart)

        webView = binding.webview
        webView.webViewClient = WebViewClient()

        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        webView.loadUrl(CHART_URL)

        val actionBar = actionBar
        actionBar?.hide()

    }


}




