package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class ResultFragment : Fragment() {

    private val advicesListAnxiety = listOf(
        "Hello",
        "Pisti ka",
        "Murag Fish",
        "killer"
        //Ibutang dide teh
    )

    private val advicesListDepression = listOf(
        "Hello",
        "Pisti ka",
        "Murag Fish",
        "killer"
        //Ibutang dide teh
    )

    private val advicesListInternetAddiction = listOf(
        "Hello",
        "Pisti ka",
        "Murag Fish",
        "killer"
        //Ibutang dide teh
    )

    private val advicesListStress = listOf(
        "Hello",
        "Pisti ka",
        "Murag Fish",
        "killer"
        //Ibutang dide teh
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val testResultScore : TextView = requireView().findViewById(R.id.testResultScore)
        val testResultLevel : TextView = requireView().findViewById(R.id.testResultSeverity)

        //Anxiety Test
        val comingFromAnxietyTest = arguments?.getBoolean("comingFromAnxietyTest", false)

        val scoreResultAnxiety = arguments?.getInt("AnxietyScore", 0) ?: 0
        testResultScore.text = "$scoreResultAnxiety"

        if (comingFromAnxietyTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesAnxietyIndex = (advicesListAnxiety.indices).random()
            val randomAdvicesAnxiety = advicesListAnxiety[randomAdvicesAnxietyIndex]

            tipsOrQuotesOrAdvice.text = randomAdvicesAnxiety

            when (scoreResultAnxiety) {
                in 0..4 -> {
                    testResultLevel.text = getString(R.string.anxietyR1)
                }
                in 5..9 -> {
                    testResultLevel.text = getString(R.string.anxietyR2)
                }
                in 10..14 -> {
                    testResultLevel.text = getString(R.string.anxietyR3)
                }
                in 15..21 -> {
                    testResultLevel.text = getString(R.string.anxietyR4)
                }
            }
        }

        //Depression Test
        val comingFromDepressionTest = arguments?.getBoolean("comingFromDepressionTest", false)

        val scoreResultDepression = arguments?.getInt("DepressionScore", 0) ?: 0
        testResultScore.text = "$scoreResultDepression"

        if (comingFromDepressionTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesDepressionIndex = (advicesListDepression.indices).random()
            val randomAdvicesDepression = advicesListAnxiety[randomAdvicesDepressionIndex]

            tipsOrQuotesOrAdvice.text = randomAdvicesDepression

            when (scoreResultDepression) {
                in 0..4 -> {
                    testResultLevel.text = getString(R.string.depressionR1)
                }

                in 5..9 -> {
                    testResultLevel.text = getString(R.string.depressionR2)
                }

                in 10..14 -> {
                    testResultLevel.text = getString(R.string.depressionR3)
                }

                in 15..19 -> {
                    testResultLevel.text = getString(R.string.depressionR4)
                }

                in 20..27 -> {
                    testResultLevel.text = getString(R.string.depressionR5)
                }
            }
        }

        //InternetAddiction Test
        val comingFromInternetAddictionTest = arguments?.getBoolean("comingFromInternetAddictionTest", false)

        val scoreResultInternetAddiction = arguments?.getInt("InternetAddictionScore", 0) ?: 0
        testResultScore.text = "$scoreResultInternetAddiction"

        if (comingFromInternetAddictionTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesInternetAddictionIndex = (advicesListInternetAddiction.indices).random()
            val advicesListInternetAddiction = advicesListAnxiety[randomAdvicesInternetAddictionIndex]

            tipsOrQuotesOrAdvice.text = advicesListInternetAddiction

            when (scoreResultInternetAddiction) {
                in 0..30 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR1)
                }

                in 31..49 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR2)
                }

                in 50..79 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR3)
                }

                in 80..100 -> {
                    testResultLevel.text = getString(R.string.internetAddictionR4)
                }

            }
        }

        //Stress Test
        val comingFromStressTest = arguments?.getBoolean("comingFromStressTest", false)

        val scoreResultStress = arguments?.getInt("StressScore", 0) ?: 0
        testResultScore.text = "$scoreResultStress"

        if (comingFromStressTest == true) {

            val tipsOrQuotesOrAdvice = requireView().findViewById<TextView>(R.id.resultAdvice)

            val randomAdvicesStressIndex = (advicesListStress.indices).random()
            val advicesListStress = advicesListAnxiety[randomAdvicesStressIndex]

            tipsOrQuotesOrAdvice.text = advicesListStress

            when (scoreResultStress) {
                in 0..13 -> {
                    testResultLevel.text = getString(R.string.stressR1)
                }

                in 14..26 -> {
                    testResultLevel.text = getString(R.string.stressR2)
                }

                in 27..40 -> {
                    testResultLevel.text = getString(R.string.stressR3)
                }
            }
        }

        val toResultDoneB = view.findViewById<Button>(R.id.resultDoneButton)

        toResultDoneB.setOnClickListener {
            val resultDoneS = ResultDoneFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultDoneS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}