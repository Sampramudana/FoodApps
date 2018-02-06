package com.pramudana.sam.foodapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity {

    GridView gridCity;

    String foodList[] = {

            "Bandung", "Bekasi", "Palembang"
    };
    int iconList[] = {

            R.drawable.bandung, R.drawable.bekasi, R.drawable.palembang
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        gridCity = (GridView)findViewById(R.id.gridCity);

        GridAdapter adapter = new GridAdapter(CityActivity.this, iconList, foodList);

        gridCity.setAdapter(adapter);
        gridCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent n0 = new Intent(getApplicationContext(), BandungFoodActivity.class);
                    startActivity(n0);
                }else if (position == 1) {
                    Intent n1 = new Intent(getApplicationContext(), BekasiFoodActivity.class);
                    startActivity(n1);
                }
            }
        });
    }
}


