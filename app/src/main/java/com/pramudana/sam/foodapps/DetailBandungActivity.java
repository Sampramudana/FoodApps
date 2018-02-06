package com.pramudana.sam.foodapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBandungActivity extends AppCompatActivity {

    ImageView imgBandung;
    TextView hasilBandung;
    String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bandung);

        Intent b1 = getIntent();
        hasil = b1.getStringExtra("Name");

        imgBandung = (ImageView)findViewById(R.id.imgBandung);
        hasilBandung = (TextView)findViewById(R.id.hasilBandung);
        hasilBandung.setText(hasil);

        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null){

            imgBandung.setImageResource(mBundle.getInt("Icon"));
        }
    }
}
