package com.example.tubes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimeFragment extends Fragment {

    private ArrayList<Integer> fotoAnime = new ArrayList<>();
    private ArrayList<String> namaAnime = new ArrayList<>();
    private ArrayList<String> infoAnime = new ArrayList<>();
    private ArrayList<String> linkAnime = new ArrayList<>();

    View view;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_anime, container, false);
        recyclerView = view.findViewById(R.id.RecycleAnime);
        getData();
        return view;
    }

    private void prosesRecycleViewAdapter(){
        AdapterAnime adapter = new AdapterAnime(fotoAnime, namaAnime,infoAnime, linkAnime, getContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void getData(){

//        namaAnime.add("Fubuki");
//        fotoAnime.add(R.drawable.fubuki);
//        infoAnime.add("asd");

        namaAnime.add("Hyouka BD (Episode 01 — 22) Sub Indo + OVA");
        fotoAnime.add(R.drawable.hyouka);
        infoAnime.add("Atas permintaan kakaknya, Oreki Houtarou menjadi anggota Klub Sastra di SMA Kamiyama. Di klub itu dia bertemu dengan Chitanda Eru, Fukube Satoshi dan Ibara Mayaka. Chitanda adalah seorang gadis cantik yang memiliki rasa ingin tahu yang tinggi pada banyak hal. Satoshi adalah laki-laki periang yang tahu banyak hal, dia sering menyebut dirinya “database”. Sedangkan Ibara adalah seorang gadis yang tegas kepada semua orang termasuk dirinya sendiri.\n" +
                "\n" +
                "Di klub sastra mereka mulai berhadapan dengan banyak kasus misteri yang banyak terjadi di sekolah. Oreki memiliki moto “Tidak akan melakukan jika memang tidak harus melakukannya, dan jika harus melakukannya maka akan diselesaikan dengan cepat”. Dia yang selalu menghemat energinya terpaksa harus menyelesaikan banyak kasus karena desakan dari Chitanda yang punya rasa ingin tahu yang tinggi.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=0BypuU6jTnQ_6cHhQX2NXVmROaXM&export=download");

        namaAnime.add("Neon Genesis Evangelion BD (Episode 01 - 23) Sub Indo");
        fotoAnime.add(R.drawable.evangelion);
        infoAnime.add("Di tahun 2015, dunia berada di ambang kehancuran. Harapan terakhir umat manusia ada di tangan Nerv, badan khusus di bawah naungan PBB dan Evangelion mereka, mesin raksasa yang mampu mengalahkan Malaikat yang menandai kehancuran Bumi. Gendou Ikari , kepala organisasi, mencari pilot yang cocok yang dapat melakukan sinkronisasi dengan Evangelion dan menyadari potensi mereka yang sebenarnya. Dalam upaya untuk membantu bertahan, Gendou Hikari dibantu oleh personel berbakat Misato Katsuragi, Kepala Operasi Taktis, dan Ritsuko Akagi, Kepala Ilmuwan.\n" +
                "\n" +
                "Bertatap muka dengan ayahnya untuk pertama kalinya setelah beberapa tahun, rata-rata kehidupan Shinji Ikari yang berusia 14 tahun berubah secara permanen ketika dia terlibat dengan Nerv dan menuju takdir baru yang mengerikan, dia harus menjadi pilot Evangelion Unit-01 dengan nasib umat manusia di pundaknya.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=0B3b5KV_5xG6JbUt0bk5udVlOYTg&export=download");

        namaAnime.add("Uzaki-chan wa Asobitai! (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.uzaki);
        infoAnime.add("Salah satu keinginan Sakurai Shinichi adalah sedikit kedamaian dan ketenangan. Tetapi Uzaki Hana — adik kelasnya yang riuh dan berpengetahuan luas — memiliki rencana lain. Yang dia inginkan adalah bergaul dan mempermainkannya. Dengan bantuan pesona segar dan kegigihannya, ini mungkin hanya awal dari hubungan yang indah!");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1zjG5nMNqTHaxWcSs4wUxs5bIw1ZZKa9u&confirm=jYel&export=download");

        namaAnime.add("Houkago Teibou Nisshi (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.htn);
        infoAnime.add("Hina Tsurugi baru saja pindah ke kota untuk melanjutkan sekolah. Saat berjalan di sepanjang tanggul, ia bertemu dan diajak kakak kelasnya, Kuroiwa untuk bergabung ke klub \"Teibou\". Para anggota klub menghabiskan waktu mereka dengan memancing dan menikmati hasil tangkapan bersama-sama. Hina yang sebelumnya anak indor mulai tertarik dengan lautan.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1zl5D9Msy1dRSU9Q_Lljc0ADA_L01W_2-&confirm=jYel&export=download");

        namaAnime.add("Kakushigoto BD (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.kakushigoto);
        infoAnime.add("Kakushi Gotou, seorang komikus yang menyembunyikan pekerjaannya dari putrinya, Hime. Kata \"Kakushi Goto\" dalam bahasa jepang bisa berarti \"Sesuatu yang disembunyikan\" dan bisa juga berarti \"Pekerjaan Menggambar\".");
        linkAnime.add("https://drive.google.com/u/0/uc?id=16XvyttIDMD2ohfjGTsuieKDyXJaOajwo&confirm=jYel&export=download");

        namaAnime.add("Joshikausei BD (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.joshikausei);
        infoAnime.add("Siapa yang butuh dialog jika karakternya seimut ini? si cantik Momoko (tapi sial), si keren Shibumi, dan si polos tanpa dosa Mayumi. Inilah kisah unik tiga gadis SMA tanpa dialog, hanya animasi dan efek suara.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1XP34cese6xfOW1etzvS23Csu62lzQWw1&confirm=jYel&export=download");

        namaAnime.add("Nekopara BD (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.nekopara);
        infoAnime.add("Kashou Minaduki ingin memulai hidup baru dengan membuka toko kue secara mandiri. Tak disangka, dua neko yang berasal dari rumah keluarganya, yaitu Chocola (disuarakan oleh Himari) dan Vanilla (disuarakan oleh Amu Nakamura), mengikuti dirinya dengan bersembunyi di dalam kardus. Akhirnya, kedua neko tersebut tinggal bersama Kashou dan ikut membantu usaha toko kuenya. Tidak hanya itu, adik dari sang protagonis, Shigure, bersama dengan para neko lainnya yang dimiliki keluarganya juga ikut meramaikan kehidupan Kashou.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1_amAkTvwlMnDQYXZUHd5v7vjgvGEXZKq&confirm=jYel&export=download");

        namaAnime.add("Kimetsu no Yaiba BD (Episode 01 — 26) Sub Indo");
        fotoAnime.add(R.drawable.kny);
        infoAnime.add("Sejak dahulu kala, ada banyak rumor tentang iblis pemakan manusia yang bersembunyi di hutan. Karena itu, penduduk setempat tak pernah berani keluar saat malam hari. Legenda mengatakan bahwa Pemburu Iblis juga berkeliaran di malam hari dan memburu iblis yang haus darah. Bagi Tanjirou, hal itu adalah kenangan terburuknya.\n" +
                "\n" +
                "Sejak kematian ayahnya, Tanjirou menggantikan ayahnya untuk memenuhi kebutuhan keluarganya. Meski kehidupan mereka sangat berat, mereka merasakan kebahagiaan yang luar biasa. Tapi, kebahagiaan itu hancur saat Tanjirou melihat keluarganya dibantai. Tidak hanya itu, satu-satunya keluarganya yang selamat, adik perempuannya, Nezuko, berubah menjadi Iblis. Tapi, Nezuko masih menunjukkan tanda-tanda emosi dan pemikiran manusia. Perjalanan Tanjirou untuk melawan iblis dan mengembalikan adiknya menjadi manusia akhirnya dimulai.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1F8BD6DV0iSHRfl1hR5dJNIrZnD5jnIzL&confirm=jYel&export=download");

        namaAnime.add("High School DxD S4 BD (Episode 00 — 12) Sub Indo");
        fotoAnime.add(R.drawable.dxd);
        infoAnime.add("Musim keempat dari seri anime High School DxD. Hyoudou Issei adalah seorang siswa biasa seperti siswa SMA lainnya yang ingin memiliki harem di hidupnya. Namun, sialnya saat kencan pertamanya dengan seorang gadis cantik, ia justru diserang secara brutal oleh malaikat yang jatuh dari langit hingga membuatnya tewas. Setelah kejadian itu, kakak kelasnya yang cantik membuatnya bereinkarnasi sebagai setan. Kakak kelasnya mengatakan padanya bahwa sekarang Issei menjadi setan, sama sepertinya. Sejak kejadian itu, Issei ikut terseret dalam pertempuran antara setan dengan malaikat.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1SP_U99dpVl0kelgQKbgk06PMXIp12vYr&confirm=jYel&export=download");

        namaAnime.add("Vinland Saga BD (Episode 01 — 24) Sub Indo\n");
        fotoAnime.add(R.drawable.vinland);
        infoAnime.add("Selama seribu tahun, Viking telah menyebarkan nama dan reputasi mereka sebagai klan terkuat yang dipenuhi rasa haus akan kekerasan. Thorfinn, anak salah satu pejuang Viking terhebat, menghabiskan masa kecilnya di medan perang dan meningkatkan keterampilannya untuk membalaskan dendam ayahnya.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1sWg8b_vWVK6wxGUB5WjULYJtUwKhsMwA&confirm=jYel&export=download");

        namaAnime.add("JoJo no Kimyou na Bouken Part 5: Ougon no Kaze (Episode 01 — 39) Sub Indo");
        fotoAnime.add(R.drawable.jojo);
        infoAnime.add("Cerita dimulai ketika Joutarou meminta Kouichi untuk melakukan perjalanan ke Naples untuk menyelidiki seseorang yang dikenal sebagai Haruno Shiobana yang kemudian terungkap memiliki nama asli Giorno Giovanna. Anime ini berpusat pada Giorno yang berambisi menjadi yang teratas di kelompok mafia Passione dan mengubahnya menjadi kelompok pencuri yang terhormat.\n" +
                "(Disunting dari ANN)");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1jlAvHozse3LjM0Nj2f2XdvqKmuA3QcMJ&confirm=jYel&export=download");

        namaAnime.add("Monogatari Series: Second Season BD (Episode 01 — 23) Sub Indo");
        fotoAnime.add(R.drawable.monogatari);
        infoAnime.add("Saat perjalanan ke sekolah, Hanekawa bertemu dengan makhluk berwujud harimau putih besar yang dapat berbicara. Keesokan harinya rumahnya terbakar. Karena tidak memiliki tempat tinggal lagi, Hanekawa bermalam di gedung tua bekas sekolah yang dulu sering ditempati Oshino Meme. Dia terbangun mendengar teriakan Senjougahara yang mengkhawatirkannya. Senjougahara memaksanya tinggal dirumahnya. Berusaha untuk menghubungi Araragi, mereka menemukan bahwa Araragi telah menghilang.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1hYIv0LIGnIhk3ynFZWuwYLz0ChG7AV25&confirm=jYel&export=download");

        namaAnime.add("Youjo Senki BD (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.youjo);
        infoAnime.add("Dalam peperangan, seorang gadis kecil berdiri di barisan depan. Gadis itu memiliki rambut berwarna pirang, bermata biru dan berkulit putih bersih. Gadis yang memerintah pasukannya dengan suara cadel seperti anak-anak itu bernama Tanya Degurechaff. Sebenarnya dia adalah salah satu pegawai kantoran paling elit di Jepang yang dilahirkan kembali sebagai seorang gadis kecil oleh makhluk misterius yang mengaku sebagai Tuhan. Gadis kecil yang menganggap efisiensi dan pekerjaan di atas segalanya ini membuatnya menjadi makhluk paling berbahaya di antara para penyihir dan tentara kerajaan.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1iv7UfOuez1MvaArcq_SAs8BS5KTHNPU-&confirm=jYel&export=download");

        namaAnime.add("BanG Dream! S3 (Episode 01 — 13) Sub Indo");
        fotoAnime.add(R.drawable.bangdream);
        infoAnime.add("Touyama Kasumi adalah gadis SMA yang baru saja menemukan hal yang mengagumkan setelah melihat sebuah gitar berbentuk bintang di sebuah pegadaian tua. Ini adalah pertama kalinya jiwanya terdorong untuk malakukan hal yang besar. Bersama dengan empat gadis lain dengan impian yang sama, mereka berencana untuk melakukan pertunjukan hebat melalui musik.\n" +
                "\n" +
                "Karena dia masih sangat muda, Kasumi Toyama selalu mencari “Star Beat”, sebuah suara yang berkilau dan menarik yang didengarnya sambil melihat ke langit malam. Baru setelah masuk SMA, Kasumi menemukan “gitar berbentuk bintang” di area penyimpanan sebuah toko gadai tua. Merasa terburu-buru dan kegirangan yang belum pernah dirasakannya sebelumnya, Kasumi bergabung dengan empat gadis lainnya dan memulai sebuah perjalanan untuk mencari tempat yang berkilau. Kami berjanji untuk melakukan live di sini\n" );
        linkAnime.add("https://drive.google.com/u/0/uc?id=1R9FtPURAjy_55jlyEXyGQmV28aOngL0r&confirm=jYel&export=download");

        namaAnime.add("Karakai Jouzu no Takagi-san BD (Episode 01 — 12) Sub Indo");
        fotoAnime.add(R.drawable.takagi);
        infoAnime.add("“Kalau kau tersipu malu, maka kau kalah”\n" +
                "\n" +
                "Dengan berpegang pada prinsip itu, Nishikata yang seorang murid SMP selalu saja dijahili oleh Takagi, gadis yang duduk di sebelahnya. Nishikata yang merasa harga dirinya hancur berantakan, bersumpah untuk membalas perbuatan Takagi. Namun, meskipun sudah mencoba dengan berbagai cara, pada akhirnya dirinya yang justru jadi korbannya. Dan begitulah kisah komedi remaja ini dimulai.\n");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1dX-6yGFqhPxP9Gck0Pcdy-VPuWYzLrZz&confirm=jYel&export=download");

        namaAnime.add("KonoSuba BD (Episode 01 — 10) + OVA Sub Indo");
        fotoAnime.add(R.drawable.konosuba);
        infoAnime.add("Cerita bermula ketika Satou Kazuma, seorang pemuda yang merupakan hikikomori, meninggal dunia akibat kejadian yang sangat konyol dan memalukan.\n" +
                "\n" +
                "Sebelum masuk dunia afterlife, Kazuma bertemu dengan seorang goddess bernama Aqua.\n" +
                "\n" +
                " \n" +
                "Goddess cantik tersebut menawarkan Kazuma bereinkarnasi ke sebuah dunia fantasi bergenre MMORPG dimana Kazuma bisa berpetualang selayaknya hero dalam game.\n" +
                "\n" +
                " \n" +
                "Aqua juga menawarkan beberapa ultima godly weapon pada Kazuma untuk dibawa ke dunia selanjutnya, namun Kazuma malah memilih Aqua untuk dibawa ke dunia selanjutnya.\n" +
                "\n" +
                " \n" +
                "Meskipun protes keras, Aqua dan Kazuma akhirnya sukses dikirim ke dunia MMORPG.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=19yRWmCOsKSnkRHZlMC93PbXoihTgVMUL&confirm=jYel&export=download");

        namaAnime.add("Higurashi no Naku Koro ni BD (Episode 01 — 26) Sub Indo");
        fotoAnime.add(R.drawable.higurashi);
        infoAnime.add("Anime ini mengambil setting di sebuah desa bernama Hinamizawa pada tahun 1983.\n" +
                "\n" +
                " \n" +
                "Bercerita tentang Keiichi Maebara, seorang murid pindahan yang baru saja menetap di desa tersebut.\n" +
                "\n" +
                " \n" +
                "Di sana dia masuk ke sekolah satu-satunya di sana yang mempunyai murid yang sangat sedikit sehingga satu kelas tersebut terdiri dari berbagai tingkatan.\n" +
                "\n" +
                " \n" +
                "Pada saat musim panas, Keiichi mengetahui adanya festival tahunan yang selalu diselenggarakan oleh desa Hinamizawa. Festival tersebut dinamakan Festival Watanagashi — yang ditujukan untuk menyembah ‘Oyashiro~sama’.\n" +
                "\n" +
                " \n" +
                "Keiichi juga menyadari berbagai keanehan yang ada pada desa Hinamizawa dan teman-temannya, seperti :\n" +
                "\n" +
                "Setiap festival Wataganashi, pasti ada satu orang yang mati mengenaskan dan satu orang yang menghilang\n" +
                "Insiden naas yang terjadi pada pembangunan dam 4 tahun silam\n" +
                "Serta masa lalu teman-temannya yang ternyata tidak sepolos mukanya");
        linkAnime.add("https://drive.google.com/u/0/uc?id=15i_LEMOhKpp-h_3HIp3d4GABat0MKKs-&confirm=jYel&export=download");

        namaAnime.add("New Game! BD (Episode 01 — 12) + OVA Sub Indo");
        fotoAnime.add(R.drawable.newgame);
        infoAnime.add("Sejak memainkan game Fairies Story tujuh tahun silam dan kagum dengan karakter-karakter di dalamnya, Suzukaze Aoba bercita-cita menjadi desainer karakter.\n" +
                "\n" +
                " \n" +
                "Oleh karena itu, setelah lulus SMA ia pun langsung melamar kerja di developer game Eagle Jump.\n" +
                "\n" +
                " \n" +
                "Ternyata pekerjaan seorang desainer karakter lebih rumit dan menyita lebih banyak waktu dari yang ia bayangkan sebelumnya.\n" +
                "\n" +
                " \n" +
                "Namun, berkat bimbingan langsung dari Yagami Kou, desainer di balik Fairies Story, dan juga berkat dukungan dari rekan-rekan kerjanya, Aoba terus berjuang dalam mewujudkan cita-citanya tersebut.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1TZKkgKYgEko8uK71t86pUnoH2GjlSMK-&confirm=jYel&export=download");

        namaAnime.add("Nichijou BD (Episode 00 — 26) Sub Indo");
        fotoAnime.add(R.drawable.nichijou);
        infoAnime.add("Anime ini bercerita tentang tiga anak SMA bernama Aiyoi Yuuko, Naganohana Mio dan Minakami Mai.\n" +
                "\n" +
                "… juga mengisahkan tentang Profesor Hakase beserta robot ciptaannya yang bernama Nano, sang kucing yang bisa bicara, Sakamoto dan masih banyak lagi.\n" +
                "\n" +
                " \n" +
                "Mereka menjalani kehidupan sehari-harinya yang normal di sebuah kota yang dihuni oleh orang-orang yang … normal.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1it6HEyyYHMIpA5Zf7ZpKqx7WSzFoL9TT&confirm=jYel&export=download");

        namaAnime.add("Fate/kaleid liner Prisma☆Illya 2wei! (Episode 01 – 10) Sub Indo");
        fotoAnime.add(R.drawable.ilya);
        infoAnime.add("Season kedua ini bercerita tentang Chloe von Einzbern, karakter baru yang mirip dengan Illya hanya saja berkulit gelap. Tiba-tiba Chloe, sebut saja Kuro menyerang Illya. Entah apa alasannya. Untuk melindungi Illya, Rin dan Luvia menangkap Kuro dan membuat segel diperutnya dengan darah Illya agar Kuro dan Illya dapat saling terhubung. Kalau digambarkan, setiap tubuh Illya diserang, maka Kuro akan merasakannya. Misal pipi Illya ditampar, maka Kuro juga akan merasakan sakitnya tamparan tersebut. Hal ini untuk mencegah Kuro membunuh Illya, karena jika Kuro membunuh Illya, secara tidak langsung maka Kuro juga akan terbunuh.");
        linkAnime.add("https://drive.google.com/u/0/uc?id=1nPi1zy_a4Ll3kc6nhFdvEC5rxDJCGydZ&confirm=jYel&export=download");

        prosesRecycleViewAdapter();
    }
}