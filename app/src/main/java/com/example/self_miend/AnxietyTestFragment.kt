package com.example.self_miend

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class AnxietyTestFragment : Fragment() {

    //Determining the score for the Test
    private var scoreAnxietyTest = 0

    //List of questions in the test
    private val questionsAnxiety = listOf(
        "Feeling nervous, anxious, or on edge",
        "Not being able to stop or control worrying",
        "Worrying too much about different things",
        "Trouble relaxing",
        "Being so restless that it is hard to sit still",
        "Becoming easily annoyed or irritable",
        "Feeling afraid, as if something awful might happen"
    )

    //Determining the index for the current question
    private var currentQuestionAnxietyIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anxiety_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Displaying the current question taking
        displayAnxietyQuestion()

        //Checking the index of the current question when it reaches the last, the button is enabled
        checkIndexAndUpdateButton()

        //A button for rating the score of the user depending on the question
        //The code for the other Rate Button are the same just with different values for the score
        val rate1AnxietyB = view.findViewById<Button>(R.id.rate1)

        rate1AnxietyB.setOnClickListener {

            //The button is not clickable unless it has reached the last question
            if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {
                rate1AnxietyB.isEnabled = false
            }

            //When the button is clicked, proceeds to the next question
            showNextAnxietyQuestion()

            //Updating the score of the user in the test he/she is currently taking
            //Other Buttons has different values ranging from 0-3
            //Depression ranges from 0-3, Internet Addiction from 0-5, and Stress from 0-4
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

        //A button that is only clickable when it reaches the last index of the question in the list
        //When clicked goes to the result of the score, ResultFragment
        val toAnxietyResultB1 = view.findViewById<Button>(R.id.testDoneButton)

        toAnxietyResultB1.setOnClickListener {

            val resultS1 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS1)
            transaction.addToBackStack(null)
            transaction.commit()

            //A bundle that saves the score of the user depending on the rates of the button he had chosen
            val bundle = Bundle().apply {

                //A boolean that certifies what fragment the user is taking and sends it to the next fragment
                //Which in the next fragment, ResultFragment, changes the strings to be used in the advice
                //On the level of severity, max and min score of the test taken.
                putBoolean("comingFromAnxietyTest", true)

                //An int that saves the score of the user depending on the rates of the button he had chosen
                putInt("AnxietyScore", scoreAnxietyTest)
            }
            resultS1.arguments = bundle
        }

        //A button that when clicked goes back to the selection of test and cancels the test itself
        val toSelectTestB1 = view.findViewById<Button>(R.id.cancel_test_Button)

        toSelectTestB1.setOnClickListener {
            val selectS1 = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectS1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

    //A function for checking the index to enable the button
    private fun checkIndexAndUpdateButton() {
        val doneButton = requireView().findViewById<Button>(R.id.testDoneButton)

        doneButton.isEnabled = false

        if (currentQuestionAnxietyIndex == questionsAnxiety.size - 1) {
            doneButton.isEnabled = true
        }

    }

    //A function to update the score by adding the value of what the user had clicked
    private fun updateAnxietyScore(value: Int) {
        scoreAnxietyTest += value
        Log.d("AnxietyTestFragment", "Current score: $scoreAnxietyTest")
    }

    //A function that displays the question of the test on the list that was made

    private fun displayAnxietyQuestion() {
        val questionsAnxietyTry = requireView().findViewById<TextView>(R.id.testQuestionAnxietyContainer)
        questionsAnxietyTry.text = questionsAnxiety[currentQuestionAnxietyIndex]
    }

    //A function that shows the next question
    private fun showNextAnxietyQuestion() {
        if (currentQuestionAnxietyIndex < questionsAnxiety.size - 1) {
            currentQuestionAnxietyIndex++
        } else {
            currentQuestionAnxietyIndex = questionsAnxiety.size - 1
        }
        displayAnxietyQuestion()
        checkIndexAndUpdateButton()
    }



}