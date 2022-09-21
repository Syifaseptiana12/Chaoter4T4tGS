package com.syfsdi.cahp4top2.DataBindingrv

import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class StudentAdapter (var listStudent : ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder (val binding : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root){

    }
}
