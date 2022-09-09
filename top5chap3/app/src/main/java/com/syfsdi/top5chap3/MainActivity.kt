package com.syfsdi.top5chap3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(
            ListStudent("Syifa", "20104047", R.drawable.ic_baseline_arrow_drop_down_24,) ,
            ListStudent("Dilla", "20104046", R.drawable.ic_baseline_arrow_drop_down_24),
            ListStudent("ike", "20104043", R.drawable.ic_baseline_arrow_drop_down_24),
            ListStudent("Zayyan", "2010403", R.drawable.ic_baseline_arrow_drop_down_24),
            ListStudent("Nico", "2134490", R.drawable.ic_baseline_arrow_drop_down_24),

        )

        var adapterStudent = StudentAdapter(listStudent)
        val lm= LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvStudent.layoutManager = lm
        rvStudent.adapter = adapterStudent

        adapterStudent.onClick = {
            var pindah = Intent (this, DetailStudentActivity:: class.java)
            pindah.putExtra("detailStudent",listStudent)
            startActivity(pindah)
        }


    }
}