package com.syfsdi.top1_chap4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class UsingViewModeleActivity : AppCompatActivity() {
    lateinit var etpanjang : EditText
    lateinit var etLebar : EditText
    lateinit var  etTinggi : EditText
    lateinit var btnHitung : Button
    lateinit var txtHasil : TextView
    lateinit var viewModel : ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_view_modele)

        etpanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        txtHasil = findViewById(R.id.txtHasil)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        txtHasil.text = viewModel.hasil.toString()

        btnHitung.setOnClickListener{
            var pj = etpanjang.text.toString().toInt()
            var lb = etLebar.text.toString().toInt()
            var tg = etTinggi.text.toString().toInt()
            viewModel.hitungData(pj,lb,tg)

            txtHasil.text=viewModel.hasil.toString()

        }

        fun hasilData(){
            txtHasil.text = viewModel.hasil.toString()
        }
    }
}