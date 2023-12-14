package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class StressTestFragment : Fragment() {

    private val questionsStress = listOf(
        "In the last month, how often have you been upset because of something that happened unexpectedly?",
        "In the last month, how often have you felt that you were unable to control the important things in your life?",
        "In the last month, how often have you felt nervous and stressed?",
        "In the last month, how often have you felt confident about your ability to handle your personal problems?",
        "In the last month, how often have you felt that things were going your way?",
        "In the last month, how often have you found that you could not cope with all the things that you had to do?",
        "In the last month, how often have you been able to control irritations in your life?",
        "In the last month, how often have you felt that you were on top of things?",
        "In the last month, how often have you been angered because of things that happened that were outside of your control?",
        "In the last month, how often have you felt difficulties were piling up so high that you could not overcome them?"
    )

    private var currentQuestionStressIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stress_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayStressQuestion()

        val rateStress1B = view.findViewById<Button>(R.id.rate1)

        rateStress1B.setOnClickListener {
            showNextStressQuestion()
        }

        val rateStress2B = view.findViewById<Button>(R.id.rate2)

        rateStress2B.setOnClickListener {
            showNextStressQuestion()
        }

        val rateStress3B = view.findViewById<Button>(R.id.rate3)

        rateStress3B.setOnClickListener {
            showNextStressQuestion()
        }

        val rateStress4B = view.findViewById<Button>(R.id.rate4)

        rateStress4B.setOnClickListener {
            showNextStressQuestion()
        }

        val rateStress5B = view.findViewById<Button>(R.id.rate5)

        rateStress5B.setOnClickListener {
            showNextStressQuestion()
        }

        val backToPreviousStressQuestionB = view.findViewById<Button>(R.id.backButton)

        backToPreviousStressQuestionB.setOnClickListener {
            showPreviousStressQuestion()
        }

        val toResultB4 = view.findViewById<Button>(R.id.nextButton)

        toResultB4.setOnClickListener {
            val resultS4 = ResultFragment()
            val transaction: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS4)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val toSelectTestB4 = view.findViewById<Button>(R.id.cancel_test_Button)

        toSelectTestB4.setOnClickListener {
            val selectS4 = SelectTestFragment()
            val transaction: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectS4)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

    private fun displayStressQuestion() {
        val questionsStressTry =
            requireView().findViewById<TextView>(R.id.testQuestionStressContainer)
        questionsStressTry.text = questionsStress[currentQuestionStressIndex]
    }

    private fun showNextStressQuestion() {
        if (currentQuestionStressIndex < questionsStress.size - 1) {
            currentQuestionStressIndex++
        } else {
            currentQuestionStressIndex = questionsStress.size - 1
        }
        displayStressQuestion()
    }

    private fun showPreviousStressQuestion() {
        if (currentQuestionStressIndex > 0) {
            currentQuestionStressIndex--
        } else {
            currentQuestionStressIndex = 0
        }
        displayStressQuestion()
    }

}