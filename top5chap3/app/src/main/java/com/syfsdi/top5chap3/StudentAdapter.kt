package com.syfsdi.top5chap3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class StudentAdapter(val listStudent: ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    var onClick : ((ListStudent) -> Unit)? = null

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.txtNamaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = view.findViewById<TextView>(R.id.imgStudent)
        var card = view.findViewById<CardView>(R.id.cardList)

    }
//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
    return  ViewHolder(view)
    }

// untuk set data ke layoutnya
    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.card.setOnClickListener{
            onClick?.invoke(listStudent[position])
        }



 // txtnama. text = syifa
    }


// ada beberapa item yang akan muncul di reyclerview
    override fun getItemCount(): Int {
        return listStudent.size
    }
}