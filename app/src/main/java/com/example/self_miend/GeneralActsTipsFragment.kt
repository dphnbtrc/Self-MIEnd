package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class GeneralActsTipsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_general_acts_tips, container, false)

        val backButton = view.findViewById<Button>(R.id.backButton2)
        backButton.setOnClickListener {
            val homeFragment = HomeFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeFragment)
            transaction.commit()

            backButton.visibility = View.GONE
        }
        return view
    }
}