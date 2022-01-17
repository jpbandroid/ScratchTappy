package com.jpb.scratchtappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpb.scratchtappy.R
import android.os.Build
import android.widget.TextView
import androidx.cardview.widget.CardView
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.jpb.scratchtappy.UpdaterActivity

class Settings : AppCompatActivity() {
    var tap = 0
    var tapst = 0
    var tapee = 5
    var tapstee = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
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
                title(R.string.strate)
            }
        }
        val time = findViewById<CardView>(R.id.timecard)
        time.setOnClickListener {
            tap++
            tapee--
            if (tap == 5) {
                val intent = Intent(applicationContext, PlatLogoActivity::class.java)
                startActivity(intent)
            }
            else{
                val text = "Tap the clock " + tapee + " more times, and a surprise will unlock!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }
        val stcard = findViewById<CardView>(R.id.stcard)
        stcard.setOnClickListener {
            tapst++
            tapstee--
            if (tapst == 5) {
                val intent = Intent(applicationContext, FireDrillRed::class.java)
                startActivity(intent)
            }
            else{
                val text = "Tap the ScratchTappy icon " + tapstee + " more times, and a surprise will unlock!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }
        val change = findViewById<CardView>(R.id.logcard)
        change.setOnClickListener {
            MaterialDialog(this).show {
                title(R.string.st6title)
                message(R.string.changelog5)
                icon(R.drawable.ic_changelog)
            }
        }
    }
}