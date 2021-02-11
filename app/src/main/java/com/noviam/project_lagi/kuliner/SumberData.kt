package com.noviam.project_lagi.kuliner

class SumberData {
    companion object{

        fun buatSetData(): ArrayList<ListObjKuliner> {
            val list = ArrayList<ListObjKuliner>()
            list.add(
                ListObjKuliner(
                    "Rumah Makan Pak Abbas",
                    "Jl. Kaharuddin Nasution no.49",
                    "https://www.itrip.id/wp-content/uploads/2020/08/Rumah-Makan-Pak-Abbas.jpg",
                    "Rumah Makan menyediakan makan siang"
                )
            )
            list.add(
                ListObjKuliner(
                    "Miso Pak Lek",
                    "Jl. Cemara n0.15",
                    "https://www.itrip.id/wp-content/uploads/2020/08/Miso-Pak-Lek.jpg",
                    "Menyediakan menu miso"
                )
            )
            list.add(
                ListObjKuliner(
                    "Kimteng",
                    "Jl. Senapelanno.50",
                    "https://www.itrip.id/wp-content/uploads/2020/08/Kim-Teng.jpg",
                        "Meyediakan aneka sarapan pagi"
                )
            )
            list.add(
                ListObjKuliner(
                    "Kayu Manis Resto",
                    "Jl.Sudirman no.80",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1i2HhP9mW1TeCGfBlPnBc8cHLE_Mz8HuPjg&usqp=CAU",
                    "Menyediakan makan siang dan makan malam"
                )
            )

            return list
        }
    }
}
