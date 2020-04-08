package com.example.cobaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}


/*
4 April 2020
Membuat project awal dengan membuat MainActivity dan activity_main.
Membuat kelas SecondActivity dan biodata, layout activity_second dan activity_biodata.
Mengaktifkan button mulai di activity_main agar pindah ke activity_second.

6 April 2020
Memperbaiki kelas SecondActivity dan biodata, layout activity_second dan activity_biodata.
Membuat kelas hai beserta layout activity_hai.

7 April 2020
Memperbaiki input di edittext kode keluarga agar huruf kapital semua.
Membuat hasil input nama dari activity_second dengan kalimat lainnya agar tampil di activity_hai.

Ikbal Padilah
10117143- IF4
*/
