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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exit_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val quitB = view.findViewById<Button>(R.id.yesButton)

        quitB.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid())
            exitProcess(1)
        }

        val backToHomeB = view.findViewById<Button>(R.id.noButton)

        backToHomeB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.commit()
        }
    }
}

