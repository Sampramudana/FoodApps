package com.pramudana.sam.foodapps;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sampramudana on 2/6/18.
 */

public class BandungAdapter extends ArrayAdapter<String> {

    String[] names;
    int[] icon;
    Context mContext;

    public BandungAdapter(@NonNull Context context, String[] dataName, int[] dataIcon) {
        super(context, R.layout.bandung_layout);

        this.names = dataName;
        this.icon = dataIcon;
        this.mContext = context;
    }
    public int getCount(){
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder mViewHolder = new ViewHolder();

        if (convertView == null) {

            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.bandung_layout, parent, false);
            mViewHolder.mIcon = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(mViewHolder);
        }else {

            mViewHolder = (ViewHolder)convertView.getTag();
        }
        mViewHolder.mIcon.setImageResource(icon[position]);
        mViewHolder.mName.setText(names[position]);

        return convertView;
    }
    static class ViewHolder {

        ImageView mIcon;
        TextView mName;
    }
}
