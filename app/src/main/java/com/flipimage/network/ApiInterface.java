package com.flipimage.network;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    String method = "flickr.photos.getPopular";
    static final String API_KEY = "93f6fb0a3e36f56d151e470e7c4df439";
    static final String EXTRA_SMALL_URL = "url_s";

    @GET("/services/rest/")
    Call<JsonElement> getRecent(@Query("method") String method,
                                @Query("api_key") String API_KEY,
                                @Query("user_id") String user_id,
                                @Query("sort") String sort,
                                @Query("extras") String extras,
                                @Query("per_page") String PER_PAGE,
                                @Query("format") String format,
                                @Query("nojsoncallback") String set
    );

    @GET("/services/rest/")
    Call<JsonElement> getInfo(
            @Query("method") String method,
            @Query("api_key") String API_KEY,
            @Query("photo_id") String photo_id,
            @Query("secret") String secret,
            @Query("format") String format,
            @Query("nojsoncallback") String set);
    //Call<JsonElement> getSources(@Query("category") String category, @Query("language") String language, @Query("country") String country);
}
