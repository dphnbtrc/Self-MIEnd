package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class TestTesting : Fragment() {

    private val questionsArray = arrayOf(
        "What is your name?",
        "Where are you from?",
        "What is your favorite color?",
        // Add more questions as needed
    )
    private var currentQuestionIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test_testing, container, false)
        // Replace "fragment_your_fragment_name" with your actual fragment layout file
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayQuestion()

        val nextB = view.findViewById<Button>(R.id.nextButton)

        // Add a button click listener to load the next question
        nextB.setOnClickListener {
            showNextQuestion()
        }
    }

    private fun displayQuestion() {
        val questionsTry = requireView().findViewById<TextView>(R.id.questionsTest)
        questionsTry.text = questionsArray[currentQuestionIndex]
    }

    private fun showNextQuestion() {
        currentQuestionIndex = (currentQuestionIndex + 1) % questionsArray.size
        displayQuestion()
    }
}