package com.flipimage.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

public class PopularPhotoResponse implements Parcelable {

    public static final String TAG = PopularPhotoResponse.class.getSimpleName();
    public static final String PARCEL_PHOTO_KEY = TAG + " " + "PARCEL_KEY";

    //GSON fields
    @Expose
    private String id;
    @Expose private String owner;
    @Expose private String secret;
    @Expose private String server;
    @Expose private int farm;
    @Expose private String title;
    @Expose private int ispublic;
    @Expose private int isfriend;
    @Expose private int isfamily;
    @Expose private String url_s;

    private PopularPhotoResponse(String id, String owner, String secret, String server, int farm, String title, int ispublic, int isfriend, int isfamily, String url_s){
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.url_s = url_s;
    }

    public PopularPhotoResponse(JSONObject json) throws JSONException {
        title = json.getString("title");
        url_s = json.getString("url");
    }

    //helper methods:
    @Override
    public String toString(){return title;}
    public String getUrl(){return url_s;}
    public String getTitle(){return title;}
    public String getBigUrl(){
        return url_s.substring(0,((url_s.length()-1)-5))+"_c.jpg";
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(int isfriend) {
        this.isfriend = isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(int isfamily) {
        this.isfamily = isfamily;
    }

    /**
     * Parcelable methods
     * to save instance state on fragment start/stop
     */
    public static final Parcelable.Creator<PopularPhotoResponse> CREATOR = new Creator<PopularPhotoResponse>(){

        @Override
        public PopularPhotoResponse createFromParcel(Parcel parcel) {
            return new PopularPhotoResponse(parcel);
        }

        @Override
        public PopularPhotoResponse[] newArray(int i) {
            return new PopularPhotoResponse[i];
        }
    };

    private PopularPhotoResponse(Parcel in){
        this(
                in.readString(),
                in.readString(),
                in.readString(),
                in.readString(),
                in.readInt(),
                in.readString(),
                in.readInt(),
                in.readInt(),
                in.readInt(),
                in.readString()
        );
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int i) {
        out.writeString(id);
        out.writeString(owner);
        out.writeString(secret);
        out.writeString(server);
        out.writeInt(farm);
        out.writeString(title);
        out.writeInt(ispublic);
        out.writeInt(isfriend);
        out.writeInt(isfamily);
        out.writeString(url_s);
    }

    public PopularPhotoResponse getParcelable(Bundle savedInstanceState){
        return savedInstanceState.getParcelable(PARCEL_PHOTO_KEY);
    }

    public void putParcelable(Bundle savedInstanceState, PopularPhotoResponse photo){
        savedInstanceState.putParcelable(PARCEL_PHOTO_KEY, photo);
    }
}
