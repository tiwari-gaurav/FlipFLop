package com.flipimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.flipimage.adapter.GridViewAdapter;
import com.flipimage.network.ApiClient;
import com.flipimage.network.ApiInterface;
import com.flipimage.response.Comments;
import com.flipimage.response.Description;
import com.flipimage.response.Owner;
import com.flipimage.response.Photo;
import com.flipimage.response.PhotoInfo;
import com.flipimage.response.PopularPhotoResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<PopularPhotoResponse> photos;
    private ArrayList<String> picUrls;
    Owner owner;
    ArrayList<Photo> photo;

    private ApiInterface apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        apiService = ApiClient.getClient().create(ApiInterface.class);
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setNumColumns(2);
        gridView.setColumnWidth(GridView.AUTO_FIT);
        gridView.setVerticalSpacing(10);
        gridView.setHorizontalSpacing(15);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);

        // Instance of ImageAdapter Class

        fetchPhotos(gridView);

    }

    private void fetchPhotos(final GridView gridView) {

        Call<JsonElement> call = apiService.getRecent("flickr.photos.getPopular", "93f6fb0a3e36f56d151e470e7c4df439", "52540720@N02", "", "", "10", "json", "1");
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                Log.d("resonse", response.toString());
                JsonElement object = response.body();
                Type listType = new TypeToken<ArrayList<PopularPhotoResponse>>() {
                }.getType();
                photos = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photos").getAsJsonArray("photo"), listType);
                //Log.e("photos", photos.toString());
                picUrls = new ArrayList<String>();

                gridView.setAdapter(new GridViewAdapter(getBaseContext(), getUrls(photos)));

                itemFlip(gridView);

            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.e("failure", t.toString());
            }
        });


    }

    private void itemFlip(GridView gridView) {

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Call<JsonElement> call = apiService.getInfo("flickr.photos.getInfo", "93f6fb0a3e36f56d151e470e7c4df439",  photos.get(i).getId(),"","json","1");
                call.enqueue(new Callback<JsonElement>() {
                    @Override
                    public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                        Log.d("resonse", response.toString());
                        JsonElement object = response.body();

                        //photo = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photo"), listType);
                        owner = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photo").getAsJsonObject("owner"),Owner.class);

                        Log.e("owner", owner.toString());
                    }

                    @Override
                    public void onFailure(Call<JsonElement> call, Throwable t) {
                        Log.e("failure", t.toString());
                    }
                });
            }
        });
    }

    private ArrayList<String> getUrls(ArrayList<PopularPhotoResponse> photos) {
        for (int i = 0; i < photos.size(); i++) {
            String picURL = String.format("http://farm%s.static.flickr.com/%s/%s_%s_b.jpg", photos.get(i).getFarm(), photos.get(i).getServer(), photos.get(i).getId(), photos.get(i).getSecret());
            System.out.println(picURL);

            picUrls.add(picURL);
        }
        return picUrls;
    }
}
