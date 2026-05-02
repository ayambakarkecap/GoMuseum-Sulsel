package com.kelompok2.gomeseumsulsel;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

public class ListMuseumActivity extends AppCompatActivity {

    private RecyclerView rvMuseum;
    private MuseumAdapter adapter;
    private List<Museum> listMuseum;
    private DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_museum);

        // 1. Tangkap nama kategori dari halaman Home (misal: "Sejarah", "Kerajaan", dll)
        String kategori = getIntent().getStringExtra("KATEGORI_TERPILIH");

        // 2. Beri nilai default (jaga-jaga jika intent kosong agar aplikasi tidak force close)
        if (kategori == null || kategori.isEmpty()) {
            kategori = "Sejarah";
        }

        rvMuseum = findViewById(R.id.rvMuseum);
        rvMuseum.setLayoutManager(new LinearLayoutManager(this));
        listMuseum = new ArrayList<>();

        // 3. Masukkan variabel 'kategori' ke dalam child database (Bukan "Sejarah" lagi)
        dbRef = FirebaseDatabase.getInstance("https://kelompok2-project-app-default-rtdb.asia-southeast1.firebasedatabase.app/")
                .getReference("Museum")
                .child(kategori); // <--- INI KUNCI UTAMANYA

        // Ambil data dari Firebase
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listMuseum.clear();
                for (DataSnapshot data : snapshot.getChildren()) {
                    Museum m = data.getValue(Museum.class);
                    listMuseum.add(m);
                }
                adapter = new MuseumAdapter(listMuseum);
                rvMuseum.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ListMuseumActivity.this, "Gagal ambil data: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}