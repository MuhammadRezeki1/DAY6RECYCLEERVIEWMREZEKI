package com.example.recyclerezeki;
public class logoCar {
    private String namaLogo;
    private int logo;

    private int harga;
    private int deskripsi;

    private String tipe;

    private int nama;





    public logoCar(String ferrari, int fr, int dFerrari, int hargaFerrari) {
    }

    public int getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getDeskripsi() {
        return deskripsi;
    }


    public String getNamaLogo() {
        return namaLogo;
    }

    public int getLogo() {
        return logo;
    }

    public String  getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public logoCar(String namaLogo, int logo, int nama , int harga, int deskripsi , String tipe) {
        this.namaLogo = namaLogo;
        this.nama = nama;
        this.harga = harga;
        this.logo = logo;
        this.deskripsi = deskripsi;
        this.tipe = tipe;
    }

}


