package com.example.studentapp4

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder1(view : View) : RecyclerView.ViewHolder(view) {
    val txtKurasumei = view.findViewById<TextView>(R.id.txtKurasumei)
}