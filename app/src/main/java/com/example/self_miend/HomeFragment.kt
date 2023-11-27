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
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val openTestsButton = view.findViewById<Button>(R.id.openDiffTestsButton)
        openTestsButton.setOnClickListener {
            val selectTestFragment = SelectTestFragment()
            val transactionSelectTestFragment: FragmentTransaction = requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, selectTestFragment,)
            transactionSelectTestFragment.commit()

            openTestsButton.visibility = View.GONE
        }

        val openActButton = view.findViewById<Button>(R.id.openActivitiesButton)
        openActButton.setOnClickListener {
            val activitiesToTryFragment = ActivitiesFragment()
            val transactionActToTryFragment: FragmentTransaction = requireFragmentManager().beginTransaction()
            transactionActToTryFragment.replace(R.id.activityMainLayout, activitiesToTryFragment,)
            transactionActToTryFragment.commit()

            openActButton.visibility = View.GONE
        }

        return view

    }
}
