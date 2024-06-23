package com.estimator.wtprice
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.loadsImagesAutomatically = true
        webView.loadUrl("file:///android_asset/index.html")
    }
}