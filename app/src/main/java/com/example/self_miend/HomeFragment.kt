package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class HomeFragment : Fragment() {

    //A fragment that is the Main Page or Home of the app
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //A button that when clicked goes to the SelectTestFragment
        val toSelectTestB = view.findViewById<Button>(R.id.openDiffTestsButton)

        toSelectTestB.setOnClickListener {
            val selectTestS = SelectTestFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, selectTestS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked goes to the Tips, SelfCareTipsAndActsFragment
        val toActAndTips = view.findViewById<Button>(R.id.openActivitiesButton)

        toActAndTips.setOnClickListener {
            val genActTipsS = GeneralActsTipsFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, genActTipsS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked goes to the Exit, ExitDialogFragment
        val exitB = view.findViewById<Button>(R.id.exitButton)

        exitB.setOnClickListener {
            val exitS = ExitDialogFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, exitS)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //A button that when clicked goes to the Hotline Calls, FindSupportFragment
        val fromHomeToHotline = view.findViewById<Button>(R.id.hotlineCall)

        fromHomeToHotline.setOnClickListener {
            val fromHomeToFindS = FindSupportFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, fromHomeToFindS)
            transaction.addToBackStack(null)
            transaction.commit()

            //A bundle that ensures when going to the FindSupportFragment it's previous is this fragment
            val bundle = Bundle().apply {
                putBoolean("comingFromHomeFragment", true)
            }

            fromHomeToFindS.arguments = bundle

        }

    }

}