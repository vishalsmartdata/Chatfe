package com.sdei.chafte.ui.home.setting.webview

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.http.SslError
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.Window
import android.webkit.SslErrorHandler
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.sdei.chafte.R
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : AppCompatActivity() {
    var dialog: Dialog? = null
    companion object {
        //const val PAGE_URL = "https://ss.stagingsdei.com:3531/policy"
        const val PAGE_URL = "http://54.190.192.105:6167/api/v1/community/rule/"
        const val MAX_PROGRESS = 100
        fun newIntent(context: Context, pageUrl: String): Intent {
            val intent = Intent(context, WebViewActivity::class.java)
            intent.putExtra(PAGE_URL, pageUrl)
            return intent
        }
    }
    private lateinit var pageUrl: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        // get pageUrl from String
        pageUrl = PAGE_URL
            ?: throw IllegalStateException("field $PAGE_URL missing in Intent")
        showProgress()
        initWebView()
        setWebClient()
        handlePullToRefresh()
        loadUrl(pageUrl)
    }

    private fun handlePullToRefresh() {
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView() {
        webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override
            fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }
        }
    }
    private fun setWebClient() {
        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(
                view: WebView,
                newProgress: Int
            ) {
                super.onProgressChanged(view, newProgress)


                if (newProgress == MAX_PROGRESS) {
                   hideProgress()
                }
            }
        }
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Check if the key event was the Back button and if there's history
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack()
            return true
        }
        // If it wasn't the Back key or there's no web page history, exit the activity)
        return super.onKeyDown(keyCode, event)
    }
    private fun loadUrl(pageUrl: String) {
        webView.loadUrl(pageUrl)
    }

    fun showProgress() {
        dialog = Dialog(this)
        Log.e("dialogStatus", "dialog : $dialog")
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCancelable(false)
        dialog?.setContentView(R.layout.view_progress_dialog)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        if (!dialog!!.isShowing)
            dialog!!.show()
    }

    fun hideProgress() {

        if (dialog != null) {
            if (dialog!!.isShowing)
                dialog!!.dismiss()
        }
    }

}

