package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class AnxietyTestFragment : Fragment() {

    private val questionsAnxiety = listOf(
        "Feeling nervous, anxious, or on edge",
        "Not being able to stop or control worrying",
        "Worrying too much about different things",
        "Trouble relaxing",
        "Being so restless that it is hard to sit still",
        "Becoming easily annoyed or irritable",
        "Feeling afraid, as if something awful might happen"
    )

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

        val rate1B = view.findViewById<Button>(R.id.rate1)

        // Add a button click listener to load the next question
        rate1B.setOnClickListener {
            showNextAnxietyQuestion()
        }

        val toResultB1 = view.findViewById<Button>(R.id.nextButton)

        toResultB1.setOnClickListener {
            val resultS1 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS1)
            transaction.commit()
        }
    }
    private fun displayAnxietyQuestion() {
        val questionsAnxietyTry = requireView().findViewById<TextView>(R.id.testQuestionAnxietyContainer)
        questionsAnxietyTry.text = questionsAnxiety[currentQuestionAnxietyIndex]
    }

    private fun showNextAnxietyQuestion() {
        currentQuestionAnxietyIndex = (currentQuestionAnxietyIndex + 1) % questionsAnxiety.size
        displayAnxietyQuestion()
    }

}