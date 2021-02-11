package com.noviam.project_lagi.kuliner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.noviam.project_lagi.R
import kotlinx.android.synthetic.main.list_kuliner.*

class activity_ke3 :  AppCompatActivity() {
    private  lateinit var kulinerAdapter: kulinerRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_kuliner)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        kulinerAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@activity_ke3)
            val spacingAtas = letakgambar(20)
            addItemDecoration(spacingAtas)
            kulinerAdapter = kulinerRecycleAdapter()
            adapter = kulinerAdapter
        }
    }
}