package com.kelompok2.gomeseumsulsel;

public class Museum {
    private String nama;
    private String lokasi;
    private int gambar; // Menyimpan ID gambar

    public Museum(String nama, String lokasi, int gambar) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.gambar = gambar;
    }

    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }
    public int getGambar() { return gambar; }
}