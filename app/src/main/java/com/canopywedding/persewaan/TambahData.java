package com.canopywedding.persewaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.canopywedding.AppDatabase;
import com.canopywedding.persewaan.model.Informasi;

public class TambahData extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);
        EditText editData = (EditText) findViewById(R.id.editData);
        Button buttonSend = (Button) findViewById(R.id.buttonSimpan);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "canopy").build();

        data = editData.getText().toString();

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Informasi informasiData = new Informasi();

                informasiData.setId(1);
                informasiData.setJudul(data);

                db.informasiDao().insertAll(informasiData);
            }
        });


    }
}