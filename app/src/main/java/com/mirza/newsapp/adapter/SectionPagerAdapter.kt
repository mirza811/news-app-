package com.mirza.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mirza.newsapp.fragment.AllNewsFragment
import com.mirza.newsapp.fragment.PopularFragment
import com.mirza.newsapp.fragment.TopFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllNewsFragment()
            1 -> TopFragment()
            2 -> PopularFragment()
            else -> TopFragment()
        }
    }
}