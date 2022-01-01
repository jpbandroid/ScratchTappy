package com.jpb.scratchtappy

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

import android.content.pm.PackageManager

import android.os.Build
import android.util.Log


class UpdateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (haveStoragePermission() == false)
            {
                haveStoragePermission()
            }
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        val webview = findViewById<WebView>(R.id.webview)
        webview.loadUrl("https://occoam.com/jpb/wp-content/uploads/stapk.apk")
        webview.webViewClient = MyClient()
        val updatecheck = findViewById<Button>(R.id.button21)
        updatecheck.setOnClickListener {
            val url = "https://occoam.com/jpb/wp-content/uploads/stapk.apk"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        webview.setDownloadListener { url, userAgent, contentDisposition, mimeType, contentLength ->
            val request = android.app.DownloadManager.Request(android.net.Uri.parse(url))
            request.setMimeType(mimeType)
            request.addRequestHeader("cookie",
                android.webkit.CookieManager.getInstance().getCookie(url))
            request.addRequestHeader("User-Agent", userAgent)
            request.setDescription("Downloading ST update...")
            request.setTitle(android.webkit.URLUtil.guessFileName(url,
                contentDisposition,
                mimeType))
            request.allowScanningByMediaScanner()
            request.setNotificationVisibility(android.app.DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            request.setDestinationInExternalFilesDir(this@UpdateActivity,
                Environment.DIRECTORY_DOWNLOADS,
                ".apk")
            val dm =
                getSystemService(android.content.Context.DOWNLOAD_SERVICE) as android.app.DownloadManager
            dm.enqueue(request)
            android.widget.Toast.makeText(applicationContext,
                "Downloading ST Update. Please wait until the download finishes...",
                android.widget.Toast.LENGTH_LONG).show()
        }

    }

    class MyClient : android.webkit.WebViewClient() {
        override fun shouldOverrideUrlLoading(view: android.webkit.WebView, Url: String): Boolean {
            view.loadUrl(Url)
            return true

        }
    }

    fun haveStoragePermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.MANAGE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.e("Permission error", "You have permission")
                true
            } else {
                Log.e("Permission error", "You have asked for permission")
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
                false
            }
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.e("Permission error", "You have permission")
                true
            } else {
                Log.e("Permission error", "You have asked for permission")
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
                false
            }
        } else { //you dont need to worry about these stuff below api level 23
            Log.e("Permission error", "You already have the permission")
            true
        }
    }
}
