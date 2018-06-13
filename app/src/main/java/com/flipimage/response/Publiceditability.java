
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Publiceditability implements Parcelable
{

    @SerializedName("cancomment")
    @Expose
    private Integer cancomment;
    @SerializedName("canaddmeta")
    @Expose
    private Integer canaddmeta;
    public final static Creator<Publiceditability> CREATOR = new Creator<Publiceditability>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Publiceditability createFromParcel(Parcel in) {
            return new Publiceditability(in);
        }

        public Publiceditability[] newArray(int size) {
            return (new Publiceditability[size]);
        }

    }
    ;

    protected Publiceditability(Parcel in) {
        this.cancomment = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.canaddmeta = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Publiceditability() {
    }

    /**
     * 
     * @param canaddmeta
     * @param cancomment
     */
    public Publiceditability(Integer cancomment, Integer canaddmeta) {
        super();
        this.cancomment = cancomment;
        this.canaddmeta = canaddmeta;
    }

    public Integer getCancomment() {
        return cancomment;
    }

    public void setCancomment(Integer cancomment) {
        this.cancomment = cancomment;
    }

    public Integer getCanaddmeta() {
        return canaddmeta;
    }

    public void setCanaddmeta(Integer canaddmeta) {
        this.canaddmeta = canaddmeta;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(cancomment);
        dest.writeValue(canaddmeta);
    }

    public int describeContents() {
        return  0;
    }

}
