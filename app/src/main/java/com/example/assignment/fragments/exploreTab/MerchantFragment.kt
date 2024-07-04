package com.example.assignment.fragments.exploreTab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment.adapter.BusinessRvAdaptor
import com.example.assignment.adapter.MarchantRvAdapter
import com.example.assignment.data.AccountHolderData
import com.example.assignment.data.Constants
import com.example.assignment.databinding.FragmentMerchantBinding


class MerchantFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentMerchantBinding

    lateinit var adapter: MarchantRvAdapter
    var  data_list:ArrayList<AccountHolderData> = Constants().getdata()

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
        binding = FragmentMerchantBinding.inflate(layoutInflater,container,false)

        data_list = Constants().getdata()
        binding.rvData.layoutManager = LinearLayoutManager(context)
        adapter = MarchantRvAdapter(requireContext(),data_list)
        binding.rvData.adapter = adapter
        adapter.notifyDataSetChanged()


        return binding.root
    }

    companion object {

    }
}