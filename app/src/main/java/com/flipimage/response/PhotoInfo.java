
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoInfo implements Parcelable
{

    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("stat")
    @Expose
    private String stat;
    public final static Creator<PhotoInfo> CREATOR = new Creator<PhotoInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PhotoInfo createFromParcel(Parcel in) {
            return new PhotoInfo(in);
        }

        public PhotoInfo[] newArray(int size) {
            return (new PhotoInfo[size]);
        }

    }
    ;

    protected PhotoInfo(Parcel in) {
        this.photo = ((Photo) in.readValue((Photo.class.getClassLoader())));
        this.stat = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhotoInfo() {
    }

    /**
     * 
     * @param photo
     * @param stat
     */
    public PhotoInfo(Photo photo, String stat) {
        super();
        this.photo = photo;
        this.stat = stat;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(photo);
        dest.writeValue(stat);
    }

    public int describeContents() {
        return  0;
    }

}
