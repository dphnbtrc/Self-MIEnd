package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class ResultDoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result_done, container, false)

        val goBackHomeButton = view.findViewById<Button>(R.id.button6)
        goBackHomeButton.setOnClickListener {
            val homeFragment = HomeFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeFragment)
            transaction.commit()

            goBackHomeButton.visibility = View.GONE
        }
        return view
    }
}