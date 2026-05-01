package com.kelompok2.gomeseumsulsel;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Cukup memanggil layout activity_home saja
        setContentView(R.layout.activity_home);
    }
}