package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PtsdTestFragment : Fragment() {

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
        return inflater.inflate(R.layout.fragment_ptsd_test, container, false)
    }

}