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
        // Mengatur agar daftarnya memanjang ke bawah (vertikal)
        rvMuseum.setLayoutManager(new LinearLayoutManager(this));

        // Membuat data museum sementara (Dummy Data)
        listMuseum = new ArrayList<>();
        listMuseum.add(new Museum("Museum Balla Lompoa", "Kab. Gowa", R.mipmap.ic_launcher));
        listMuseum.add(new Museum("Museum La Galigo", "Kota Makassar", R.mipmap.ic_launcher));
        listMuseum.add(new Museum("Museum Karaeng Pattingalloang", "Kota Makassar", R.mipmap.ic_launcher));
        listMuseum.add(new Museum("Museum Kota Makassar", "Kota Makassar", R.mipmap.ic_launcher));
        listMuseum.add(new Museum("Museum Batara Guru", "Kota Palopo", R.mipmap.ic_launcher));

        // Memasang adapter ke RecyclerView
        adapter = new MuseumAdapter(listMuseum);
        rvMuseum.setAdapter(adapter);
    }
}