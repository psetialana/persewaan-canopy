package com.canopywedding.persewaan.model;

public class Informasi {

    private String gambarUrl;
    private String judul;

    public void setGambarUrl(String url) {
        this.gambarUrl = url;
    }

    public String getGambarUrl() {
        return this.gambarUrl;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return this.judul;
    }

}
