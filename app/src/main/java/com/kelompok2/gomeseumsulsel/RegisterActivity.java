package com.kelompok2.gomeseumsulsel;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Menghubungkan teks "LOG IN" untuk kembali ke halaman utama
        TextView tvGoToLogin = findViewById(R.id.tvGoToLogin);
        tvGoToLogin.setOnClickListener(v -> {
            finish(); // Perintah finish() akan menutup halaman ini dan mengembalikan user ke halaman sebelumnya (Login)
        });
    }
}