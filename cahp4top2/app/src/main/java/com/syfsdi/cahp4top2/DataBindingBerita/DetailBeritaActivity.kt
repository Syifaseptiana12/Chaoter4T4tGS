package com.syfsdi.cahp4top2.DataBindingBerita

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailBeritaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_news)

        binding.toolBar.setOnClickListener {
            onBackPressed()
        }

        gotData()
    }
    private fun gotData() {
        val gotNews = intent.getSerializableExtra("berita") as News
        binding.berita = News(gotNews.headline, gotNews.author, gotNews.date, gotNews.image, gotNews.body)
    }
}