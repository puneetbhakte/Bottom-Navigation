package com.example.assignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment.data.AccountHolderData
import com.example.assignment.databinding.SingleViewBinding
import com.example.assignment.databinding.SingleViewForMearchantBinding

class MarchantRvAdapter(
    var context: Context,
    private var dataList: ArrayList<AccountHolderData>
): RecyclerView.Adapter<MarchantRvAdapter.ViewHolder>()
{
    inner class ViewHolder(var binding: SingleViewForMearchantBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SingleViewForMearchantBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current_name = dataList[position]
        val current_title = dataList[position]
        holder.binding.title.text = current_title.Title
        holder.binding.name.text = current_name.Name

    }

}