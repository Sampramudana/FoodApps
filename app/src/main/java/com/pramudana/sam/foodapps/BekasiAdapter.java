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

public class BekasiAdapter extends ArrayAdapter<String> {

    String[] aNames;
    int[] aIcon;
    Context aContext;

    public BekasiAdapter(@NonNull Context context, String[] dataName, int[] dataIcon) {
        super(context, R.layout.bekasi_layout);

        this.aNames = dataName;
        this.aIcon = dataIcon;
        this.aContext = context;

    }

    public int getCount() {
        return aNames.length;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        BekasiAdapter.ViewHolder mViewHolder = new BekasiAdapter.ViewHolder();

        if (convertView == null) {

            LayoutInflater mInflater = (LayoutInflater) aContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.bekasi_layout, parent, false);
            mViewHolder.mIcon = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(mViewHolder);
        } else {

            mViewHolder = (BekasiAdapter.ViewHolder) convertView.getTag();
        }
        mViewHolder.mIcon.setImageResource(aIcon[position]);
        mViewHolder.mName.setText(aNames[position]);

        return convertView;
    }

    static class ViewHolder {

        ImageView mIcon;
        TextView mName;
    }
}
