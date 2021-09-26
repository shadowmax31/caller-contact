package com.something_minimal.caller_contact.phone

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.something_minimal.caller_contact.R
import com.something_minimal.caller_contact.navigation.TabFragment

class PhoneFragment (activity: Activity) : TabFragment(activity, R.string.phone_title) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false)
    }
}