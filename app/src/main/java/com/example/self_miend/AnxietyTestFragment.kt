package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController

class AnxietyTestFragment : Fragment() {

    private var testScore = 0
    private var anxietyQ = 0

    data class AnxietyTest(
        val anxietyQ: List<String>
    )

    fun anxietyTest() {
        val anxietyA = listOf(
            "Not at all" to 0,
            "Several days" to 1,
            "More than half the days" to 2,
            "Nearly every day" to 3
        )

        val anxietyQ = AnxietyTest(
            listOf(
                "Feeling nervous, anxious, or on edge",
                "Not being able to stop or control worrying",
                "Worrying too much about different things",
                "Trouble relaxing",
                "Being so restless that it is hard to sit still",
                "Becoming easily annoyed or irritable",
                "Feeling afraid, as if something awful might happen"
            )
        )

        //
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_anxiety_test, container, false)

        val toResultButton = view.findViewById<Button>(R.id.nextButton)

        toResultButton.setOnClickListener {
            val resultFragment = ResultFragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultFragment)
            transaction.commit()

            toResultButton.visibility = View.GONE
        }
        return view
    }
}