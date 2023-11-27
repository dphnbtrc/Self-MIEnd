package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        val doneButton = view.findViewById<Button>(R.id.resultDoneButton)
        doneButton.setOnClickListener {
            val resultDoneFragment = ResultDoneFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, resultDoneFragment,)
            transactionSelectTestFragment.commit()

            doneButton.visibility = View.GONE
        }

        //Hotline Call

        /*
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        val hotlineButton = view.findViewById<Button>(R.id.hotlineCall)
        hotlineButton.setOnClickListener {
            val resultDoneFragment = ResultDoneFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, resultDoneFragment,)
            transactionSelectTestFragment.commit()

            hotlineButton.visibility = View.GONE

        } */

        return view
    }

}