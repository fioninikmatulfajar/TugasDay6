package com.example.tugasday6;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ListAdapter listAdapter;
    private ArrayList<ListModel> listModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.item);
        listAdapter = new ListAdapter(this, listModels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(listAdapter);

        listAdapter.setOnClickListener(new ListAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(ListModel listModel){

                Intent intent = new Intent(MainActivity.this,Detail.class);

                intent.putExtra("Nama Item", listModel.getNamaItem());
                intent.putExtra("desc", getDeskripsi(listModel.getNamaItem()));
                intent.putExtra("Harga", getHarga(listModel.getNamaItem()));
                intent.putExtra("Gambar", listModel.getGmbItem());
                startActivity(intent);
            }
        });

    }

    private void getData(){
        listModels = new ArrayList<>();
        listModels.add(new ListModel("Ria Miranda Luca Dress", R.drawable.img1, "Bhrava Winter 2023 \n" + "The LUCA DRESS from RiaMiranda's winter collection is a unique piece crafted with a loose fit and a one-shoulder draped design. A waist-on-tie system and an overlap detail complete the exclusive design, while sizes S,M,L and XL give everyone the perfect fit. \n" + "Size Guide : S | M | L | XL\n" +
                "- Lingkar dada : 94cm | 98cm | 102cm | 110cm\n" +
                "- Panjang baju depan : 138cm | 138cm | 138cm | 138cm\n" +
                "- Panjang baju belakang : 138cm | 138cm | 138cm | 138cm\n" +
                "- Panjang lengan : 55cm | 56cm | 57cm | 58cm\n" +
                "- Lebar pundak : 37cm | 38cm | 40cm | 42cm\n" +
                "- Lebar manset : 5cm | 5cm | 5cm | 5cm\n" +
                "- Lingkar manset : 20cm | 21cm | 23cm | 24cm\n" +
                "- Lingkar kerung lengan : 47cm | 49cm | 51cm | 55cm\n", 1170000));
        listModels.add(new ListModel("Ria Miranda Septica Dress", R.drawable.img2, "Kahuna Spring 2024 \n" + "Introducing SEPTICA DRESS! Designed by RiaMiranda for Spring 2024. Featuring an exclusive ruffle detail and roundneck design, with a convenient pocket on the side. Available in sizes S,XL,L,XL, be the first to own this stunning dress.\n" +
                "\n" + "Size Guide : S | M | L | XL\n" +
                "Lingkar dada : 94cm | 98cm | 102cm | 110cm\n" +
                "Panjang baju depan : 138cm | 138cm | 138cm | 138cm\n" +
                "Panjang baju belakang : 138cm | 138cm | 138cm | 138cm\n" +
                "Panjang lengan : 55cm | 56cm | 57cm | 58cm\n" +
                "Lingkar manset : 20cm | 21cm | 22cm | 23cm\n" +
                "Lingkar kerung : 47cm | 49cm | 51cm | 55cm\n" +
                "Lebar pundak : 37cm | 38cm | 40cm | 42cm\n",1120000));
        listModels.add(new ListModel("Ria Miranda Blissia Dress", R.drawable.img3, "Blissia Dress tersedia dalam ukuran S M L dan XL.\n" +
                "Blissia Dress menggunakan bahan Satin Doff.\n" +
                "Blissia Dress tersedia warna Lavender.\n" +
                "Panduan Ukuran :\n" +
                "Lingkar Dada   : 94/98/102/110 cm\n" +
                "Panjang Baju Depan    : 140/140/140/140 cm\n" +
                "Panjang Baju Belakang : 140/140/140/140 cm \n" +
                "Lebar Pundak   : 37/38/40/42 cm\n" +
                "Lebar Leher    : 16/16/16,8/16,8\n" +
                "Panjang Lengan : 55/56/57/58 cm\n" +
                "Lingkar Manset : 20/21/22/23,5 cm\n" +
                "Lingkar Kerung : 47/49/51/55 cm\n", 950000));
        listModels.add(new ListModel("Ria Miranda Kanari Dress", R.drawable.img4, "Raya Collection 2024 \n" + "Experience the exclusive RiaMiranda Raya Collection with our KANARI DRESS GIRL. Made with high-quality paper crepe and miranda satin doff materials, this dress boasts a unique print that is sure to make your child stand out. Available in sizes S, M, L, and XL, this dress is perfect for any occasion.\n" + "Size Guide :XS | S | M | L | XL \n" +
                "Lingkar dada : 66cm | 74cm | 80cm | 84cm | 88cm \n" +
                "Panjang baju depan : 80cm | 90cm | 105cm | 115cm | 125cm\n" +
                "Panjang baju belakang : 80cm | 90cm | 105cm | 115cm | 125cm\n" +
                "Lebar leher : 11,9cm | 12,7cm | 13,5cm | 14,3cm | 15,1cm\n" +
                "Panjang lengan : 34cm | 39cm | 44cm | 49cm | 15,1cm\n" +
                "Lingkar manset : 17cm | 18cm | 19cm | 20,5cm | 22cm\n" +
                "Lingkar kerung lengan : 32,73cm | 34,93cm | 37cm | 39,05cm | 41,11cm\n" +
                "Lebar pundak : 27cm | 28cm | 30cm | 32cm | 34cm\n", 650000));
        listModels.add(new ListModel("Ria Miranda Kinne Tunic", R.drawable.img5, "The KINNE TUNIC is a fashionable and sophisticated top with ruffled detail, a drawstring waist, and a structured round neck. Crafted with quality doff satin material, this tunic is perfect for dressy occasions. The stylish button-up detail further elevates the look.\n" + "Size Guide              : S | M | L | XL\n" +
                "Lingkar Dada          : 94cm | 98cm | 102cm | 110cm\n" +
                "Panjang Baju Depan    : 85cm | 85cm | 85cm | 85cm\n" +
                "Panjang Baju Belakang : 85cm | 85cm | 85cm | 85cm\n" +
                "Lebar Bahu            : 35cm | 36cm | 38cm | 40cm        \n" +
                "Lingkar Leher         : 16cm | 16cm | 16,8cm | 16,8cm\n" +
                "Panjang Lengan        : 55cm | 56cm | 57cm | 58cm\n" +
                "Lingkar Manset        : 20cm | 21cm | 22cm | 23,5cm\n" +
                "Lingkar Kerung Lengan : 50cm | 52cm | 54cm | 58cm\n" +
                "Tinggi Manset         : 8cm | 8cm | 8cm | 8cm\n" +
                "Lebar Manset          : 37cm | 38cm | 40cm | 42cm\n", 900000));
        listModels.add(new ListModel("Button Scarf Al-Qasr Series", R.drawable.img6, "The special Raya collection Al-Qasr Series is inspired by the beauty of palaces, the royal residences that are known to imposing, luxurious, and majestic. Available in 13 colors that bring you grandeur and happiness on Eid day.\n" +
                "\n" + "Voile Square\n" +
                "Measurement : 110 x 110 cm\n" +
                "Material: Premium Voile\n" +
                "Laser-cut hem details\n" +
                "Gold charm\n" +
                "Completely opaque\n" +
                "Not slippery and easy to style\n", 425000));
        listModels.add(new ListModel("Zaskia Sungkar Savana Dress", R.drawable.img7, "Savana dress punya detail yang simple namun tetap cantik dan elegant. Dilengkapi tali yang dapat di adjust yang membuat look terlihat lebih ramping.\n" + "Size Guide             : S | M | L | XL | XXL\n" +
                "Lingkar Dada       : 108 | 112 | 116 | 120 | 124\n" +
                "Kerung Lengan      : 48 | 50 | 52 | 53 | 55-56\n" +
                "Panjang Tangan     : 58 | 58 | 60 | 60 | 60\n" +
                "Panjang Baju       : 138 | 138 | 138 | 138 | 140\n", 699000));
        listModels.add(new ListModel("Geulis Humaira Dress / Maxy Dress", R.drawable.img8, "Everything Indonesia koleksi special Geulis dari Indonesia, untuk Indonesia. \n" +
                "Model menggunakan ukuran M \n" +
                "Menggunakan bahan polytextured printed yang terinspirasi dari motif tenun ikat. \n" +
                "Dengan detail bukaan zipper dibagian depan. Terdapat saku dibagian sisi kanan-kiri dan INCLUDE OBI.\n" +
                "Lengan dengan details kancing hias, padukan dres ini dengan hijab atau sepatu yang senada untuk tampilan yang mewah & cantik. \n" +
                "Tersedia dalam 4 pilihan warna Ukuran XS S M L XL XXL \n" +
                "Lingkar Dada  : 90/94/98/104/110/120 \n" +
                "Kerung Lengan : 45/47/49/52/55/60 \n" +
                "Panjang Dress : 140cm\n", 384000));
        listModels.add(new ListModel("Geulis Amory Tunic", R.drawable.img9, "AMORY TUNIC \n" +
                "On model size M \n" +
                "Material woven UV protection printed. \n" +
                "Mampu menangkal sinar UV cocok digunakan untuk aktivitas padat diluar ruangan. Bahannya ringan, soft to touch, & terasa sejuk. Bukaan kancing depan, details tangan karet nyaman. Available dalam 3 pilihan warna Size XS S M L XL XXL \n" +
                "Lingkar Dada  : 90/94/98/104/110/120 \n" +
                "Kerung Lengan : 45/47/49/52/55/60 \n" +
                "Panjang Tunic : 88-90cm\n", 252000));
        listModels.add(new ListModel("Geulis.id x Cut Syifa / Varaya Skirt / Rok Plisket", R.drawable.img10, "Special collaboration Geulis x @cutsyifaa “Dear Diary Collection” terinspirasi dari buku harian dimusim gugur. \n" +
                "Material polycotton printed, comfortable, tebal & anti kusut. Design skirt pleated dengan cuttingan yang sangat cantik, flowy, mewah dan timeless wajib kamu miliki. Padukan skirt ini dengan atasan kesukaan mu dengan warna senada untuk tampilan yang elegant. Available dalam 3 warna cantik ALL SIZE \n" +
                "Lingkar Pinggang Relax : 58-60 \n" +
                "Lingkar Pinggang ditarik : 122 \n" +
                "Panjang Skirt : 94cm\n", 424500));
        listModels.add(new ListModel("Geulis Rashita Outer", R.drawable.img11, "Everything Indonesia koleksi special Geulis dari Indonesia, untuk Indonesia. \n" +
                "Model menggunakan ukuran M \n" +
                "Menggunakan bahan polycotton printed yang terinspirasi dari motif Jumputan. Memiliki bahan yang halus, menyerap keringat sangat cocok digunakan sehari-hari. Terdapat full kancing hidup. Padukan dengan inner & celana jeans untuk look yang lebih casual & chic. Tersedia dalam 2 pilihan warna Ukuran ALL SIZE \n" +
                "Lingkar Dada  : 120cm \n" +
                "Panjang Outer : 90cm\n", 307000));
        listModels.add(new ListModel("Ria Miranda Dulca Skirt", R.drawable.img12, "Dulca Skirt tersedia dalam ukuran S M L dan XL.\n" +
                "Dulca Skirt menggunakan bahan Satin Skin.\n" +
                "Dulca Skirt tersedia warna Beige, Grey dan Purple Mauve.\n" +
                "\n" +
                "Panduan Ukuran :\n" +
                "Lingkar Pinggang Relax  : 68/72/76/80 cm\n" +
                "Lingkar Pinggang Strech : 80/84/88/92 cm\n" +
                "Panjang Rok : 97/97/97/97 cm\n" +
                "Lingkar Panggul : 122/126/130/134 cm\n" +
                "Panjang Layer Depan : 56/57/57/56 cm\n" +
                "Panjang Layer Samping : 54,5/55/55.5/56 cm\n", 675000));
        listModels.add(new ListModel("Ria Miranda Claris Pants", R.drawable.img13, "Claris Pants tersedia dalam ukuran S M L dan XL.\n" +
                "Claris Pants menggunakan bahan Denim.\n" +
                "Claris Pants tersedia warna Denim, Blue, Light Blue dan Dark Denim.\n" +
                "\n" +
                "Panduan Ukuran :\n" +
                "Lingkar Pinggang Relax : 74/78/82/86 cm\n" +
                "Panjang Celana  : 101/102/103/105 cm\n" +
                "Lingkar Panggul : 98/102/106/112 cm\n" +
                "Lingkar Pesak   : 24/24,5/25/25,5 cm\n" +
                "Lingkar Paha    : 58/60/62/64 cm\n" +
                "Lingkar Lutut   : 51/53/55/57 cm\n", 625000));
        listModels.add(new ListModel("Ria Miranda Camille Shirt", R.drawable.img14, "The CAMILLE SHIRT is a basic top featuring a Shanghai collar, baby doll ruffle, and adjustable tie. Its beautiful floral print is available in mauve and oat, adding subtle elegance to any outfit. Crafted with quality materials, this is the perfect addition to any wardrobe.\n" +
                "\n" +
                "Size Guide\n" +
                "Lingkar Dada   : 142,5/146,5/147,5/148,5 cm\n" +
                "Panjang Baju   : 73/73/73/73 cm\n" +
                "Lebar Pundak   : 57,8/58,8/60,8/62,8 cm\n" +
                "Panjang Lengan : 66/67/68/69 cm\n" +
                "Lingkar Manset : 20/21/22/23 cm\n" +
                "Lingkar Kerung : 45,5/47,5/49,5/53,5 cm\n" +
                "Lebar Manset   : 5/5/5/5 cm\n", 750000));
        listModels.add(new ListModel("Ria Miranda Kamila Tunic ", R.drawable.img15, "Bhrava Winter 2023\n" +
                "The KAMILA TUNIC is the perfect addition to your winter wardrobe. This exclusive design features adjustable waist tie and buttoned up detail for a stylish, comfortable fit. Made from quality seer-sucker material with puffed sleeves and a ruffle on the waist, the KAMILA TUNIC is available in three classic colors.\n" +
                "Size Guide : S | M | L | XL\n" +
                "- Lingkar dada : 94cm | 98cm | 102cm | 110cm\n" +
                "- Panjang baju depan : 95cm | 96cm | 97cm | 98cm\n" +
                "- Panjang baju belakang : 95cm | 96cm | 97cm | 98cm\n" +
                "- Panjang lengan : 55cm | 56cm | 57cm | 58cm\n" +
                "- Lingkar manset : 20cm | 21cm | 22cm | 23cm\n" +
                "- Lebar pundak : 37cm | 38cm | 40cm | 42cm\n" +
                "- Lebar manset : 9cm | 9cm | 9cm | 9cm\n", 850000));

    }

    private String getDeskripsi(String namaItem){
        for (ListModel listModel : listModels){
            if (listModel.getNamaItem().equals(namaItem)){
                return listModel.getDeskripsii();
            }
        }
        return "";
    }

    private double getHarga(String namaItem){
        for (ListModel listModel : listModels){
            if (listModel.getNamaItem().equals(namaItem)){
                return listModel.getHarga();
            }
        }
        return 0.0;
    }
}