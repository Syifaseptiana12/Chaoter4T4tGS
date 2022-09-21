package com.syfsdi.top5chap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.recyclerview.widget.DiffUtill
import androidx.recyclerview.widget.RecyclerView

class StudentAdapaterDiffUtil() : RecyclerView.Adapter<StudentAdapaterDiffUtil.ViewHolder>() {

    private var diffCallBack = object: DiffUtil.ItemCallBack<ListStudent>{
        override fun areItemsTheSame(oldItem: ListStudent, newItem : ListStudent):Boolean{
            return  oldItem.nim ==newItem.nim
        }

    }
    override fun areContentsTheSame(oldItem: ListStudent, newItem: ListStudent) : Boolean{
       return  oldItem.hashCode() == newItem.nim
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentAdapaterDiffUtil.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapaterDiffUtil.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}