package com.flipimage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.flipimage.response.PopularPhotoResponse;
import com.google.gson.JsonElement;

import java.util.ArrayList;

import retrofit2.Callback;

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<String>photos;
    private static LayoutInflater inflater=null;

    public GridViewAdapter(Context context, ArrayList<String> photos){
        mContext = context;
        this.photos = photos;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        ImageView imageView = new ImageView(mContext);

            Glide.with(mContext).load(photos.get(i)).into(imageView);

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 400));



        return imageView;
    }
}
