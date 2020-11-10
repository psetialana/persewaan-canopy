package com.canopywedding.persewaan.dao;

import com.canopywedding.persewaan.model.Informasi;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface InformasiDao {
    @Query("SELECT * FROM informasi")
    List<Informasi> getAll();

    @Insert
    void insertAll(Informasi... informasi);
}
