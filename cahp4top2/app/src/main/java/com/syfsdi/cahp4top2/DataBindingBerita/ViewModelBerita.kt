package com.syfsdi.cahp4top2.DataBindingBerita

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syfsdi.cahp4top2.R

class ViewModelBerita : ViewModel(){
    private val dataList = arrayListOf(
        Berita(
            "Pemuda di Madiun Jadi Tersangka, Diduga Bantu Hacker Bjorka",
            "CNN Indonesia", "Jumat, 16 September 2022 15.00 WIB",
            R.drawable.hacker, R.string.Berita1
        ),
        Berita(
            "CNBC Indonesia News BeritaJokowi Buka Suara Soal Isu Jadi Cawapres 2024: Bukan Saya!",
            "NEWS - cha, CBNC Indonesia", "Jumat,, 16 September 2022 12:01 WIB",
            R.drawable.JOKOWI, "CNBC Indonesia News BeritaJokowi Buka Suara Soal Isu Jadi Cawapres 2024: Bukan Saya!"
        ),
        Berita(
            "Daftar Terbaru Hukuman Etik ke 9 Polisi di Kasus Ferdi Sambo",
            "Dwi Andayani", "Rabu, 14 Sep 2022 09:21 WIB",
            R.drawable.bg_news_sambo, R.string.body_news3
        ),
        Berita(
            "Suciwati Buka Suara Usai Hacker Bjorka Ungkap Pembunuh Munir",
            "Dwi Andayani", "Rabu, 14 Sep 2022 09:21 WIB<",
            R.drawable.bg_news_munir, R.string.body_news4
        ),
        Berita(
            "Penembakan Misterius 1980an Ribuan Korban Jiwa, Petrus Beraksi Pertama di Yogya",
            "S. Dian Andryanto", "Minggu, 28 Nov 2021 15:40 WIB",
            R.drawable.bg_news_petrus, R.string.body_news5
        ),
        Berita(
            "Kronologi Kerusuhan Mei 1998",
            "Verelladevanka Adryamarthanino", "Senin, 15 Nov 2021 15:00 WIB",
            R.drawable.bg_news_mei, R.string.body_news6
        ),
        Berita(
            "Peristiwa G30S PKI Bukan Pelanggaran HAM Berat, tapi Makar",
            "Tim Liputan Sindo", "Selasa, 26 Jul 2022 09:17 WIB",
            R.drawable.bg_news_pki, R.string.body_news7
        ),
        Berita(
            "Eliza Mengakui Perintah Pengeboman dari Tommy Soeharto",
            "Tim Liputan 6 SCTV", "Minggu, 21 Jan 2001, 08:26 WIB",
            R.drawable.bg_news_bom, R.string.body_news8
        ),
        Berita(
            "Kelangsungan Pemerintahan Gus Dur Ditentukan 2001",
            "Esther Mulyanie dan Prihandoyo", "Sabtu, 9 Des 2000, 20:52 WIB",
            R.drawable.bg_news_gusdur, R.string.body_news9
        ),
        Berita(
            "Habibie: Tak Ada Rekayasa buat Timtim",
            "Olivia Rosalia, Agung Nugraha dan Bambang Triono", "Jumat, 21 Mar 2003, 08:44 WIB",
            R.drawable.bg_news_habibie, R.string.body_news10
        )
    )

    val newsList : MutableLiveData<List<News>> = MutableLiveData()

    fun gotNews() {
        newsList.value = dataList
    }
}