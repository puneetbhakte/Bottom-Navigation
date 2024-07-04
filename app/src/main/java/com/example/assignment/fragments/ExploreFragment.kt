package com.example.assignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment.adapter.ViewPagerAdaptor
import com.example.assignment.databinding.FragmentExploreBinding



class ExploreFragment : Fragment() {

    lateinit var binding:FragmentExploreBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExploreBinding.inflate(layoutInflater,container,false)



        val adapter = ViewPagerAdaptor(childFragmentManager)
         binding.viewpager.adapter = adapter
           binding.tablayout.setupWithViewPager(binding.viewpager)

        // Add tabs for each nested fragment
        binding.tablayout.getTabAt(0)?.text = "Personal"
        binding.tablayout.getTabAt(1)?.text = "Business"
        binding.tablayout.getTabAt(2)?.text = "Merchant"



        return binding.root
    }

    companion object {

    }
}