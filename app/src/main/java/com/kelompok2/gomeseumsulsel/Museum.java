package com.kelompok2.gomeseumsulsel;

public class Museum {
    private String nama;
    private String lokasi;
    private String deskripsi;
    private String gambar; // Pastikan ini String untuk menampung URL dari Firebase

    // 1. Konstruktor Kosong (WAJIB untuk Firebase)
    public Museum() {
    }

    // 2. Konstruktor dengan Parameter
    public Museum(String nama, String lokasi, String deskripsi, String gambar) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public String getGambar() { return gambar; }
    public void setGambar(String gambar) { this.gambar = gambar; }
}
