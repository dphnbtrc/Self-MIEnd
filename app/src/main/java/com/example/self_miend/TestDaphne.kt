package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class TestDaphne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test_daphne, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toHomeB = view.findViewById<Button>(R.id.openHomeButton)

        toHomeB.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("dataKey", "Data to pass")

            val testVenusS = TestVenus()
            testVenusS.arguments = bundle

            val homeS = TestVenus()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, homeS)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}

