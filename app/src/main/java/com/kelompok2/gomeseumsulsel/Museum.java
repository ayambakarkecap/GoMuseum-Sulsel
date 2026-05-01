package com.kelompok2.gomeseumsulsel;

public class Museum {
    private String nama;
    private String lokasi;
    private int gambar;
    private String deskripsi;

    public Museum(String nama, String lokasi, int gambar, String deskripsi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }
    public int getGambar() { return gambar; }
    public String getDeskripsi() { return deskripsi; }
}