package com.noviam.project_lagi.hotel

class SumberData {
    companion object{

        fun buatSetData(): ArrayList<ListObjHotel> {
            val list = ArrayList<ListObjHotel>()
            list.add(
                ListObjHotel(
                    "Batiqa Hotel Pekanbaru",
                    "Jl.Kaharuddin Nasution No.123",
                        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/14/66/c6/46/batiqa-hotel-pekanbaru.jpg?w=500&h=400&s=1",
                    "Bintang 3,5"
                )
            )
            list.add(
                ListObjHotel(
                    "Novotel Pekanbaru",
                    "Jl. Riau No.44",
                        "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0a/f8/3f/fb/molecule-gastro-bar.jpg?w=400&h=-1&s=1",
                    "Bintang 5"
                )
            )
            list.add(
                ListObjHotel(
                    "Grand Zuri Hotel Pekanbaru",
                    "Jl. Gatot Subroto No.2",
                    "https://dynamic-media-cdn.tripadvisor.com/media/photo-s/02/32/5d/2a/superior.jpg?w=500&h=400&s=1",
                    "Bintang 4"
                )
            )
            list.add(
                ListObjHotel(
                    "Labersa Grand Hotel",
                    "Jl. Labersa No.3",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWqI8AicqLtXXukkquUhtcXMfHn1f4KUzzVg&usqp=CAU",
                    "Bintang 5"
                )
            )

            return list
        }
    }
}
