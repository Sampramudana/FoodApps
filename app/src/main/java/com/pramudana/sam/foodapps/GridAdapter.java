package com.pramudana.sam.foodapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sampramudana on 2/6/18.
 */

public class GridAdapter extends BaseAdapter {

    private int icons[];
    private String letters[];
    private Context context;
    private LayoutInflater inflater;

    public GridAdapter(Context context, int icons[], String letters[]){

        this.context=context;
        this.icons=icons;
        this.letters=letters;
    }
    public int getCount(){
        return letters.length;
    }
    public Object getItem(int position){
        return letters[position];
    }
    public long getItemId(int position){
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent){

        View gridView = convertView;

        if (convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.grid_layout,null);

        }
        ImageView icon = (ImageView)gridView.findViewById(R.id.imageview);
        TextView letter = gridView.findViewById(R.id.letters);

        icon.setImageResource(icons[position]);
        letter.setText(letters[position]);

        return gridView;
    }
}
