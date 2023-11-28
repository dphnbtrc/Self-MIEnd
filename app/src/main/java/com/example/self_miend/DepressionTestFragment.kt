package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DepressionTestFragment : Fragment() {

    data class DepressionTest(
        val depressionQ: List<String>
    )
    fun depressionTest() {
        val depressionA = listOf(
            "Not at all" to 0,
            "Several days" to 1,
            "More than half the days" to 2,
            "Nearly every day" to 3
        )

        val depressionQ = DepressionTest(
            listOf(
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
        )

        //
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_depression_test, container, false)
    }

}