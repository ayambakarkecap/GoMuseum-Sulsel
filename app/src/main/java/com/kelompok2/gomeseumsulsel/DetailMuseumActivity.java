package com.kelompok2.gomeseumsulsel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_museum);

        // Menemukan komponen dari XML
        ImageView imgDetailMuseum = findViewById(R.id.imgDetailMuseum);
        TextView tvDetailNama = findViewById(R.id.tvDetailNama);
        TextView tvDetailLokasi = findViewById(R.id.tvDetailLokasi);
        TextView tvDetailDeskripsi = findViewById(R.id.tvDetailDeskripsi);

        // Menangkap data yang dikirim dari Adapter
        String nama = getIntent().getStringExtra("EXTRA_NAMA");
        String lokasi = getIntent().getStringExtra("EXTRA_LOKASI");
        String deskripsi = getIntent().getStringExtra("EXTRA_DESKRIPSI");
        int gambar = getIntent().getIntExtra("EXTRA_GAMBAR", 0);

        // Memasang data tersebut ke layar
        tvDetailNama.setText(nama);
        tvDetailLokasi.setText(lokasi);
        tvDetailDeskripsi.setText(deskripsi);
        imgDetailMuseum.setImageResource(gambar);
    }
}