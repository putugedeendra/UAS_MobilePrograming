package com.example.endraapp;

public class Menu {

    private String nama;
    private String harga;
    private String gambar;
    private String deskripsi;


    public Menu(String datanama, String dataharga, String datagambar, String datadeskripsi){

        nama = datanama;
        harga = dataharga;
        deskripsi = datadeskripsi;
        gambar = datagambar;

    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }
}