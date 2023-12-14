package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class GreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_greeting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toHomeB = view.findViewById<Button>(R.id.openHomeButton)

        val stringsList = listOf(
            "Hello",
            "Pisti ka",
            "Murag Fish",
            "killer"
            //Balyui dide yot an mga namefuls daphins
        )

        val randomIndex = (stringsList.indices).random()
        val randomString = stringsList[randomIndex]

        val greetingsRandom = view.findViewById<TextView>(R.id.textView6)

        greetingsRandom.text = randomString

        toHomeB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}