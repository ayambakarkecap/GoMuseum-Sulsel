package com.kelompok2.gomeseumsulsel;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MuseumAdapter extends RecyclerView.Adapter<MuseumAdapter.ViewHolder> {

    private List<Museum> listMuseum;

    public MuseumAdapter(List<Museum> listMuseum) {
        this.listMuseum = listMuseum;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_museum, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Museum museum = listMuseum.get(position);
        holder.tvNamaMuseum.setText(museum.getNama());
        holder.tvLokasiMuseum.setText(museum.getLokasi());
        holder.imgMuseum.setImageResource(museum.getGambar());

        // Membuat seluruh kotak bisa diklik
        holder.itemView.setOnClickListener(v -> {
            // Membuka DetailMuseumActivity dan membawa data
            Intent intent = new Intent(v.getContext(), DetailMuseumActivity.class);
            intent.putExtra("EXTRA_NAMA", museum.getNama());
            intent.putExtra("EXTRA_LOKASI", museum.getLokasi());
            intent.putExtra("EXTRA_DESKRIPSI", museum.getDeskripsi());
            intent.putExtra("EXTRA_GAMBAR", museum.getGambar());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listMuseum.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMuseum;
        TextView tvNamaMuseum, tvLokasiMuseum;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMuseum = itemView.findViewById(R.id.imgMuseum);
            tvNamaMuseum = itemView.findViewById(R.id.tvNamaMuseum);
            tvLokasiMuseum = itemView.findViewById(R.id.tvLokasiMuseum);
        }
    }
}