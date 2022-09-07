package com.syfsdi.chapter3ku.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.syfsdi.chapter3barusyifa.R

-in

class MenghitungTahun  : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.menghitungtahun_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getUsername =arguments?.getString("username")
        val getUmur = arguments?.getString("umur")
        outputNamaHasil.text= getUsername
        outputHitungUmurHasil.text= getUmur

    }
}