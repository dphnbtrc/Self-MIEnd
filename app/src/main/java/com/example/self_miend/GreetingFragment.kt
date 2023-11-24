package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.findNavController

class GreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_greeting, container, false)

        val greetFragButton = view.findViewById<Button>(R.id.openHomeButton)
        greetFragButton.setOnClickListener {
            val homeFragment = HomeFragment()
            val transaction: FragmentTransaction = requireFragmentManager()!!.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeFragment,)
            transaction.commit()

            greetFragButton.visibility = View.GONE
        }

        return view
    }
}