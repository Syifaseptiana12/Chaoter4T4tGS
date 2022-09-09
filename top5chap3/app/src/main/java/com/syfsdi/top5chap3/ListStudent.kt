package com.syfsdi.top5chap3

import android.media.Image
import java.io.Serializable

data class ListStudent(
    val nama: String,
    val nim: String,
    val img: Int,

    ) : Serializable
