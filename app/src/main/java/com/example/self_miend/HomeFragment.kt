package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toSelectTestB = view.findViewById<Button>(R.id.openDiffTestsButton)

        toSelectTestB.setOnClickListener {
            val selectTestS = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectTestS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val toActAndTips = view.findViewById<Button>(R.id.openActivitiesButton)

        toActAndTips.setOnClickListener {
            val genActTipsS = GeneralActsTipsFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, genActTipsS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val exitB = view.findViewById<Button>(R.id.exitButton)

        exitB.setOnClickListener {
            val exitS = ExitDialogFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, exitS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}