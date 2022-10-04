package com.example.studentapp4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter1(private val data: List<String>):RecyclerView.Adapter<ViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.list_item1,parent,false)
        val holder = ViewHolder1(inflate)
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        holder.txtKurasumei.text = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }

}