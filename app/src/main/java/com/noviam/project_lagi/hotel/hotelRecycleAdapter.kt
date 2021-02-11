package com.noviam.project_lagi.hotel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.noviam.project_lagi.R
import kotlinx.android.synthetic.main.layout_list_hotel.view.*
import kotlinx.android.synthetic.main.layout_list_kuliner.view.*

class hotelRecycleAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private  var items: List<ListObjHotel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DosenViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_list_hotel, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is DosenViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener {
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }
    fun submitList(listhotel: List<ListObjHotel>){
        items = listhotel
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class DosenViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto : ImageView = itemView.gambar_hotel
        val nama : TextView = itemView.nama_hotel
        //        val alat : TextView = itemView.alat_resep
//        val bahan : TextView = itemView.bahan_resep
//        val cara : TextView = itemView.cara_resep
        val klik : RelativeLayout = itemView.findViewById(R.id.rl_klik)

        fun bind(listObjHotel: ListObjHotel) {
            nama.setText(listObjHotel.nama)
//            alat.setText(listObjResep.alat)
//            bahan.setText(listObjResep.bahan)
//            cara.setText(listObjResep.cara)

            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(listObjHotel.foto)
                .into(foto)
        }
        fun kalau_diklik(get: ListObjHotel) {
            val position:Int = adapterPosition
            Toast.makeText(itemView.context, "Kamu memilih : ${get.nama}",
                Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(itemView.context, detilhotel::class.java)
            intent.putExtra("namanya", get.nama)
            intent.putExtra("fotonya", get.foto)
            intent.putExtra("alamatnya", get.alamat)
            intent.putExtra("deskripsinya", get.deskripsi)
            itemView.context.startActivity(intent)
        }
    }
}