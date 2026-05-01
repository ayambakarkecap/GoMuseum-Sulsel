package com.kelompok2.gomeseumsulsel;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ListMuseumActivity extends AppCompatActivity {

    private RecyclerView rvMuseum;
    private MuseumAdapter adapter;
    private List<Museum> listMuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_museum);

        rvMuseum = findViewById(R.id.rvMuseum);
        rvMuseum.setLayoutManager(new LinearLayoutManager(this));

        listMuseum = new ArrayList<>();
        // Menambahkan deskripsi pada setiap museum
        listMuseum.add(new Museum("Museum Balla Lompoa", "Kab. Gowa", R.mipmap.ic_launcher, "Museum Balla Lompoa adalah rekonstruksi dari istana Kerajaan Gowa. Menyimpan berbagai koleksi benda bersejarah peninggalan Kerajaan Gowa."));
        listMuseum.add(new Museum("Museum La Galigo", "Kota Makassar", R.mipmap.ic_launcher, "Terletak di dalam kompleks Benteng Fort Rotterdam. Museum ini memiliki ribuan koleksi yang berkaitan dengan sejarah dan kebudayaan Sulawesi Selatan."));
        listMuseum.add(new Museum("Museum Karaeng Pattingalloang", "Kota Makassar", R.mipmap.ic_launcher, "Museum yang didedikasikan untuk mengenang kecerdasan Karaeng Pattingalloang, seorang mangkubumi Kerajaan Gowa-Tallo yang sangat mencintai ilmu pengetahuan."));

        adapter = new MuseumAdapter(listMuseum);
        rvMuseum.setAdapter(adapter);
    }
}