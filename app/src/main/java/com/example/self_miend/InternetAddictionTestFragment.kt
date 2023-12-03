package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class InternetAddictionTestFragment : Fragment() {

    private val questionsInternetAddiction = listOf(
        "How often do you find that you stay online longer than you intended?",
        "How often do you neglect household chores to spend more time online?",
        "How often do you prefer the excitement of the Internet to intimacy with your partner?",
        "How often do you form new relationships with fellow online users?",
        "How often do others in your life complain to you about the amount of time you spend online?",
        "How often do your grades or school work suffer because of the amount of time you spend online?",
        "How often do you check your email before something else that you need to do?",
        "How often does your job performance or productivity suffer because of the Internet?",
        "How often do you become defensive or secretive when anyone asks you what you do online?",
        "How often do you block out disturbing thoughts about your life with soothing thoughts of the Internet?",
        "How often do you find yourself anticipating when you will go online again?",
        "How often do you fear that life without the Internet would be boring, empty, and joyless?",
        "How often do you snap, yell, or act annoyed if someone bothers you while you are online?",
        "How often do you lose sleep due to being online?",
        "How often do you feel preoccupied with the Internet when off-line, or fantasize about being online?",
        "How often do you find yourself saying \"just a few more minutes\" when online?",
        "How often do you try to cut down the amount of time you spend online and fail?",
        "How often do you try to hide how long you've been online?",
        "How often do you choose to spend more time online over going out with others?",
        "How often do you feel depressed, moody, or nervous when you are off-line, which goes away once you are back online?"
    )

    private var currentQuestionInternetAddictionIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_internet_addiction_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayInternetAddictionQuestion()

        val rateInternetAddiction1B = view.findViewById<Button>(R.id.rate1)

        rateInternetAddiction1B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val rateInternetAddiction2B = view.findViewById<Button>(R.id.rate2)

        rateInternetAddiction2B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val rateInternetAddiction3B = view.findViewById<Button>(R.id.rate3)

        rateInternetAddiction3B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val rateInternetAddiction4B = view.findViewById<Button>(R.id.rate4)

        rateInternetAddiction4B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val rateInternetAddiction5B = view.findViewById<Button>(R.id.rate5)

        rateInternetAddiction5B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val rateInternetAddiction6B = view.findViewById<Button>(R.id.rate6)

        rateInternetAddiction6B.setOnClickListener {
            showNextInternetAddictionQuestion()
        }

        val backToPreviousInternetAddictionQuestionB = view.findViewById<Button>(R.id.backButton)

        backToPreviousInternetAddictionQuestionB.setOnClickListener {
            showPreviousInternetAddictionQuestion()
        }

        val toResultB3 = view.findViewById<Button>(R.id.nextButton)

        toResultB3.setOnClickListener {
            val resultS3 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS3)
            transaction.commit()
        }

        val toSelectTestB3 = view.findViewById<Button>(R.id.cancel_test_Button)

        toSelectTestB3.setOnClickListener {
            val selectS3 = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectS3)
            transaction.commit()
        }

    }

    private fun displayInternetAddictionQuestion() {
        val questionsInternetAddictionTry = requireView().findViewById<TextView>(R.id.testQuestionInternetContainer)
        questionsInternetAddictionTry.text = questionsInternetAddiction[currentQuestionInternetAddictionIndex]
    }

    private fun showNextInternetAddictionQuestion() {
        if (currentQuestionInternetAddictionIndex < questionsInternetAddiction.size - 1) {
            currentQuestionInternetAddictionIndex++
        } else {
            currentQuestionInternetAddictionIndex = questionsInternetAddiction.size - 1
        }
        displayInternetAddictionQuestion()
    }

    private fun showPreviousInternetAddictionQuestion() {
        if (currentQuestionInternetAddictionIndex > 0) {
            currentQuestionInternetAddictionIndex--
        } else {
            currentQuestionInternetAddictionIndex = 0
        }
        displayInternetAddictionQuestion()
    }

}