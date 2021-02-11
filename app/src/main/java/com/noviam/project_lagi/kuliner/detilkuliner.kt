package com.noviam.project_lagi.kuliner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.noviam.project_lagi.R
import kotlinx.android.synthetic.main.detil_explore.*

class detilkuliner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detil_explore)
        if (intent.hasExtra("namanya")){
            val nama : String = this.intent.getStringExtra("namanya").toString()
            val foto : String = this.intent.getStringExtra("fotonya").toString()
            val alamat : String = this.intent.getStringExtra("alamatnya").toString()
            val deskripsi: String = this.intent.getStringExtra("deskripsinya").toString()

            setDetil(foto, nama, alamat,  deskripsi)
        }
    }

    fun setDetil(foto: String, nama: String, alamat: String, deskripsi: String) {
        val requestOp = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        nama_tempat.text = nama
        alamat_tempat.text = alamat
        deskripsi_tempat.text = deskripsi

        Glide.with(this)
            .load(foto)
            .apply(requestOp)
            //.centerCrop()
            .into(foto_detil1)
    }
}