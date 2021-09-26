package com.something_minimal.caller_contact.navigation

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabsAdapter (
    private val tabs: List<Fragment>,
    fragManager: FragmentManager,
    lifecycle: Lifecycle,
) : FragmentStateAdapter(fragManager, lifecycle) {

    override fun getItemCount(): Int {
        return tabs.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabs[position]
    }

}