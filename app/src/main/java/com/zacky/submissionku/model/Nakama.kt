package com.zacky.submissionku.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity
@Parcelize
data class Nakama(
    @PrimaryKey
    val id: String,
    val name: String?,
    val description: String?,
    val imgUrl: String?,
) : Parcelable

val nakamas = arrayListOf(
    Nakama(
        "1",
        "Monkey D Luffy",
        "Monkey D. Luffy, juga dikenal sebagai \"Luffy Topi Jerami\" dan umumnya sebagai \"Topi Jerami\", adalah pendiri dan kapten dari Bajak Laut Topi Jerami yang semakin terkenal dan kuat, serta yang paling kuat dari petarung topnya. Dia ingin menemukan harta karun legendaris yang ditinggalkan oleh mendiang Gol D. Roger dan dengan demikian menjadi Raja Bajak Laut, yang akan membantu memfasilitasi mimpinya yang tidak diketahui yang dia ceritakan hanya kepada Shanks, saudara laki-lakinya, dan krunya. Dia percaya bahwa menjadi Raja Bajak Laut berarti memiliki kebebasan terbesar di dunia.",
        "https://static.wikia.nocookie.net/onepiece/images/6/6d/Monkey_D._Luffy_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20180809124628&path-prefix=id"
    ),
    Nakama(
        "2",
        "Roronoa Zoro",
        "Roronoa Zoro juga dikenal sebagai \"Pemburu Bajak Laut\". Dia adalah pendekar pedang Bajak laut Topi Jerami. Zoro Bercita-cita untuk menjadi pendekar pedang terkuat di Dunia, yaitu dengan melampaui pendekar pedang terhebat saat ini yaitu Dracule Mihawk. Zoro selalu membawa ketiga pedangnya, terbungkus dengan haramaki berwarna hijau di atas pinggul kanannya, sehingga dia dengan mudah menarik pedang menggunakan tangan kiri. Meskipun dia jarang menggunakan tangan kanan saat mengeluarkan pedang, ia biasanya menggunakan tangan kanannya untuk menarik pedang-pedangnya sebelum dia duduk.",
        "https://static.wikia.nocookie.net/onepiece/images/5/52/Roronoa_Zoro_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20180825161324&path-prefix=id"
    ),
    Nakama(
        "3",
        "Nami",
        "Nami si \"Kucing Pencuri\" (ナミ Nami) adalah seorang bajak laut dan navigator dari kelompok Bajak Laut Topi Jerami. Dia di besarkan di Desa Cocoyasi di East Blue dan menjadi anggota ketiga kru topi jerami setelah kekalahan Arlong. Sebelum bergabung, Nami dikenal sebagai pencuri yang ulung. Impiannya adalah untuk dapat memetakan seluruh dunia. Dia memiliki nilai bounty sebesar Berry 16.000.000 setelah peristiwa di Enies Lobby. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Nami mendapat kenaikan bounty menjadi Berry 66.000.000.",
        "https://static.wikia.nocookie.net/onepiece/images/6/68/Nami_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190722153153&path-prefix=id"
    ),
    Nakama(
        "4",
        "Usopp",
        "\"God\" Usopp adalah Penembak Jitu dari Bajak Laut Topi Jerami dan mantan Kapten dari Bajak Laut Usopp. Ia dilahirkan di Desa Syrup dan pertama kali disebutkan oleh Yasopp, ayahnya. Meskipun pengecut yang normal, Usopp bermimpi menjadi seorang pejuang pemberani laut seperti ayahnya dan hidup setiap hari dalam mengejar hidup sampai mimpi ini. Dia secara resmi anggota ketiga (tidak resmi keempat) dari kru, dan yang ketiga untuk bergabung, dan, termasuk Nami dan Robin, juga yang ketiga untuk bergabung kembali, melakukannya pada akhir Enies Lobby. Bounty aslinya sebesar Berry 30.000.000 dikreditkan ke alias dan alter-ego 'Sogeking'",
        "https://static.wikia.nocookie.net/onepiece/images/3/35/Usopp_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20150624040758&path-prefix=id"
    ),
    Nakama(
        "5",
        "Sanji",
        "\"Kaki Hitam\" Sanji (黒脚・サンジ Kuro ashi no Sanji?) adalah seorang bajak laut merangkap koki dari kelompok Bajak Laut Topi Jerami. Ia merupakan anggota kelima yang bergabung menjadi anggota kru saat kru topi jerami berlabuh di restoran terapung Baratie. Meski bergabung dan dibesarkan di East Blue, Sanji aslinya dilahirkan di North Blue sehingga ia adalah anggota kru topi jerami pertama yang tidak berasal dari East Blue. Impian Sanji adalah untuk dapat menemukan \"All Blue\", sebuah lautan dimana East Blue, West Blue, North Blue dan South Blue saling bertemu dan menghasilkan bahan-bahan masakan terbaik yang merupakan surga bagi para koki. Setelah insiden di Dressrosa, ia memiliki nilai bounty sebesar Berry 177.000.000. Setelah insiden di Whole Cake Island, ia memiliki nilai bounty sebesar Berry 330.000.000.",
        "https://static.wikia.nocookie.net/onepiece/images/b/b6/Sanji_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20180906133651&path-prefix=id"
    ),
    Nakama(
        "6",
        "Tony Tony Chopper",
        "Tony Tony Chopper adalah seorang dokter bajak laut dari kelompok Bajak Laut Topi Jerami. Ia aslinya seekor rusa yang dapat bertransformasi menjadi manusia setelah tanpa sengaja memakan Buah Iblis \"Hito Hito no Mi\". Oleh Pemerintah Dunia, ia disalahtafsirkan sebagai hewan peliharaan kru topi jerami dan hanya dikaruniai nilai bounty sebesar Berry 50 setelah peristiwa di Enies Lobby. Mimpinya bersama kru topi jerami yaitu dapat menyembuhkan segala penyakit di dunia termasuk dapat melihat luasnya dunia sesuai pesan Dr. Hiluluk.",
        "https://static.wikia.nocookie.net/onepiece/images/a/af/Tony_Tony_Chopper_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190127203911&path-prefix=id"
    ),
    Nakama(
        "7",
        "Nico Robin",
        "Nico Robin (ニコ・ロビン Niko Robin?) adalah mantan Baroque Works yang bergabung menjadi anggota kru ketujuh kelompok Bajak Laut Topi Jerami. Ia seorang arkeolog dari pulau Ohara, dan menjadi buronan pemerintah sejak berumur 8 tahun berkat kemampuannya membaca poneglyph dengan bounty sebesar Berry 79.000.000. Impian terbesar dalam hidup Robin yakni menemukan Rio Poneglyph yang mencatat \"Sejarah Sebenarnya\" dari masa yang hilang. Setelah insiden di enies lobby, bountynya meningkat menjadi Berry 80.000.000. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Robin mendapat kenaikan bounty menjadi Berry 130.000.000. Ia memiliki kekuatan Buah Iblis \"Hana Hana no Mi\", yang memberinya kemampuan menggandakan bagian tubuh ditempat lain. Setelah aksi Bartholomew Kuma memisahkan kru topi jerami di Sabaody, Robin diketahui tiba di Tequila Wolf di East Blue dan ditangkap pihak pemerintah. Tentara Revolusioner kemudian muncul membebaskan Robin dan mengajaknya pergi menemui pimpinan revolusioner; Monkey D. Dragon di Baltigo.",
        "https://static.wikia.nocookie.net/onepiece/images/b/bc/Nico_Robin_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190128075946&path-prefix=id"
    ),
    Nakama(
        "8",
        "Franky",
        "\"Cyborg\" Franky (\"鉄人\"フランキー \"Saibōgu\"\" Furankī?) adalah anggota kru Bajak Laut Topi Jerami yang bertugas sebagai mekanik kapal Thousand Sunny. Pertama kali muncul sebagai pemimpin Keluarga Franky, sebuah genk bawah tanah yang menguasai jalanan Water 7. Ia bernama asli \"Cutty Flam\" namun kemudian diganti karena permintaan Iceburg. Ia awalnya menjadi musuh kru topi jerami, namun berubah menjadi teman setelah perkembangan situasi memaksa mereka berbalik mendukung kru topi jerami. Setelah Franky mendapat bounty pertama, Keluarga Franky mendatangi kru topi jerami dan memohon agar merekrutnya. Ia menjadi anggota ke-8 kru topi jerami dan memiliki bounty sebesar Berry 44.000.000 setelah insiden di Enies Lobby. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote di Dressrosa, Franky mendapat kenaikan bounty menjadi Berry 94.000.000. Mimpinya adalah membuat sebuah kapal yang mampu mengarungi segala jenis lautan.",
        "https://static.wikia.nocookie.net/onepiece/images/8/8c/Franky_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190127212001&path-prefix=id"
    ),
    Nakama(
        "9",
        "Brook",
        "Brook (ブルック Burukku) adalah seorang bajak laut dan musisi dari kelompok Bajak Laut Topi Jerami. Ia menjadi kru kesembilan yang bergabung setelah ditemukan tanpa sengaja di atas kapalnya yang karam di lautan misterius \"Segitiga Florian\". Impiannya adalah dapat bertemu Laboon kembali saat kru topi jerami selesai berlayar mengelilingi Grand Line. Ia berwujud seorang tengkorak yang hidup kembali berkat kekuasaan Buah Iblis miliknya \"Yomi Yomi no Mi\". Di atas kapal, Brook termasuk satu dari dua orang pendekar pedang selain Roronoa Zoro, dan memiliki nilai bounty sebesar Berry 33.000.000 saat baru bergabung. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Brook mendapat kenaikan bounty menjadi Berry 83.000.000.",
        "https://static.wikia.nocookie.net/onepiece/images/4/41/Brook_Anime_Post_Timeskip_Infobox.png/revision/latest?cb=20190127214349&path-prefix=id"
    ),
    Nakama(
        "10",
        "Jinbe",
        "Jinbe ( ジンベエ Jinbē? ) adalah seorang mermen spesies hiu paus, mantan Shichibukai dan kapten kedua kelompok Bajak Laut Matahari setelah Fisher Tiger. Gelar Shichibukainya dicabut karena menolak ikut serta dalam perang melawan Shirohige, serta secara terang-terangan membantu Monkey D. Luffy dan Bajak Laut Whitebeard. Namanya disebutkan pertama kali oleh Yosaku setelah Cerita Baratie Chapter 69 sebagai seorang Shichibukai, namun penampakannya baru muncul dalam Cerita Impel Down Chapter 528 sebagai Shichibukai terakhir yang diperkenalkan. Ia kemudian bersekutu dengan Luffy dan kru topi jerami melawan pemberontakan Bajak Laut Manusia Ikan Baru dan Vander Decken IX terhadap Kerajaan Ryugu. Jinbe bahkan ditawari bergabung dengan kru topi jerami, namun menolak karena masih memiliki urusan yang belum selesai dengan Yonko Big Mam. Menurut anggota kru Bajak Laut Manusia Ikan Baru, ia memiliki nilai bounty lebih dari Berry 400.000.000.",
        "https://static.wikia.nocookie.net/onepiece/images/8/81/Jinbe_Anime_Infobox.png/revision/latest?cb=20180806110923&path-prefix=id"
    )
)
