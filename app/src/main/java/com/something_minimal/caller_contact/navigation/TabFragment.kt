package com.something_minimal.caller_contact.navigation

import android.app.Activity
import androidx.fragment.app.Fragment

open class TabFragment(
    private val activity: Activity,
    private val titleId: Int
): Fragment() {
    fun getTitle(): String {
        return activity.getString(titleId)
    }
}