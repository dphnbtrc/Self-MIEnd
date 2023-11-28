package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class ExitDialogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_exit_dialog, container, false)

        val backHomeButton = view.findViewById<Button>(R.id.noButton)
        val exitSelfButton = view.findViewById<Button>(R.id.yesButton)

        backHomeButton.setOnClickListener {
            val homeFragment = HomeFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, homeFragment,)
            transactionSelectTestFragment.commit()

            backHomeButton.visibility = View.GONE
            exitSelfButton.visibility = View.GONE
        }

        exitSelfButton.setOnClickListener {
           android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(1)
        }



        return view
    }
}