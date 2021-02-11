package com.noviam.project_lagi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.noviam.project_lagi.hotel.activity_ke2
import com.noviam.project_lagi.kuliner.activity_ke3
import com.noviam.project_lagi.wisata.activity_ke4

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val panggilkuliner: Button = findViewById(R.id.btnkuliner)
        panggilkuliner.setOnClickListener {
            val intent = Intent(this, activity_ke3::class.java)
            startActivity(intent)

            val panggilhotel: Button = findViewById(R.id.btnhotel)
            panggilhotel.setOnClickListener {
                val intent = Intent(this, activity_ke2::class.java)
                startActivity(intent)

                val panggilwisata: Button = findViewById(R.id.btntempat)
                panggilwisata.setOnClickListener {
                    val intent = Intent(this, activity_ke4::class.java)
                    startActivity(intent)

                }

            }
        }
    }
}







