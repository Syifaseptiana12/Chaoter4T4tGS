package com.syfsdi.tgs_chap4_t4

import android.content.SharedPreferences
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var sharedPrefRegis: SharedPreferences
    private lateinit var sharedPrefLogin: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private val sharedNameRegis = "userRegister"
    private val sharedNameLogin = "userLogin"
}