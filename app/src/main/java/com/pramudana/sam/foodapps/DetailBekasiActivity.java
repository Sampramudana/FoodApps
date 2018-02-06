package com.pramudana.sam.foodapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBekasiActivity extends AppCompatActivity {

    ImageView imgBekasi;
    TextView hasilBekasi;
    String ahasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bekasi);

        Intent b2 = getIntent();
        ahasil = b2.getStringExtra("aName");

        imgBekasi = (ImageView)findViewById(R.id.imgBekasi);
        hasilBekasi = (TextView)findViewById(R.id.hasilBekasi);
        hasilBekasi.setText(ahasil);

        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null){

            imgBekasi.setImageResource(mBundle.getInt("aIcon"));
        }
    }
}
