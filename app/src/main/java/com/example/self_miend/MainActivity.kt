package com.example.self_miend

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startingButton : Button = findViewById(R.id.startButton)
        startingButton.setOnClickListener {
            val aboutFragment = AboutFragment()
            val fragment : Fragment? =

            supportFragmentManager.findFragmentByTag(AboutFragment::class.java.simpleName)

            if (fragment !is AboutFragment) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.activityMainLayout, aboutFragment, AboutFragment::class.java.simpleName)
                    .commit()
            }
            startingButton.visibility = View.GONE
        }

    }
}