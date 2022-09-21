package com.syfsdi.top1_chap4.Studentvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter() : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class  ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.studentName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate()
    }
}