
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Visibility implements Parcelable
{

    @SerializedName("ispublic")
    @Expose
    private Integer ispublic;
    @SerializedName("isfriend")
    @Expose
    private Integer isfriend;
    @SerializedName("isfamily")
    @Expose
    private Integer isfamily;
    public final static Creator<Visibility> CREATOR = new Creator<Visibility>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Visibility createFromParcel(Parcel in) {
            return new Visibility(in);
        }

        public Visibility[] newArray(int size) {
            return (new Visibility[size]);
        }

    }
    ;

    protected Visibility(Parcel in) {
        this.ispublic = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isfriend = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isfamily = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Visibility() {
    }

    /**
     * 
     * @param isfamily
     * @param ispublic
     * @param isfriend
     */
    public Visibility(Integer ispublic, Integer isfriend, Integer isfamily) {
        super();
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    public Integer getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ispublic);
        dest.writeValue(isfriend);
        dest.writeValue(isfamily);
    }

    public int describeContents() {
        return  0;
    }

}
