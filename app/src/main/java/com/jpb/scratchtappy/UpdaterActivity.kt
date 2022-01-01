package com.jpb.scratchtappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.bottomsheets.BottomSheet
import com.afollestad.materialdialogs.bottomsheets.setPeekHeight
import com.afollestad.materialdialogs.customview.customView

class UpdaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updater)
        this.title = "ST Updater"
        val update = findViewById<Button>(R.id.button7)
        update.setOnClickListener {
            val intent = Intent(applicationContext, whatsnew::class.java)
            startActivity(intent)
        }
        val updatecheck = findViewById<Button>(R.id.button12)
        updatecheck.setOnClickListener {
            val intent = Intent(applicationContext, VersionChooser::class.java)
            startActivity(intent)
        }
    }
}