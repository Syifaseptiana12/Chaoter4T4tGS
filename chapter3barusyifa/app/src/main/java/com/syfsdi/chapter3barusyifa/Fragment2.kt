package com.syfsdi.chapter3barusyifa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnToTiga.setOnClickListener {
            var dataUmur = inputUmur.text.toString()
            var bun = Bundle()
            bun.putString("Umur",dataUmur)
            Navigation.findNavController(view).navigate(R.id.fragmentTiga,bun)
        }
    }
}