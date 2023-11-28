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
        return inflater.inflate(R.layout.fragment_selecttest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toAnxietyB = view.findViewById<Button>(R.id.anxietyTestButton)

        toAnxietyB.setOnClickListener {
            val anxietyS = AnxietyTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, anxietyS)
            transaction.commit()
        }

        val toDepressionB = view.findViewById<Button>(R.id.depressionTestButton)

        toDepressionB.setOnClickListener {
            val depressionS = DepressionTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, depressionS)
            transaction.commit()
        }

        val toInternetAddictionB = view.findViewById<Button>(R.id.internetAddictionTestButton)

        toInternetAddictionB.setOnClickListener {
            val internetAddictionS = InternetAddictionTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, internetAddictionS)
            transaction.commit()
        }

        val toStressB = view.findViewById<Button>(R.id.stressTestButton)

        toStressB.setOnClickListener {
            val stressS = StressTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, stressS)
            transaction.commit()
        }

        val toHomeAgainB = view.findViewById<Button>(R.id.backToHomeButton)

        toHomeAgainB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.commit()
        }
    }
}