package com.example.animatebuttons

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fadeBtn = findViewById<Button>(R.id.fadeBtn)
        val zoomBtn = findViewById<Button>(R.id.zoomBtn)
        val spinBtn = findViewById<Button>(R.id.spinBtn)
        val dropBtn = findViewById<Button>(R.id.dropBtn)
        val flashBtn = findViewById<Button>(R.id.flashBtn)
        val slideBtn = findViewById<Button>(R.id.slideBtn)

        fadeBtn.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade)
            fadeBtn.startAnimation(animation)
        }
        zoomBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.zoom)
            zoomBtn.startAnimation(animation)
        }
        spinBtn.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.spin)
            spinBtn.startAnimation(animation)
        }
        dropBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.drop)
            dropBtn.startAnimation(animation)
        }
        flashBtn.setOnClickListener{
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.flash)
            flashBtn.startAnimation(animation)
        }
        slideBtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.slide)
            slideBtn.startAnimation(animation)
        }


    }


}
