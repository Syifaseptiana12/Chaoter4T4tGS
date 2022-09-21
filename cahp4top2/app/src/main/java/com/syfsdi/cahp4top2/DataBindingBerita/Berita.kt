package com.syfsdi.cahp4top2.DataBindingBerita

import java.io.Serializable

data class Berita(
    val Judul: String,
    val author: String,
    val tanggal: String,
    val image: Int,
    val body: Int) : Serializable{
}