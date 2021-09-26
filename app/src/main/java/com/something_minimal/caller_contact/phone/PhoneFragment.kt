package com.something_minimal.caller_contact.phone

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.something_minimal.caller_contact.R
import com.something_minimal.caller_contact.navigation.TabFragment

class PhoneFragment (activity: Activity) : TabFragment(activity, R.string.phone_title) {
    private var tvNumberToCall: TextView? = null
    private var btnBackspace: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.tvNumberToCall = view.findViewById(R.id.tvNumberToCall)

        initBackspace(view, R.id.btnBackspace)

        initDialButton(view, R.id.btnOne, "1")
        initDialButton(view, R.id.btnTwo, "2")
        initDialButton(view, R.id.btnThree, "3")
        initDialButton(view, R.id.btnFour, "4")
        initDialButton(view, R.id.btnFive, "5")
        initDialButton(view, R.id.btnSix, "6")
        initDialButton(view, R.id.btnSeven, "7")
        initDialButton(view, R.id.btnEight, "8")
        initDialButton(view, R.id.btnNine, "9")
        initDialButton(view, R.id.btnZero, "0")
        initDialButton(view, R.id.btnStar, "*")
        initDialButton(view, R.id.btnSquare, "#")
    }

    private fun initDialButton(view: View, id: Int, value: String) {
        val btn: Button = view.findViewById(id)

        btn.setOnClickListener {
            this.tvNumberToCall?.text = "${this.tvNumberToCall?.text}$value"
            this.setBackSpaceVisibility()
        }
    }

    private fun initBackspace(view: View, id: Int) {
        this.btnBackspace = view.findViewById(id)
        setBackSpaceVisibility()

        this.btnBackspace?.setOnClickListener {
            val str = this.tvNumberToCall?.text
            if (str != null && str.isNotEmpty())
                this.tvNumberToCall?.text = str.substring(0, str.length - 1)

            setBackSpaceVisibility()
        }
    }

    private fun setBackSpaceVisibility() {
        var visible: Int = View.INVISIBLE
        val numberToCall = this.tvNumberToCall?.text

        if (numberToCall != null && numberToCall.isNotEmpty()) {
            visible = View.VISIBLE
        }


        this.btnBackspace?.visibility = visible
    }
}