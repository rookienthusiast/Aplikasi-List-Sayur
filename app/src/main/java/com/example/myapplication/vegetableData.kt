package com.example.myapplication

object vegetableData {
        private val database = arrayOf(
                arrayOf("Asparagus",
                        "Nutrisi: Folat, Vitamin K, Serat, Glutation (antioksidan)",
                        "Manfaat: Mendukung perkembangan janin, kesehatan tulang, dan detoksifikasi tubuh.",
                        "Sayuran ini dikenal karena kandungan folatnya yang tinggi, yang sangat penting bagi ibu hamil dan mendukung perkembangan otak janin. Asparagus juga mengandung vitamin K, yang penting untuk kesehatan tulang dan pembekuan darah, serta antioksidan yang melawan radikal bebas. Selain itu, asparagus kaya akan serat yang dapat membantu menjaga kesehatan pencernaan dan mengatur gula darah. Penelitian menunjukkan bahwa konsumsi asparagus dapat membantu mengurangi peradangan dan memiliki efek positif pada kesehatan jantung.",
                        R.drawable.asparagus,
                        R.drawable.asparagus_bg),
                arrayOf("Bayam",
                        "Nutrisi: Zat Besi, Vitamin K, Vitamin A, Vitamin C, Folat, Serat, Magnesium, Kalium",
                        "Manfaat: Menjaga kesehatan darah (zat besi), kekuatan tulang (vitamin K), dan meningkatkan kekebalan tubuh (vitamin C).",
                        "Sayuran hijau ini sangat kaya akan zat besi, yang penting untuk produksi sel darah merah, serta vitamin K yang mendukung kesehatan tulang. Bayam juga mengandung antioksidan, seperti lutein dan zeaxanthin, yang baik untuk kesehatan mata. Selain itu, bayam tinggi serat, sehingga dapat membantu menjaga kesehatan pencernaan dan mengontrol berat badan. Bayam juga rendah kalori, menjadikannya pilihan ideal untuk diet sehat.",
                        R.drawable.bayam,
                        R.drawable.bayam_bg),
                arrayOf("Brokoli",
                        "Nutrisi: Vitamin C, Vitamin K, Serat, Folat, Sulforaphane",
                        "Manfaat: Melawan kanker (sulforaphane), memperbaiki sistem kekebalan tubuh, serta baik untuk kulit.",
                        "Salah satu sayuran cruciferous yang kaya akan serat, vitamin C, dan antioksidan. Brokoli juga mengandung senyawa sulforaphane yang diyakini dapat membantu mencegah kanker serta mendukung sistem kekebalan tubuh. Selain itu, brokoli memiliki sifat anti-inflamasi dan dapat mendukung kesehatan jantung dengan menurunkan kadar kolesterol. Nutrisi dalam brokoli juga bermanfaat untuk kesehatan kulit dan pencernaan.",
                        R.drawable.brokoli,
                        R.drawable.brokoli_bg),
                arrayOf("Buncis",
                        "Nutrisi: Serat, Vitamin C, Vitamin K, Protein Nabati, Folat",
                        "Manfaat: Baik untuk pencernaan, kesehatan tulang, dan mendukung pertumbuhan otot.",
                        "Selain sebagai sumber protein nabati yang baik, buncis juga kaya akan serat, yang membantu menjaga kesehatan pencernaan. Buncis juga mengandung berbagai vitamin dan mineral, seperti vitamin K dan C, yang baik untuk tulang dan sistem kekebalan tubuh. Selain itu, buncis mengandung karbohidrat kompleks yang memberikan energi tahan lama, serta memiliki indeks glikemik rendah, sehingga cocok untuk penderita diabetes.",
                        R.drawable.buncis,
                        R.drawable.buncis_bg),
                arrayOf("Kale",
                        "Nutrisi: Vitamin K, Vitamin A, Vitamin C, Kalsium, Antioksidan",
                        "Manfaat: Mendukung kesehatan tulang, mata, dan kulit serta meningkatkan sistem imun.",
                        "Salah satu superfood populer, kale dipenuhi vitamin A, C, dan K. Vitamin K dalam kale membantu dalam pembekuan darah dan kesehatan tulang, sedangkan kandungan seratnya mendukung pencernaan yang sehat. Kale juga kaya akan antioksidan, termasuk quercetin dan kaempferol, yang dapat melawan peradangan dan mengurangi risiko penyakit kronis. Selain itu, konsumsi kale dapat mendukung kesehatan jantung dan memiliki efek positif pada kesehatan kulit.",
                        R.drawable.kale,
                        R.drawable.kale_bg),
                arrayOf("Kangkung",
                        "Nutrisi: Zat Besi, Vitamin C, Vitamin A, Serat",
                        "Manfaat: Baik untuk kesehatan darah, pencernaan, dan kekebalan tubuh.",
                        "Mengandung berbagai nutrisi seperti zat besi, vitamin C, dan serat. Zat besi membantu dalam mencegah anemia, sementara vitamin C meningkatkan penyerapan zat besi. Kangkung juga kaya akan antioksidan, seperti beta-karoten dan lutein, yang penting untuk kesehatan mata. Selain itu, kangkung memiliki kandungan serat yang tinggi, yang dapat membantu mengatur pencernaan dan menjaga kadar gula darah tetap stabil.",
                        R.drawable.kangkung,
                        R.drawable.kangkung_bg),
                arrayOf("Kembang Kol",
                        "Nutrisi: Serat, Vitamin C, Vitamin K, Kolin",
                        "Manfaat: Mendukung pencernaan dan fungsi otak, serta baik untuk kesehatan kulit.",
                        "Mengandung rendah kalori namun sangat kaya nutrisi, termasuk serat, vitamin C, dan kolin, yang mendukung kesehatan otak. Kembang kol juga mengandung senyawa yang mendukung detoksifikasi tubuh serta mengurangi risiko penyakit jantung. Selain itu, kembang kol kaya akan antioksidan, yang dapat melawan kerusakan sel akibat radikal bebas. Mengonsumsinya dapat membantu menjaga berat badan dan mendukung sistem pencernaan yang sehat.",
                        R.drawable.kembangkol,
                        R.drawable.kembangkol_bg),
                arrayOf("Paprika",
                        "Nutrisi: Vitamin C, Vitamin A, Quercetin, Lutein",
                        "Manfaat: Meningkatkan kekebalan tubuh, melindungi mata, dan menurunkan peradangan.",
                        "Baik dalam keadaan mentah atau dimasak, paprika adalah salah satu sayuran yang kaya vitamin C, A, dan E. Vitamin C mendukung sistem imun dan membantu penyerapan zat besi, sementara vitamin A berperan dalam menjaga kesehatan penglihatan. Paprika juga mengandung capsaicin, senyawa yang memberikan rasa pedas, dan diketahui memiliki efek anti-inflamasi serta dapat meningkatkan metabolisme. Paprika juga kaya akan serat dan rendah kalori, menjadikannya pilihan ideal untuk diet sehat.",
                        R.drawable.paprika,
                        R.drawable.paprika_bg),
                arrayOf("Tomat",
                        "Nutrisi: Likopen, Vitamin C, Kalium, Folat, Vitamin K",
                        "Manfaat: Melindungi dari kanker dan baik untuk kesehatan jantung.",
                        "Sumber likopen yang sangat baik, yang merupakan antioksidan kuat yang terbukti membantu melindungi tubuh dari beberapa jenis kanker, terutama kanker prostat. Tomat juga tinggi vitamin C dan kalium, yang penting untuk kesehatan jantung. Mengonsumsi tomat dapat membantu menurunkan risiko penyakit jantung dan mendukung kesehatan kulit. Selain itu, tomat kaya akan air dan serat, sehingga baik untuk pencernaan.",
                        R.drawable.tomat,
                        R.drawable.tomat_bg),
                arrayOf("Wortel",
                        "Nutrisi: Beta-karoten, Vitamin A, Serat, Kalium, Vitamin K",
                        "Manfaat: Baik untuk kesehatan mata dan kulit serta membantu pencernaan.",
                        "Sumber utama beta-karoten, yang diubah tubuh menjadi vitamin A. Wortel sangat penting untuk kesehatan mata, kulit, dan sistem kekebalan tubuh. Selain itu, wortel kaya akan serat, yang membantu menjaga kesehatan pencernaan dan dapat menurunkan risiko penyakit jantung. Mengonsumsi wortel secara teratur juga diketahui dapat meningkatkan kesehatan gigi dan gusi, berkat sifat antibakteri yang dimilikinya.",
                        R.drawable.wortel,
                        R.drawable.wortel_bg)
        )

        val listData: ArrayList<Vegetable>
                get() {
                        val list = ArrayList<Vegetable>()
                        for (data in database) {
                                val vegetable = Vegetable()
                                vegetable.name = data[0] as String
                                vegetable.nutrition = data[1] as String
                                vegetable.benefits = data[2] as String
                                vegetable.description = data[3] as String
                                vegetable.photo = data[4] as Int
                                vegetable.background = data[5] as Int

                                list.add(vegetable)
                        }
                        return list
                }
}
