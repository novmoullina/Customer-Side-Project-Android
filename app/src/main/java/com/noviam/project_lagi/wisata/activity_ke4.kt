package com.noviam.project_lagi.wisata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.noviam.project_lagi.R
import kotlinx.android.synthetic.main.list_wisata.*

class activity_ke4 :  AppCompatActivity() {
    private  lateinit var wisataAdapter: wisataRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_wisata)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        wisataAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@activity_ke4)
            val spacingAtas = letakgambar(20)
            addItemDecoration(spacingAtas)
            wisataAdapter = wisataRecycleAdapter()
            adapter = wisataAdapter
        }
    }
}