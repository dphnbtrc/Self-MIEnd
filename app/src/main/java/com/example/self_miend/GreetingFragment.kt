package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class GreetingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_greeting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toHomeB = view.findViewById<Button>(R.id.openHomeButton)

        val stringsList = listOf(
            "Time for a quick mental health check! Take a moment to reflect on your well-being. If you\\'ve taken any assessments, we\\'re here to discuss the results and provide support and guidance.",
            "We're thrilled to have you here. Our app is designed to provide the tools and support you need for a happier and healthier mindset.",
            "Step into a space designed to nurture your mental well-being. We're committed to guiding you forward.",
            "Glad to have you here! Our aim is to empower you with tools for a healthier mind.",
            "Embrace a place dedicated to mental wellness. Let's embark on a path towards greater resilience.",
            "Thrilled that you've chosen to prioritize your mental health. We're here to provide guidance and encouragement." ,
            "Discover a space dedicated to nurturing your mental well-being. Let's navigate this journey together.",
            "Enter a realm focused on your mental health, where empowerment and growth await.",
            "You've found a sanctuary for mental wellness. Let's explore strategies to boost your well-being.",
            "Step into a place designed to cultivate positivity and resilience for your mental health journey.",
            "Welcome to a community centered around mental wellness support. Let's pave the way to a healthier mind.",
            "Enter a realm committed to your mental health empowerment. Let's thrive together.",
            "You're among friends in this haven for mental wellness. Let's embark on this journey side by side.",
            "Enter a digital sanctuary for mental wellness. Let's harness technology for a mindful and balanced lifestyle.",
            "You're at the intersection of mental wellness and digital empowerment. Let's redefine mental health on your terms."
        )

        val randomIndex = (stringsList.indices).random()
        val randomString = stringsList[randomIndex]

        val greetingsRandom = view.findViewById<TextView>(R.id.textView6)

        greetingsRandom.text = randomString

        toHomeB.setOnClickListener {
            val homeS = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}