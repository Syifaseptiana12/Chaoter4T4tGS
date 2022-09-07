package com.syfsdi.chapter3ku.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment


class FragmentLogin : Fragment(){

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_form_login, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            btnLogin.setOnClickListener {
                val username = MainLogin.text.toString()
                val password = MainLogin.text.toString()
                val bun = Bundle()
                bun.putString("username",username)
                if (username.equals("raynaldi") && password.equals("12345")){
                    Toast.makeText(context,"Anda Berhasil Login", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(view).navigate(R.id.homeFragment,bun)
                }else{
                    Toast.makeText(context,"Data tidak benar, coba lagi", Toast.LENGTH_SHORT).show()
                }
            }
            lupaPassword.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.lupasFragment)
            }
            register.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.registerFragment)
            }
            btnChat.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.chatFragment)
            }
            btnHelp.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.helpFragment)
            }
        }

    }
}