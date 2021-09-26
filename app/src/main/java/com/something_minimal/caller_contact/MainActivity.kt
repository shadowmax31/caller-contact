package com.something_minimal.caller_contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.something_minimal.caller_contact.contacts.ContactFragment
import com.something_minimal.caller_contact.navigation.TabsAdapter
import com.something_minimal.caller_contact.phone.PhoneFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabs = listOf(PhoneFragment(this), ContactFragment(this))
        val adapter = TabsAdapter(tabs, supportFragmentManager, lifecycle)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val pager: ViewPager2 = findViewById(R.id.pager)
        pager.adapter = adapter

        TabLayoutMediator(tabLayout, pager) { tab, position ->
            tab.text = tabs[position].getTitle()
        }.attach()

    }

}