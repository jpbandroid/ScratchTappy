package com.jpb.scratchtappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class whatsnew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatsnew)
        val ab: androidx.appcompat.app.ActionBar? = supportActionBar
        ab?.setTitle("What's new")
        ab?.setSubtitle("ScratchTappy-V7.0.0.2022.03.23")
    }
}