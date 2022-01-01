package com.jpb.scratchtappy

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView

class VideosSettings : AppCompatActivity() {
    var tap = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos_settings)
        this.title = "About Device"
        val deviceName = Build.MODEL
        val versionRelease = Build.VERSION.RELEASE
        val manufacturer = Build.MANUFACTURER
        //to add to textview
        val textView = findViewById<TextView>(R.id.textView28)
        textView.text = deviceName
        val vextView = findViewById<TextView>(R.id.textView30)
        vextView.text = versionRelease
        val sextView = findViewById<TextView>(R.id.textView32)
        sextView.text = manufacturer
        val update = findViewById<CardView>(R.id.update)
        update.setOnClickListener {
            val intent = Intent(applicationContext, UpdaterActivity::class.java)
            startActivity(intent)
        }
        val feedback = findViewById<CardView>(R.id.card)
        feedback.setOnClickListener {
            MaterialDialog(this).show {
                customView(R.layout.ratingbardialog)
                title(R.string.videorate)
            }
        }
        val time = findViewById<CardView>(R.id.timecard)
        time.setOnClickListener {
            tap++
            if (tap == 5) {
                val intent = Intent(applicationContext, PlatLogoActivity::class.java)
                startActivity(intent)
            }
        }
    }
}