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

    data class AnxietyQuestion(
        val anxietyQ: String,
        val anxietyA: List<String>)

    private val AnxietyTest: MutableList<AnxietyQuestion> = mutableListOf(
        AnxietyQuestion(anxietyQ = "Feeling nervous, anxious, or on edge",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Not being able to stop or control worrying",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Worrying too much about different things",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Trouble relaxing",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Being so restless that it is hard to sit still",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Becoming easily annoyed or irritable",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        AnxietyQuestion(anxietyQ = "Feeling afraid, as if something awful might happen",
            anxietyA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
    )

    data class DepressionQuestion(
        val depressionQ: String,
        val depressionA: List<String>)

    private val DepressionTest: MutableList<DepressionQuestion> = mutableListOf(
        DepressionQuestion(depressionQ = "Little interest or pleasure in doing things?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Feeling down, depressed, or hopeless?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Trouble falling or staying asleep, sleeping to much?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Feeling tired or having little energy?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Poor appetite or overeating?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Feeling bad about yourself – or that you are a failure or have let yourself or your family down?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Trouble concentrating on things, such as reading the newspaper or watching television?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Moving or speaking so slowly that other people could have noticed. Or the opposite – being so fidgety or restless that you have been moving around a lot more than usual?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
        DepressionQuestion(depressionQ = "Thoughts that you would be better off dead, or of hurting yourself?",
            depressionA = listOf("Not at all", "Several days", "More than half the days", "Nearly everyday")),
    )

    data class InternetAddictionQuestion(
        val iaQ: String,
        val iaA: List<String>)

    private val InternetAddictionTest: MutableList<InternetAddictionQuestion> = mutableListOf(
        InternetAddictionQuestion(iaQ = "How often do you find that you stay online longer than you intended?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you neglect household chores to spend more time online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you prefer the excitement of the Internet to intimacy with your partner?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you form new relationships with fellow online users?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do others in your life complain to you about the amount of time you spend online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do your grades or school work suffer because of the amount of time you spend online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you check your email before something else that you need to do?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often does your job performance or productivity suffer because of the Internet?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you become defensive or secretive when anyone asks you what you do online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you block out disturbing thoughts about your life with soothing thoughts of the Internet?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you find yourself anticipating when you will go online again?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you fear that life without the Internet would be boring, empty, and joyless?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you snap, yell, or act annoyed if someone bothers you while you are online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you lose sleep due to being online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you feel preoccupied with the Internet when off-line, or fantasize about being online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you find yourself saying \"just a few more minutes\" when online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you try to cut down the amount of time you spend online and fail?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you try to hide how long you've been online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you choose to spend more time online over going out with others?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),
        InternetAddictionQuestion(iaQ = "How often do you feel depressed, moody, or nervous when you are off-line, which goes away once you are back online?",
            iaA = listOf("Not Applicable", "Rarely", "Occasionally", "Frequently", "Often", "Always")),

    )

    data class PTSDQuestion(
        val ptsdQ: String,
        val ptsdA: List<String>)

    private val PTSDTest: MutableList<PTSDQuestion> = mutableListOf(
        PTSDQuestion(ptsdQ = "Repeated, disturbing, and unwanted memories of the stressful experience?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Repeated, disturbing dreams of the stressful experience?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Suddenly feeling or acting as if the stressful experience were actually happening again (as if you were actually back there reliving it)?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Feeling very upset when something reminded you of the stressful experience?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Having strong physical reactions when something reminded you of the stressful experience (e.g., heart pounding, trouble breathing, sweating)?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Avoiding memories, thoughts, or feelings related to the stressful experience?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Avoiding external reminders of the stressful experience (e.g., people, places, conversation, activities, objects, or situations)?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Trouble remembering important parts of the stressful experience?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Having strong negative beliefs about yourself, other people, or the world (e.g., having thoughts such as: I am bad, there is something seriously wrong with me, no one can be trusted, the world is completely dangerous)?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Blaming yourself or someone else for the stressful experience or what happened after it?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Having strong negative feelings such as fear, horror, anger, guilt, or shame?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Loss of interest in activities that you used to enjoy?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Feeling distant or cut off from other people?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Trouble experiencing positive feelings (e.g., being unable to feel happiness or have loving feelings for people close to you)?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Irritable behavior, angry outbursts, or acting aggressively?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Taking too many risks or doing things that could cause you harm?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
        PTSDQuestion(ptsdQ = "Being “super-alert” or watchful on guard?",
            ptsdA = listOf("Not at all", "A little bit", "Moderately", "Quite a bit", "Extremely")),
    )

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