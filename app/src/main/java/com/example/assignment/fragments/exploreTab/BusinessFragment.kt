package com.example.assignment.fragments.exploreTab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment.adapter.BusinessRvAdaptor
import com.example.assignment.adapter.PersonalRvAdaptor
import com.example.assignment.adapter.ViewPagerAdaptor
import com.example.assignment.data.AccountHolderData
import com.example.assignment.data.Constants
import com.example.assignment.databinding.FragmentBusinessBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BusinessFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var binding:FragmentBusinessBinding
    lateinit var adapter:BusinessRvAdaptor
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
        binding = FragmentBusinessBinding.inflate(layoutInflater,container,false)

        data_list = Constants().getdata()
        binding.rvData.layoutManager = LinearLayoutManager(context)
        adapter = BusinessRvAdaptor(requireContext(),data_list)
        binding.rvData.adapter = adapter
        adapter.notifyDataSetChanged()




        return binding.root
    }

    companion object {

    }
}