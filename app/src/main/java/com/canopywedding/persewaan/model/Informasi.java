package com.canopywedding.persewaan.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Informasi {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "gambar_url")
    private String gambarUrl;

    @ColumnInfo(name = "judul")
    private String judul;

    public void setId(int id) { this.id = id;}

    public int getId() {
        return this.id;
    }

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
