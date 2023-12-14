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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toResultDoneB = view.findViewById<Button>(R.id.resultDoneButton)

        val testResultScore = requireView().findViewById<TextView>(R.id.testResultScore)

        val scoreResultAnxiety = arguments?.getInt("AnxietyScore", 0) ?: 0
        testResultScore.text = "$scoreResultAnxiety"

        when (scoreResultAnxiety) {
            in 0..4 -> {
                testResultScore.text = getString(R.string.anxietyR1)
            }
            in 5..9 -> {
                testResultScore.text = getString(R.string.anxietyR2)
            }
            in 10..14 -> {
                testResultScore.text = getString(R.string.anxietyR3)
            }
            in 15..21 -> {
                testResultScore.text = getString(R.string.anxietyR4)
            }
        }

        val scoreResultDepression = arguments?.getInt("DepressionScore", 0) ?: 0
        testResultScore.text = "$scoreResultDepression"

        when (scoreResultDepression) {
            in 0..4 -> {
                testResultScore.text = getString(R.string.depressionR1)
            }
            in 5..9 -> {
                testResultScore.text = getString(R.string.depressionR2)
            }
            in 10..14 -> {
                testResultScore.text = getString(R.string.depressionR3)
            }
            in 15..19 -> {
                testResultScore.text = getString(R.string.depressionR4)
            }
            in 20..27 -> {
                testResultScore.text = getString(R.string.depressionR5)
            }
        }

        val scoreResultInternetAddiction = arguments?.getInt("InternetAddictionScore", 0) ?: 0
        testResultScore.text = "$scoreResultInternetAddiction"

        when (scoreResultInternetAddiction) {
            in 0..30 -> {
                testResultScore.text = getString(R.string.internetAddictionR1)
            }
            in 31..49 -> {
                testResultScore.text = getString(R.string.internetAddictionR2)
            }
            in 50..79 -> {
                testResultScore.text = getString(R.string.internetAddictionR3)
            }
            in 80..100 -> {
                testResultScore.text = getString(R.string.internetAddictionR4)
            }

        }

        val scoreResultStress = arguments?.getInt("StressScore", 0) ?: 0
        testResultScore.text = "$scoreResultStress"

        when (scoreResultStress) {
            in 0..13 -> {
                testResultScore.text = getString(R.string.stressR1)
            }
            in 14..26 -> {
                testResultScore.text = getString(R.string.stressR2)
            }
            in 27..40 -> {
                testResultScore.text = getString(R.string.stressR3)
            }
        }

        toResultDoneB.setOnClickListener {
            val resultDoneS = ResultDoneFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultDoneS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}