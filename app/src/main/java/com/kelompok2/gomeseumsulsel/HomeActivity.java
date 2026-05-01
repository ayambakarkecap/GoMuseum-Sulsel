package com.kelompok2.gomeseumsulsel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Menemukan tombol dari XML berdasarkan ID
        Button btnKategoriSejarah = findViewById(R.id.btnKategoriSejarah);
        Button btnKategoriBudaya = findViewById(R.id.btnKategoriBudaya);

        // Perintah saat tombol Museum Sejarah diklik
        btnKategoriSejarah.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ListMuseumActivity.class);
            startActivity(intent);
        });

        // Perintah saat tombol Museum Budaya diklik
        btnKategoriBudaya.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ListMuseumActivity.class);
            startActivity(intent);
        });
    }
}