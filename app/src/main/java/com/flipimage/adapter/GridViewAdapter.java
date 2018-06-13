package com.flipimage.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.flipimage.R;
import com.flipimage.response.Description;
import com.flipimage.response.Owner;
import com.flipimage.response.Title;
import com.google.gson.JsonElement;

import java.util.ArrayList;

import retrofit2.Callback;

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<String>photos;
    Owner owner;
    Title title;
    Description description;




    public GridViewAdapter(Context context, ArrayList<String> photos, Owner owner, Title title, Description description){
        mContext = context;
        this.photos = photos;
        this.owner = owner;
        this.title = title;
        this.description = description;

    }



    @Override
    public int getCount() {
        return photos.size();
    }

    @Override
    public Object getItem(int i) {
        return photos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            view = inflater.inflate(R.layout.custom_grid_item, null);


        }
        TextView textView = (TextView) view.findViewById(R.id.info);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(mContext).load(photos.get(i)).into(imageView);
       /* if(owner!=null && title!=null && description!=null) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(title.getContent() + "\n" + owner.getRealname() + "\n" + description.getContent());
        }*/


        return view;
    }


}
