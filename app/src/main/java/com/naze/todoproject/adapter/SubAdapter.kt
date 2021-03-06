package com.naze.todoproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naze.todoproject.databinding.SubItemBinding
import com.naze.todoproject.dto.Sub
import com.naze.todoproject.viewHolder.SubViewHolder

class SubAdapter(private val context: Context): RecyclerView.Adapter<SubViewHolder>() {

    var subData = mutableListOf<Sub>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubViewHolder {
        val binding = SubItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SubViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubViewHolder, position: Int) {
        holder.bind(subData[position],position)
    }

    override fun getItemCount(): Int {
        return this.subData.size
    }

    fun addItem(position: Int) {


    }

    fun deleteItem(position: Int) {

    }


}