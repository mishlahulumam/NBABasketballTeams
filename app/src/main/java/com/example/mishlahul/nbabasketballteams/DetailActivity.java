package com.example.mishlahul.nbabasketballteams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.fotoTim)
    ImageView foto_tim;
    @BindView(R.id.namaTim)
    TextView nama_tim;
    @BindView(R.id.kotaTim)
    TextView kota_tim;
    @BindView(R.id.deskTim)
    TextView desk_tim;
    String nama = "", kota = "", deskripsi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);
        nama = getIntent().getStringExtra("nama");
        kota = getIntent().getStringExtra("kota");
        deskripsi = getIntent().getStringExtra("deskripsi");
        foto_tim.setImageResource(getIntent().getIntExtra("foto", 0));

        nama_tim.setText(nama);
        kota_tim.setText(kota);
        desk_tim.setText(deskripsi);
    }
}
