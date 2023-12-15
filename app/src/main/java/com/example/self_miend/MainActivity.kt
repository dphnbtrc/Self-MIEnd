package com.example.self_miend

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Main Screen of the app when it is first initialized
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startingButton = findViewById<Button>(R.id.startButton)
        startingButton.setOnClickListener {

            //To go to the next screen which is a fragment that shows the Disclaimer
            val goToFragmentS = DisclaimerFragment()

            supportFragmentManager.beginTransaction()
                .setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out)
                .replace(R.id.activityMainLayout, goToFragmentS)
                .addToBackStack(null)
                .commit()

            //Animation for the transition
            val fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            startingButton.startAnimation(fadeOutAnimation)
            startingButton.visibility = View.GONE

        }

    }
}
