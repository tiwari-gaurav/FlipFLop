
package com.flipimage.response;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls implements Parcelable
{

    @SerializedName("url")
    @Expose
    private List<Url> url = null;
    public final static Creator<Urls> CREATOR = new Creator<Urls>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Urls createFromParcel(Parcel in) {
            return new Urls(in);
        }

        public Urls[] newArray(int size) {
            return (new Urls[size]);
        }

    }
    ;

    protected Urls(Parcel in) {
        in.readList(this.url, (Url.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Urls() {
    }

    /**
     * 
     * @param url
     */
    public Urls(List<Url> url) {
        super();
        this.url = url;
    }

    public List<Url> getUrl() {
        return url;
    }

    public void setUrl(List<Url> url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(url);
    }

    public int describeContents() {
        return  0;
    }

}
