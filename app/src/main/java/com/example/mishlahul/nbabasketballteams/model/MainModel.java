package com.example.mishlahul.nbabasketballteams.model;

public class MainModel {
    private String nama, kota, deskTim;
    private int gambarTim;

    public MainModel(String nama, String kota, String deskTim, int gambarTim){
        this.nama = nama;
        this.kota = kota;
        this.deskTim = deskTim;
        this.gambarTim = gambarTim;
    }

    public String getNamaTim(){ return nama;}
    public void setNamaTim(String nama){this.nama = nama;}
    public String getKotaTim(){ return kota;}
    public void setKotaTim(String kota){this.kota = kota;}
    public String getDeskTim(){ return deskTim;}
    public void setDeskTim(String deskTim){this.deskTim = deskTim;}
    public int getFotoTim(){return gambarTim;}
    public void setFotoTim(int gambarTim){this.gambarTim = gambarTim;}
}
