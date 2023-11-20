package com.example.self_miend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startButton)
        button.setOnClickListener {
            replaceFragment(AboutFragment(), R.id.aboutFragment)
        }
    }

    private fun replaceFragment(fragment: Fragment, containerId: Int) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()

        transaction.replace(containerId, fragment)
        transaction.addToBackStack(null)  // Add the transaction to the back stack
        transaction.commit()

        Log.d("FragmentTransaction", "Transaction committed successfully")
    }
}