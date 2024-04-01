package com.example.tugasday6;

public class ListModel {
    private String namaItem;
    private int gmbItem;
    private String deskripsi;
    private double harga;

    public ListModel(String namaItem, int gmbItem, String deskripsi, double harga) {
        this.namaItem = namaItem;
        this.gmbItem = gmbItem;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getDeskripsii(){
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double Harga){
        this.harga = Harga;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public int getGmbItem() {
        return gmbItem;
    }

    public void setGmbItem(int gmbItem) {
        this.gmbItem = gmbItem;
    }
}
