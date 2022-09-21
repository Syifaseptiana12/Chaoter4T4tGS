package com.syfsdi.chap4top4

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle

class SeccondActivity {
    lateinit var binding : ActivitySecondBinding
    lateinit var sp : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sp = this.getSharedPreferences("USERNAME", Context.MODE_PRIVATE)

        var getData = sp.getString("username", "")
        binding.tvUser.setText(getData)
    }
}