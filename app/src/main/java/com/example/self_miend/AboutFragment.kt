package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class AboutFragment : Fragment() {

    //A fragment that tells what the app is all about
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //A button to go the next fragment, Greeting Fragment
        val toGreetingB = view.findViewById<Button>(R.id.openGreetingButton)

        toGreetingB.setOnClickListener {
            val greetingS = GreetingFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, greetingS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}