package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class FindSupportFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_find_support, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backToHomeButton4 = view.findViewById<Button>(R.id.backHomeButton3)

        backToHomeButton4.setOnClickListener {
            val homeFragmentS = HomeFragment()
            val transaction: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeFragmentS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val comingFromHomeFragment = arguments?.getBoolean("comingFromHomeFragment", false)

        if (comingFromHomeFragment == true) {

            backToHomeButton4.setOnClickListener {
                val fromFindToHomeS = HomeFragment()
                val transaction: FragmentTransaction =
                    requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.activityMainLayout, fromFindToHomeS)
                transaction.addToBackStack(null)
                transaction.commit()
            }

        }

        val comingFromAnxietyResultFragment =
            arguments?.getBoolean("comingFromAnxietyResultFragment", false)

        if (comingFromAnxietyResultFragment == true) {

            backToHomeButton4.setOnClickListener {
                goBack()
            }

        }

        val comingFromDepressionResultFragment =
            arguments?.getBoolean("comingFromDepressionResultFragment", false)

        if (comingFromDepressionResultFragment == true) {

            backToHomeButton4.setOnClickListener {
                goBack()
            }

        }

        val comingFromInternetAddictionResultFragment =
            arguments?.getBoolean("comingFromInternetAddictionResultFragment", false)

        if (comingFromInternetAddictionResultFragment == true) {

            backToHomeButton4.setOnClickListener {
                goBack()
            }

        }

        val comingFromStressResultFragment =
            arguments?.getBoolean("comingFromStressResultFragment", false)

        if (comingFromStressResultFragment == true) {

            backToHomeButton4.setOnClickListener {
                goBack()
            }

        }

    }

    private fun goBack() {
        requireActivity().supportFragmentManager.popBackStack()
    }

}

