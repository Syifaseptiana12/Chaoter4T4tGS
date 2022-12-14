package com.example.chapter3_navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentDua : Fragment() {

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
            bun.putString("dataumur",dataUmur)
            Navigation.findNavController(view).navigate(R.id.fragmentTiga,bun)
        }
    }

}