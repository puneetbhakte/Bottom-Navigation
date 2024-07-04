package com.example.assignment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignment.MainActivity
import com.example.assignment.fragments.exploreTab.BusinessFragment
import com.example.assignment.fragments.exploreTab.MerchantFragment
import com.example.assignment.fragments.exploreTab.PersonalFragment

class ViewPagerAdaptor(fm: FragmentManager): FragmentPagerAdapter(fm) {

    val fragment_list = mutableListOf<Fragment>()
    val title_list = mutableListOf<String>()


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PersonalFragment()
            1 -> BusinessFragment()
            2 -> MerchantFragment()
            else -> PersonalFragment()
        }
    }


}