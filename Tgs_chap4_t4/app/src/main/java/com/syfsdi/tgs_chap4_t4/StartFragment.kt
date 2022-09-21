package com.syfsdi.tgs_chap4_t4

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class StartFragment : Fragment() {
    private lateinit var binding: StartFragmentBinding1
    private lateinit var sharedPref: SharedPreferences
    private val sharedDataLogin = "userLogin"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = StartFragmentBinding1.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPref = requireActivity().getSharedPreferences(sharedDataLogin, Context.MODE_PRIVATE)
    }
}