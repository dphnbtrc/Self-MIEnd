package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class DepressionTestFragment : Fragment() {

    private val questionsDepression = listOf(
        "Little interest or pleasure in doing things",
        "Feeling down, depressed, or hopeless",
        "Trouble falling or staying asleep, sleeping to much",
        "Feeling tired or having little energy",
        "Poor appetite or overeating",
        "Feeling bad about yourself – or that you are a failure or have let yourself or your family down",
        "Trouble concentrating on things, such as reading the newspaper or watching television",
        "Moving or speaking so slowly that other people could have noticed. Or the opposite – being so fidgety or restless that you have been moving around a lot more than usual",
        "Thoughts that you would be better off dead, or of hurting yourself"
    )

    private var currentQuestionDepressionIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_depression_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayDepressionQuestion()

        val rateDepression1B = view.findViewById<Button>(R.id.rate1)

        rateDepression1B.setOnClickListener {
            showNextDepressionQuestion()
        }

        val rateDepression2B = view.findViewById<Button>(R.id.rate2)

        rateDepression2B.setOnClickListener {
            showNextDepressionQuestion()
        }

        val rateDepression3B = view.findViewById<Button>(R.id.rate3)

        rateDepression3B.setOnClickListener {
            showNextDepressionQuestion()
        }

        val rateDepression4B = view.findViewById<Button>(R.id.rate4)

        rateDepression4B.setOnClickListener {
            showNextDepressionQuestion()
        }

        val backToPreviousDepressionQuestionB = view.findViewById<Button>(R.id.backButton)

        backToPreviousDepressionQuestionB.setOnClickListener {
            showPreviousDepressionQuestion()
        }

        val toResultB2 = view.findViewById<Button>(R.id.nextButton)

        toResultB2.setOnClickListener {
            val resultS2 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS2)
            transaction.commit()
        }

        val toSelectTestB2 = view.findViewById<Button>(R.id.cancel_test_Button)

        toSelectTestB2.setOnClickListener {
            val selectS2 = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectS2)
            transaction.commit()
        }

    }

    private fun displayDepressionQuestion() {
        val questionsDepressionTry = requireView().findViewById<TextView>(R.id.testQuestionDepressionContainer)
        questionsDepressionTry.text = questionsDepression[currentQuestionDepressionIndex]
    }

    private fun showNextDepressionQuestion() {
        if (currentQuestionDepressionIndex < questionsDepression.size - 1) {
            currentQuestionDepressionIndex++
        } else {
            currentQuestionDepressionIndex = questionsDepression.size - 1
        }
        displayDepressionQuestion()
    }

    private fun showPreviousDepressionQuestion() {
        if (currentQuestionDepressionIndex > 0) {
            currentQuestionDepressionIndex--
        } else {
            currentQuestionDepressionIndex = 0
        }
        displayDepressionQuestion()
    }

}