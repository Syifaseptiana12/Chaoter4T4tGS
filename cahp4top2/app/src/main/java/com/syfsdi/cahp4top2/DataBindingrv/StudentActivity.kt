package com.syfsdi.cahp4top2.DataBindingrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class StudentActivity : AppCompatActivity() {
    lateinit var binding : ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        var listStudent = arrayListOf(
            Student("Syifa","20104047", R.drawable.ic_launcher_foreground),
            Student("Dilla","20104046", R.drawable.ic_launcher_foreground)
        )

        binding.rvStudent.adapter = StudentAdapter(listStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}