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
        return inflater.inflate(R.layout.fragment_general_acts_tips, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toSelfCareB = view.findViewById<Button>(R.id.selfCareButton)

        toSelfCareB.setOnClickListener {
            val selfCareS = SelfCareTipsAndActsFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selfCareS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val toHomeB3 = view.findViewById<Button>(R.id.backHomeButton3)

        toHomeB3.setOnClickListener {
            val hS3 = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, hS3)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}