package com.syfsdi.chapter3ku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment3 : Fragment()
override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment3, container, false)
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    btnToSatu.setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.fragmentSatu)
    }
    var getUmur = arguments?.getString("dataumur")
    getTextUmur.text = getUmur

    Toast.makeText(context,"Umur anda : $getUmur", Toast.LENGTH_SHORT).show()
}
