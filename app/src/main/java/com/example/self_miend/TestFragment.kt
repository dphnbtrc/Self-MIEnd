package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TestFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TestFragment : Fragment() {

    data class AnxietyTest(
        val anxietyQ: List<String>
    )

    fun AnxietyTest() {
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

    data class DepressionTest(
        val depressionQ: List<String>
    )
    fun DepressionTest() {
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

    data class InternetAddictionTest(
        val iaQ: List<String>
    )
    fun InternetAddictionTest() {
        val iaA = listOf(
            "Not Applicable" to 0,
            "Rarely" to 1,
            "Occasionally" to 2,
            "Frequently" to 3,
            "Often" to 4,
            "Always" to 5
        )

        val iaQ = InternetAddictionTest(
            listOf(
                "How often do you find that you stay online longer than you intended?",

            )
        )

        //
    }

    /** TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    /**companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TestFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TestFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}