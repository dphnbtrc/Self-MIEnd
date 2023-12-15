package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import kotlin.system.exitProcess

class ExitDialogFragment : Fragment() {

    //A fragment to assure the User if he/she really wants to quit the app
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exit_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //A button that when clicked, closes/terminates the app
        val quitB = view.findViewById<Button>(R.id.yesButton)

        quitB.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)
        }

        //A button that when clicked, goes back to the previous fragment, HomeFragment
        val backToHomeB = view.findViewById<Button>(R.id.noButton)

        backToHomeB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}