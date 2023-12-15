package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class SelfCareTipsAndActsFragment : Fragment() {

    //A fragment that shows the tips and what the user will do in a specific mental or issue or in general
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_self_care_tips_and_acts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toActAndTipsB = view.findViewById<Button>(R.id.backToActsAndTips)

        toActAndTipsB.setOnClickListener {
            val actAndTipsS = GeneralActsTipsFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, actAndTipsS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}