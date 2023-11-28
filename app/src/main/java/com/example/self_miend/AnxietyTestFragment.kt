package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AnxietyTestFragment : Fragment() {

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

    data class InternetAddictionTest(
        val iaQ: List<String>
    )
    fun internetAddictionTest() {
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
        )

        //
    }

    data class StressTest(
        val anxietyQ: List<String>
    )

    fun stressTest() {
        val stressA = listOf(
            "Never" to 0,
            "Almost Never" to 1,
            "Sometimes" to 2,
            "Fairly often" to 3,
            "Very often" to 4
        )

        val stressQ = StressTest(
            listOf(
                "In the last month, how often have you been upset because of something that happened unexpectedly?",
                "In the last month, how often have you felt that you were unable to control the important things in your life?",
                "In the last month, how often have you felt nervous and stressed?",
                "In the last month, how often have you felt confident about your ability to handle your personal problems?",
                "In the last month, how often have you felt that things were going your way?",
                "In the last month, how often have you found that you could not cope with all the things that you had to do?",
                "In the last month, how often have you been able to control irritations in your life?",
                "In the last month, how often have you felt that you were on top of things?",
                "In the last month, how often have you been angered because of things that happened that were outside of your control?",
                "In the last month, how often have you felt difficulties were piling up so high that you could not overcome them?"
            )
        )

        //
    }

    data class PTSDTest(
        val ptsdQ: List<String>
    )

    fun ptsdTest() {
        val ptsdA = listOf(
            "Not at all" to 0,
            "A little bit" to 1,
            "Moderately" to 2,
            "Quite a bit" to 3,
            "Extremely" to 4
        )

        val ptsdQ = PTSDTest(
            listOf(
                "Repeated, disturbing, and unwanted memories of the stressful experience?",
                "Repeated, disturbing dreams of the stressful experience?",
                "Suddenly feeling or acting as if the stressful experience were actually happening again (as if you were actually back there reliving it)?",
                "Feeling very upset when something reminded you of the stressful experience?",
                "Having strong physical reactions when something reminded you of the stressful experience (e.g., heart pounding, trouble breathing, sweating)?",
                "Avoiding memories, thoughts, or feelings related to the stressful experience?",
                "Avoiding external reminders of the stressful experience (e.g., people, places, conversation, activities, objects, or situations)?",
                "Trouble remembering important parts of the stressful experience?",
                "Having strong negative beliefs about yourself, other people, or the world (e.g., having thoughts such as: I am bad, there is something seriously wrong with me, no one can be trusted, the world is completely dangerous)?",
                "Blaming yourself or someone else for the stressful experience or what happened after it?",
                "Having strong negative feelings such as fear, horror, anger, guilt, or shame?",
                "Loss of interest in activities that you used to enjoy?",
                "Feeling distant or cut off from other people?",
                "Trouble experiencing positive feelings (e.g., being unable to feel happiness or have loving feelings for people close to you)?",
                "Irritable behavior, angry outbursts, or acting aggressively?",
                "Taking too many risks or doing things that could cause you harm?",
                "Being “super-alert” or watchful on guard?"
            )
        )
        //
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anxiety_test, container, false)
    }

}