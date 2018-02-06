package com.pramudana.sam.foodapps;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BandungFoodActivity extends AppCompatActivity {

    ListView FoodBandung;
    String[] dataNameBandung = {

            "Cilok", "Cimol", "Kupat Tahu", "Lotek", "Mie Kocok", "Mochi Es krim", "Nasi Tutug", "Seblak"
            , "Surabi", "Tahu Jablay", "Ulukutek Leunca"
    };
    int[] dataIconBandung = {

            R.drawable.cilok, R.drawable.cimol, R.drawable.kupat_tahu, R.drawable.lotek, R.drawable.mie_kocok, R.drawable.mochi_eskrim
            , R.drawable.nasi_tutug, R.drawable.seblak, R.drawable.surabi, R.drawable.tahu_jablay, R.drawable.ulukutek_leunca
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandung_food);

        FoodBandung = (ListView)findViewById(R.id.FoodBandung);
        BandungAdapter bandungAdapter = new BandungAdapter(BandungFoodActivity.this, dataNameBandung, dataIconBandung);
        FoodBandung.setAdapter(bandungAdapter);
        FoodBandung.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent a1 = new Intent(BandungFoodActivity.this, DetailBandungActivity.class);
                a1.putExtra("Name", dataNameBandung[position]);
                a1.putExtra("Icon", dataIconBandung[position]);
                startActivity(a1);
            }
        });
    }
}
