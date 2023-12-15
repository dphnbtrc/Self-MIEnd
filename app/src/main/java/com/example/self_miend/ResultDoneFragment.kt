package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import kotlin.system.exitProcess

class ResultDoneFragment : Fragment() {

    //A fragment that lets the user choose an option if he/she wants to take another test or close the app
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result_done, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //A button that brings you back to the home of the app, HomeFragment
        val toHomeB2 = view.findViewById<Button>(R.id.backToHomeButton2)

        toHomeB2.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked closes/terminates the app
        val quitAppB2 = view.findViewById<Button>(R.id.quitAppButton2)

        quitAppB2.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)
        }

    }

}