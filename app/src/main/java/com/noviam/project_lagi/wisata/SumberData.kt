package com.noviam.project_lagi.wisata

class SumberData {
    companion object{

        fun buatSetData(): ArrayList<ListObjWisata> {
            val list = ArrayList<ListObjWisata>()
            list.add(
                ListObjWisata(
                    "Labersa Waterpark",
                    "Jl. Labersa No.4",
                    "https://travelspromo.com/wp-content/uploads/2019/04/Labersa-Waterpark-Pekanbaru-sasmito-eko.jpg",
                        "Tempat untuk berenang dan bermain bersama keluarga"
                )
            )
            list.add(
                ListObjWisata(
                    "Alam Mayang",
                    "Jl.Harapan raya Ujung No.15",
                    "https://ksmtour.com/media/images/articles12/taman-wisata-alam-mayang-riau.JPG",
                    "Tempat untuk rekreasi outdoor"
                )
            )
            list.add(
                ListObjWisata(
                    "Pulau Cinta Teluk Jering",
                    "Pantai Cinta Teluk Jering Kec.Kampar",
                    "https://wisato.id/wp-content/uploads/2020/02/teluk-jering-riau.jpg",
                    "Tempat rekreasi keluarga"
                )
            )
            list.add(
                ListObjWisata(
                    "Taman Bunga Okura",
                    "Tebing Tinggi Okura, Rumbai Pesisir",
                    "https://cdn1-production-images-kly.akamaized.net/OrTVUAhkGSrXi5m32y5VUIwwMmE=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2395916/original/064160000_1540885875-bunga1_h.jpg",
                    "Tempat rekreasi outdoor keluarga"
                )
            )

            return list
        }
    }
}
