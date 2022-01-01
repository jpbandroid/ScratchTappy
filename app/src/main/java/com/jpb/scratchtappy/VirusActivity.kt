package com.jpb.scratchtappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class VirusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virus)
        val fab: FloatingActionButton = findViewById(R.id.floatingActionButton13)

        fab.setOnClickListener { view ->
            val intent = Intent(getApplicationContext(), ColourDialog::class.java)
            startActivity(intent)
        }
    }
}