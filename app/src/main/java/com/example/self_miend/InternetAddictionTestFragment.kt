package com.example.self_miend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class InternetAddictionTestFragment : Fragment() {

    /*

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_internet_addiction_test, container, false)
    }

}

     */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_internet_addiction_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toResultB3 = view.findViewById<Button>(R.id.nextButton)

        toResultB3.setOnClickListener {
            val resultS3 = ResultFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activityMainLayout, resultS3)
            transaction.commit()
        }
    }
}