package com.jpb.scratchtappy

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat

class VersionChooser : AppCompatActivity() {
    var url = "https://occoam.com/jpb/wp-content/uploads/stupdate.html"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_version_chooser)
        val update = findViewById<Button>(R.id.button20)
        update.setOnClickListener {
            // initializing object for custom chrome tabs.
            // initializing object for custom chrome tabs.
            val customIntent = CustomTabsIntent.Builder()

            // below line is setting toolbar color
            // for our custom chrome tab.

            // below line is setting toolbar color
            // for our custom chrome tab.
            customIntent.setToolbarColor(
                ContextCompat.getColor(
                    this@VersionChooser,
                    R.color.purple_500
                )
            )

            // we are calling below method after
            // setting our toolbar color.

            // we are calling below method after
            // setting our toolbar color.
            openCustomTab(this@VersionChooser, customIntent.build(), Uri.parse(url))
        }
    }
    fun openCustomTab(activity: Activity, customTabsIntent: CustomTabsIntent, uri: Uri?) {
        // package name is the default package
        // for our custom chrome tab
        val packageName = "com.android.chrome"
        if (packageName != null) {

            // we are checking if the package name is not null
            // if package name is not null then we are calling
            // that custom chrome tab with intent by passing its
            // package name.
            customTabsIntent.intent.setPackage(packageName)

            // in that custom tab intent we are passing
            // our url which we have to browse.
            customTabsIntent.launchUrl(activity, uri!!)
        } else {
            // if the custom tabs fails to load then we are simply
            // redirecting our user to users device default browser.
            activity.startActivity(Intent(Intent.ACTION_VIEW, uri))
        }
    }
}