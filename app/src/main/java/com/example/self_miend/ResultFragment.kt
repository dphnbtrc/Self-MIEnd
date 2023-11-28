package com.example.self_miend

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController

class ResultFragment : Fragment() {

    /*
    private val mobNo:String="1234567890"
    private val requestPhoneCall = 1
     */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        /*
        val call = view.findViewById<Button>(R.id.resultAdvice)
        call.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) (
                ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.CALL_PHONE), requestPhoneCall)
            )
            else (
                makeCall()
            )
        }
        */

        val doneButton = view.findViewById<Button>(R.id.resultDoneButton)
        doneButton.setOnClickListener {
            val resultDoneFragment = ResultDoneFragment()
            val transactionSelectTestFragment: FragmentTransaction =
                requireFragmentManager().beginTransaction()
            transactionSelectTestFragment.replace(R.id.activityMainLayout, resultDoneFragment)
            transactionSelectTestFragment.commit()

            doneButton.visibility = View.GONE
        }
        return view
    }
    /*
    private fun makeCall() {
        val intent = Intent (Intent.ACTION_CALL, Uri.fromParts("tel", mobNo, null))
        startActivity(intent)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode==requestPhoneCall) {
            makeCall()
        }
    }
     */

}