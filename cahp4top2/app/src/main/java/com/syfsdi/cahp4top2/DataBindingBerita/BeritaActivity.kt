package com.syfsdi.cahp4top2.DataBindingBerita

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class BeritaActivity : AppCompatActivity(), AdapterBerita.NewsListener {
    lateinit var binding : ActivityNewsBinding
    private val viewModel : NewsViewModel by viewModels()
    private lateinit var adapter: AdapterBerita

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news)

        viewModel.gotNews()
        viewModel.newsList.observe(this) {
            adapter.getData(it as ArrayList<News>)
        }
        reViewNews()
    }

    private fun reViewNews() {
        adapter = AdapterBerita(ArrayList(), this)
        binding.rvNews.adapter = adapter
        binding.rvNews.layoutManager = LinearLayoutManager(this)
    }

    override fun onNewsSelected(news: News) {
        val intent = Intent(this, DetailBeritaActivity :: class.java)
        intent.putExtra("berita", news)
        startActivity(intent)
    }
}