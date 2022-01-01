package com.jpb.scratchtappy

import android.content.Intent
import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.color.colorChooser
import java.util.ArrayList

class ColourDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colour_dialog)
        val button: Button = findViewById(R.id.button8)
        val mibutton: Button = findViewById(R.id.button10)
        val iphonebutton: Button = findViewById(R.id.button9)
        val emuibutton: Button = findViewById(R.id.button11)
        val update = findViewById<Button>(R.id.button14)
        update.setOnClickListener {
            val intent = Intent(applicationContext, AdvancedColour::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            // Do something in response to button click
            val colors = intArrayOf(rgb(244,67,54), rgb(233,30,99), rgb(156,39,176), rgb(103,58,183), rgb(63,81,181), rgb(33,150,243), rgb(3,169,244), rgb(0,188,212),rgb(0,150,136), rgb(76,175,80), rgb(139,195,74), rgb(205,220,57), rgb(255,235,59), rgb(255,193,7), rgb(255,152,0), rgb(255,87,34) )
            MaterialDialog(this).show {
                title(R.string.colors)
                colorChooser(colors) { dialog, color ->
                    // Use color integer
                }
                positiveButton(R.string.select)
            }
        }
        mibutton.setOnClickListener {
            // Do something in response to button click
            val micolors = intArrayOf(rgb(250,249,248), rgb(255,202,101), rgb(255,131,153), rgb(104,235,193), rgb(124,213,253), rgb(8,136,249))
            MaterialDialog(this).show {
                title(R.string.micolors)
                colorChooser(micolors) { dialog, color ->
                    // Use color integer
                }
                positiveButton(R.string.select)
            }
        }
        iphonebutton.setOnClickListener {
            // Do something in response to button click
            val icolors = intArrayOf(rgb(0,122,255), rgb(53,199,90), rgb(87,85,214), rgb(255,149,0), rgb(255,44,85), rgb(175,82,222), rgb(255,59,48), rgb(89,200,251), rgb(255,204,0))
            MaterialDialog(this).show {
                title(R.string.icolors)
                colorChooser(icolors) { dialog, color ->
                    // Use color integer
                }
                positiveButton(R.string.select)
            }
        }
        emuibutton.setOnClickListener {
            // Do something in response to button click
            val emuicolors = intArrayOf(rgb(191, 177, 204), rgb(174, 198, 212), rgb(173, 199, 175),rgb(214, 201, 173),rgb(222, 189, 182),rgb(217, 189, 197))
            MaterialDialog(this).show {
                title(R.string.emuicolors)
                colorChooser(emuicolors) { dialog, color ->
                    // Use color integer
                }
                positiveButton(R.string.select)
            }
        }
    }

}

