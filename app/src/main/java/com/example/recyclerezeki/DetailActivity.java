package com.example.recyclerezeki;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
    TextView detailNama, deskripsi, detailHarga,nama, detailTipe;
    ImageView detailImg;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailNama = findViewById(R.id.detailNama);
        detailHarga = findViewById(R.id.detailHarga);
        deskripsi = findViewById(R.id.deskripsi);
        detailImg = findViewById(R.id.logo_image);
        detailTipe = findViewById(R.id.tipe);
        nama = findViewById(R.id.detail_text);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            detailNama.setText(bundle.getString("Title"));
            nama.setText(getString(bundle.getInt("nama"))); // Menggunakan getString()
            deskripsi.setText(getString(bundle.getInt("deskripsi"))); // Menggunakan getString()
            detailHarga.setText(getString(bundle.getInt("harga"))); // Menggunakan getString()
            detailTipe.setText(bundle.getString("tipe"));

            detailImg.setImageResource(bundle.getInt("Image"));
        }

    }

}
