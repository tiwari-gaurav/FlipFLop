package com.flipimage;

import android.support.design.widget.Snackbar;
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
import com.flipimage.response.PopularPhotoResponse;
import com.flipimage.response.Title;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<PopularPhotoResponse> photos;
    private ArrayList<String> picUrls;
    Owner owner;
    Description description;
    Comments comments;
    Title title;
    ArrayList<Photo> photo;
    GridViewAdapter imageAdapter;

    private ApiInterface apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        apiService = ApiClient.getClient().create(ApiInterface.class);
        final GridView gridView = (GridView) findViewById(R.id.country_grid);

        gridView.setNumColumns(2);
        gridView.setColumnWidth(GridView.AUTO_FIT);
        gridView.setVerticalSpacing(10);
        gridView.setHorizontalSpacing(15);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        fetchPhotos(gridView);


    }

    private void fetchPhotos(final GridView gridView) {
        utils.showProgressDialog(this);

        Call<JsonElement> call = apiService.getRecent("flickr.photos.getPopular", "93f6fb0a3e36f56d151e470e7c4df439", "52540720@N02", "", "", "10", "json", "1");
        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                utils.hideProgressDialog();
                Log.d("resonse", response.toString());
                JsonElement object = response.body();
                Type listType = new TypeToken<ArrayList<PopularPhotoResponse>>() {
                }.getType();
                photos = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photos").getAsJsonArray("photo"), listType);
                picUrls = new ArrayList<String>();
                itemFlip(gridView);
                gridView.setAdapter(new GridViewAdapter(getBaseContext(), getUrls(photos), owner, title,description));




            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.e("failure", t.toString());
                utils.hideProgressDialog();
            }
        });


    }

    private void itemFlip(final GridView gridView) {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, final View view, final int i, long l) {
                Call<JsonElement> call = apiService.getInfo("flickr.photos.getInfo", "93f6fb0a3e36f56d151e470e7c4df439", photos.get(i).getId(), "", "json", "1");
                call.enqueue(new Callback<JsonElement>() {
                    @Override
                    public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                        Log.d("resonse", response.toString());
                        JsonElement object = response.body();


                        owner = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photo").getAsJsonObject("owner"), Owner.class);
                        description = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photo").getAsJsonObject("description"), Description.class);
                        title = new Gson().fromJson(object.getAsJsonObject().getAsJsonObject("photo").getAsJsonObject("title"), Title.class);
                        Log.e("owner", owner.toString());
                        Snackbar snackbar = Snackbar
                                .make(view, "Title:"+title.getContent()+"\n"+"Owner:"+owner.getRealname()+"\n"+"Description:"+description.describeContents(), Snackbar.LENGTH_LONG);

                        snackbar.show();


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
