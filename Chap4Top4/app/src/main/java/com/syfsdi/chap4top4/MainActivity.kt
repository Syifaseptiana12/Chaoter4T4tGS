package com.syfsdi.chap4top4

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPrefs : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPrefs = getSharedPreferences("STUDENT", Context.MODE_PRIVATE)

        binding.btnSave.setOnClickListener {
            saveData()
            Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()
        }

        binding.btnView.setOnClickListener {
            viewData()
        }

        binding.btnClear.setOnClickListener {
            clearData()
        }
    }

    private fun saveData() {
        val getNim = binding.etNim.text.toString()
        val getName = binding.etName.text.toString()

        val addData = sharedPrefs.edit()
        addData.putString("nim", getNim)
        addData.putString("name", getName)
        addData.apply()
    }

    private fun viewData() {
        binding.tvNim.text = "Nim : "+ sharedPrefs.getString("nim", "")
        binding.tvName.text = "Nama : "+ sharedPrefs.getString("name", "")
    }

    private fun clearData() {
        val pref = sharedPrefs.edit()
        pref.clear()
        pref.apply()

        binding.tvNim.text = ""
        binding.tvName.text = ""
        Toast.makeText(this, "Data dihapus", Toast.LENGTH_SHORT).show()
    }
}