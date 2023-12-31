package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class GeneralActsTipsFragment : Fragment() {

    //A fragment that shows the tips and what the user will do in a specific mental or issue or in general
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_general_acts_tips, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toSelfCareB = view.findViewById<Button>(R.id.selfCareButton)

        //A button that when clicked, goes to the general tips for assessing mental issue
        toSelfCareB.setOnClickListener {
            val selfCareS = SelfCareTipsAndActsFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selfCareS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, goes back to the main home, HomeFragment
        val toHomeB3 = view.findViewById<Button>(R.id.backHomeButton3)

        toHomeB3.setOnClickListener {
            val hS3 = HomeFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, hS3)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, proceeds to the tips, activities, advices and other else for Anxiety
        val toAnxietyTipsB = view.findViewById<Button>(R.id.button4)

        toAnxietyTipsB.setOnClickListener {
            val tipsAnxiety = TipsAnxietyFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, tipsAnxiety)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, proceeds to the tips, activities, advices and other else for Depression
        val toDepressionTipsB = view.findViewById<Button>(R.id.button2)

        toDepressionTipsB.setOnClickListener {
            val tipsDepression = TipsDepressionFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, tipsDepression)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, proceeds to the tips, activities, advices and other else for Internet Addiction
        val toInternetAddictionTipsB = view.findViewById<Button>(R.id.button5)

        toInternetAddictionTipsB.setOnClickListener {
            val tipsIntAddict = TipsIntAddictFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, tipsIntAddict)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked, proceeds to the tips, activities, advices and other else for Stress
        val toStressTipsB= view.findViewById<Button>(R.id.button3)

        toStressTipsB.setOnClickListener {
            val tipsStress = TipsStressFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, tipsStress)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

}