package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val aboutFragButton = view.findViewById<Button>(R.id.openGreetingButton)
        aboutFragButton.setOnClickListener {
            val greetingFragment = GreetingFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.activityMainLayout, greetingFragment)
            transaction.commit()

            aboutFragButton.visibility = View.GONE
        }
        return view
    }
}

