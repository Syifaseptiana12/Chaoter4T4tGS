package com.syfsdi.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {
    val list = arrayListOf(
        DataProduct("Syifa",R.drawable.ic_launcher_foreground, "$10", "description"),
        DataProduct("Dilla",R.drawable.ic_launcher_foreground, "$11", "description"),
        DataProduct("Nico",R.drawable.ic_launcher_foreground, "$12", "description"),
        DataProduct("Ijul",R.drawable.ic_launcher_foreground, "$13", "description"),
        DataProduct("Zayyan",R.drawable.ic_launcher_foreground, "$14", "description"),
        DataProduct("Ike",R.drawable.ic_launcher_foreground, "$15", "description"),
    )

    val product : MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct(){
        product.value = list

    }    }