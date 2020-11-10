package com.canopywedding;

import com.canopywedding.persewaan.dao.InformasiDao;
import com.canopywedding.persewaan.model.Informasi;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Informasi.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract InformasiDao informasiDao();
}