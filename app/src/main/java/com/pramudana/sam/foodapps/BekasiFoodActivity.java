package com.pramudana.sam.foodapps;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BekasiFoodActivity extends AppCompatActivity {

    ListView FoodBekasi;
    String[] dataNameBekasi = {

            "Bandeng Rorod", "Bir Pletok", "Kue Akar Kelapa", "Kue Kembang Goyang", "Kue Rangi", "Kue Telur Gabus", "Red Suki"
            , "Roti Cane", "Sayur Gabus"
    };
    int[] dataIconBekasi = {

            R.drawable.bandeng_rorod, R.drawable.bir_pletok, R.drawable.kue_akar_kelapa, R.drawable.kue_kembanggoyang
            , R.drawable.kue_rangi, R.drawable.kue_telur_gabus, R.drawable.red_suki, R.drawable.roti_cane, R.drawable.sayur_gabus
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bekasi_food);

        FoodBekasi = (ListView)findViewById(R.id.FoodBekasi);
        BekasiAdapter bekasiAdapter = new BekasiAdapter(BekasiFoodActivity.this, dataNameBekasi, dataIconBekasi);
        FoodBekasi.setAdapter(bekasiAdapter);
        FoodBekasi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent a2 = new Intent(BekasiFoodActivity.this, DetailBekasiActivity.class);
                a2.putExtra("aName", dataNameBekasi[i]);
                a2.putExtra("aIcon", dataIconBekasi[i]);
                startActivity(a2);
            }
        });
    }
}
