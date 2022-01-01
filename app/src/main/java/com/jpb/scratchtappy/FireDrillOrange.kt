package com.jpb.scratchtappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpb.scratchtappy.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.content.Intent
import android.view.View
import com.jpb.scratchtappy.FireDrillOrange
import com.jpb.scratchtappy.FireDrillLightBlue
import com.jpb.scratchtappy.FireDrillTeal
import com.jpb.scratchtappy.FireDrillEnd
import com.jpb.scratchtappy.FireDrillIndigo
import com.jpb.scratchtappy.FireDrillLightGreen
import com.jpb.scratchtappy.FireDrillBlue
import com.jpb.scratchtappy.FireDrillCyan
import com.jpb.scratchtappy.FireDrillLime
import com.jpb.scratchtappy.FireDrillYellow
import com.jpb.scratchtappy.FireDrillDeepOrange
import com.jpb.scratchtappy.FireDrillPurple
import com.jpb.scratchtappy.FireDrillDeepPurple
import com.jpb.scratchtappy.FireDrillPink
import com.jpb.scratchtappy.FireDrillGreen
import com.jpb.scratchtappy.FireDrillAmber

class FireDrillOrange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire_drill_orange)
        val app6 = findViewById<FloatingActionButton>(R.id.floatingActionButton15)
        app6.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent(applicationContext, FireDrillDeepOrange::class.java)
            startActivity(intent)
        })
    }
}