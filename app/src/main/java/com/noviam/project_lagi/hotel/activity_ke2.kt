package com.noviam.project_lagi.hotel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.noviam.project_lagi.R
import kotlinx.android.synthetic.main.list_hotel.*

class activity_ke2 :  AppCompatActivity() {
    private  lateinit var hotelAdapter: hotelRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_hotel)
        initRecyclerView()
        tambahDataSet()
    }
    private  fun tambahDataSet(){
        val data = SumberData.buatSetData()
        hotelAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recyler_view.apply {
            layoutManager = LinearLayoutManager(this@activity_ke2)
            val spacingAtas = letakgambar(20)
            addItemDecoration(spacingAtas)
            hotelAdapter = hotelRecycleAdapter()
            adapter = hotelAdapter
        }
    }
}