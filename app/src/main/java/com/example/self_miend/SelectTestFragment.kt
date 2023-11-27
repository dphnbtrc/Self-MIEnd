package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class SelectTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_selecttest, container, false)

        val backButton = view.findViewById<Button>(R.id.backButton2)
        backButton.setOnClickListener {
            val homeFragment = HomeFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, homeFragment,)
            transactionSelectTestFragment.commit()

            backButton.visibility = View.GONE
        }

        val anxietyButton = view.findViewById<Button>(R.id.anxietyTestButton)
        anxietyButton.setOnClickListener {
            val testFragment = TestFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, testFragment,)
            transactionSelectTestFragment.commit()

            anxietyButton.visibility = View.GONE
        }

        val depressionButton = view.findViewById<Button>(R.id.depressionTestButton)
        depressionButton.setOnClickListener {
            val testFragment = TestFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, testFragment,)
            transactionSelectTestFragment.commit()

            depressionButton.visibility = View.GONE
        }

        val internetAddictionButton = view.findViewById<Button>(R.id.internetAddictionTestButton)
        internetAddictionButton.setOnClickListener {
            val testFragment = TestFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, testFragment,)
            transactionSelectTestFragment.commit()

            internetAddictionButton.visibility = View.GONE
        }

        val stressButton = view.findViewById<Button>(R.id.stressTestButton)
        stressButton.setOnClickListener {
            val testFragment = TestFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, testFragment,)
            transactionSelectTestFragment.commit()

            stressButton.visibility = View.GONE
        }

        return view
    }

}