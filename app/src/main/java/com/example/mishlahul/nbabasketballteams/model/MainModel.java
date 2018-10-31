package com.example.mishlahul.nbabasketballteams.model;

public class MainModel {
    private String namaTim, kotaTim, deskTim;
    private int fotoTim;

    public MainModel(String namaTim, String kotaTim, String deskTim, int celtics){
        this.namaTim = namaTim;
        this.kotaTim = kotaTim;
        this.deskTim = deskTim;
    }

    public String getNamaTim(){ return namaTim;}
    public void setNamaTim(String namaTim){this.namaTim = namaTim;}
    public String getKotaTim(){ return kotaTim;}
    public void setKotaTim(String kotaTim){this.kotaTim = kotaTim;}
    public String getDeskTim(){ return deskTim;}
    public void setDeskTim(String deskTim){this.deskTim = deskTim;}
    public int getFotoTim(){return fotoTim;}
    public void setFotoTim(int fotoTim){this.fotoTim = fotoTim;}
}
