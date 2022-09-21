package com.syfsdi.chap4top4

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class FirstActivity {
    lateinit var binding : ActivityFirstBinding
    lateinit var shared : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = getSharedPreferences("USERNAME", Context.MODE_PRIVATE)

        binding.btnSend.setOnClickListener {
            val user = binding.username.text.toString()
            var addUser = shared.edit()
            addUser.putString("usernmae", user)
            addUser.apply()
            startActivity(Intent(this, SecondActivity :: class.java))
        }
    }
}