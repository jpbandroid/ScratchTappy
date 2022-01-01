package com.jpb.scratchtappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VersionChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_version_chooser)
        val update = findViewById<Button>(R.id.button20)
        update.setOnClickListener {
            val intent = Intent(applicationContext, UpdateActivity::class.java)
            startActivity(intent)
        }
    }
}