package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class SelectTestFragment : Fragment() {

    //A fragment that lets the user choose what test to take from the four we have provided
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selecttest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //A button that when clicked, goes to the Anxiety Test, AnxietyTestFragment
        val toAnxietyB = view.findViewById<Button>(R.id.anxietyTestButton)

        toAnxietyB.setOnClickListener {
            val anxietyS = AnxietyTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, anxietyS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, goes to the Depression Test, DepressionTestFragment
        val toDepressionB = view.findViewById<Button>(R.id.depressionTestButton)

        toDepressionB.setOnClickListener {
            val depressionS = DepressionTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, depressionS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, goes to the IntAddiction Test, InternetAddictionTestFragment
        val toInternetAddictionB = view.findViewById<Button>(R.id.internetAddictionTestButton)

        toInternetAddictionB.setOnClickListener {
            val internetAddictionS = InternetAddictionTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, internetAddictionS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, goes to the Stress Test, StressTestFragment
        val toStressB = view.findViewById<Button>(R.id.stressTestButton)

        toStressB.setOnClickListener {
            val stressS = StressTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, stressS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, goes to back to the previous fragment, HomeFragment
        val toHomeAgainB = view.findViewById<Button>(R.id.backToHomeButton)

        toHomeAgainB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}