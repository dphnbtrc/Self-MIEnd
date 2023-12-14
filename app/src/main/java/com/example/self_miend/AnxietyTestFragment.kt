package com.example.self_miend

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class AnxietyTestFragment : Fragment() {

    private var scoreAnxietyTest = 0

    private val questionsAnxiety = listOf(
        "Feeling nervous, anxious, or on edge",
        "Not being able to stop or control worrying",
        "Worrying too much about different things",
        "Trouble relaxing",
        "Being so restless that it is hard to sit still",
        "Becoming easily annoyed or irritable",
        "Feeling afraid, as if something awful might happen"
    )

    private var dataPassListener: DataPassListener? = null

    private var currentQuestionAnxietyIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anxiety_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayAnxietyQuestion()

        val rate1AnxietyB = view.findViewById<Button>(R.id.rate1)

        rate1AnxietyB.setOnClickListener {

            if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {

                rate1AnxietyB.isEnabled = false
            }

            showNextAnxietyQuestion()
            updateAnxietyScore(0)
        }

        val rate2AnxietyB = view.findViewById<Button>(R.id.rate2)

        rate2AnxietyB.setOnClickListener {

            if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {

                rate2AnxietyB.isEnabled = false
            }

            showNextAnxietyQuestion()
            updateAnxietyScore(1)
        }

        val rate3AnxietyB = view.findViewById<Button>(R.id.rate3)

        rate3AnxietyB.setOnClickListener {

            if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {

                rate3AnxietyB.isEnabled = false
            }

            showNextAnxietyQuestion()
            updateAnxietyScore(2)
        }

        val rate4AnxietyB = view.findViewById<Button>(R.id.rate4)

        rate4AnxietyB.setOnClickListener {

            if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {

                rate4AnxietyB.isEnabled = false
            }

            showNextAnxietyQuestion()
            updateAnxietyScore(3)
        }

        val backToPreviousAnxietyQuestionB = view.findViewById<Button>(R.id.backButton)

        backToPreviousAnxietyQuestionB.setOnClickListener {
            showPreviousAnxietyQuestion()
        }

        val toResultB1 = view.findViewById<Button>(R.id.nextButton)

        toResultB1.setOnClickListener {

            passDataToResultFragment()

            val resultS1 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS1)
            transaction.addToBackStack(null)
            transaction.commit()


            val bundle = Bundle().apply {
                putBoolean("comingFromAnxietyTest", true)
            }

            resultS1.arguments = bundle

            }

        val toSelectTestB1 = view.findViewById<Button>(R.id.cancel_test_Button)

        toSelectTestB1.setOnClickListener {
            val selectS1 = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectS1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

    private fun updateAnxietyScore(value: Int) {
        scoreAnxietyTest += value
    }

    private fun displayAnxietyQuestion() {
        val questionsAnxietyTry = requireView().findViewById<TextView>(R.id.testQuestionAnxietyContainer)
        questionsAnxietyTry.text = questionsAnxiety[currentQuestionAnxietyIndex]
    }

    private fun showNextAnxietyQuestion() {
        if (currentQuestionAnxietyIndex < questionsAnxiety.size - 1) {
            currentQuestionAnxietyIndex++
        } else {
            currentQuestionAnxietyIndex = questionsAnxiety.size - 1
        }
        displayAnxietyQuestion()
    }

    private fun showPreviousAnxietyQuestion() {
        if (currentQuestionAnxietyIndex > 0) {
            currentQuestionAnxietyIndex--
        } else {
            currentQuestionAnxietyIndex = 0
        }
        displayAnxietyQuestion()
    }
    private fun passDataToResultFragment() {
        val myStringValue = "Hello, Fragment B!"
        val myIntValue = 30
        dataPassListener?.onDataPassed(myStringValue, myIntValue)
    }
    override fun onAttach(anxietyContext: Context) {
        super.onAttach(anxietyContext)
        if (anxietyContext is DataPassListener) {
            dataPassListener = anxietyContext
        }
    }

}