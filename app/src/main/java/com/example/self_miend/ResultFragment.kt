package com.example.self_miend


import android.os.Bundle
import android.util.Log
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

        toResultDoneB.setOnClickListener {
            val resultDoneS = ResultDoneFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultDoneS)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        val testResultAnxietyScore = requireView().findViewById<TextView>(R.id.testResultScore)

        val scoreResultAnxiety = arguments?.getInt("SCORE", 0) ?: 0
        testResultAnxietyScore.text =  "$scoreResultAnxiety"

        Log.d("SecondFragment", "Received score: $scoreResultAnxiety")

    }

}