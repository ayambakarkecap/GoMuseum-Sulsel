package com.kelompok2.gomeseumsulsel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Menampilkan desain XML activity_main
        setContentView(R.layout.activity_main);

        // Menemukan teks DAFTAR berdasarkan ID
        TextView tvGoToRegister = findViewById(R.id.tvGoToRegister);

        // Memberikan perintah saat teks DAFTAR diklik
        tvGoToRegister.setOnClickListener(v -> {
            // Membuka intent untuk berpindah dari MainActivity ke RegisterActivity
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}