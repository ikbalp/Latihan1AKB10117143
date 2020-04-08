package com.example.cobaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hai extends AppCompatActivity {
    TextView txtHello;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);

        txtHello = (TextView) findViewById(R.id.txtHello);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtHello.setText("Beres! Sekarang, " + nama + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }

    public void pindah(View view) {
        Intent intent = new Intent(hai.this, MainActivity.class);
        startActivity(intent);
    }
}


