package com.example.mobilealbum;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {
    Context context;

    public AlbumArrayAdapter(Context context, ArrayList<AlbumItem> items) {
        super(context, 0, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;

        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        AlbumItem item = (AlbumItem)getItem(position);

        TextView tv_name1 = (TextView)itemlayout.findViewById(R.id.itemtv1);
        tv_name1.setText(item.name1);
        TextView tv_score1 = (TextView)itemlayout.findViewById(R.id.itemtv2);
        tv_score1.setText(item.score1);
        ImageView iv = (ImageView)itemlayout.findViewById(R.id.itemiv1);
        iv.setImageResource(item.imgid1);

        TextView tv_name2 = (TextView)itemlayout.findViewById(R.id.itemtv3);
        tv_name2.setText(item.name2);
        TextView tv_score2 = (TextView)itemlayout.findViewById(R.id.itemtv4);
        tv_score2.setText(item.score2);
        ImageView iv2 = (ImageView)itemlayout.findViewById(R.id.itemiv2);
        iv2.setImageResource(item.imgid2);

        return itemlayout;
    }
}
