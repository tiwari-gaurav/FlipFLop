
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class People implements Parcelable
{

    @SerializedName("haspeople")
    @Expose
    private Integer haspeople;
    public final static Creator<People> CREATOR = new Creator<People>() {


        @SuppressWarnings({
            "unchecked"
        })
        public People createFromParcel(Parcel in) {
            return new People(in);
        }

        public People[] newArray(int size) {
            return (new People[size]);
        }

    }
    ;

    protected People(Parcel in) {
        this.haspeople = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public People() {
    }

    /**
     * 
     * @param haspeople
     */
    public People(Integer haspeople) {
        super();
        this.haspeople = haspeople;
    }

    public Integer getHaspeople() {
        return haspeople;
    }

    public void setHaspeople(Integer haspeople) {
        this.haspeople = haspeople;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(haspeople);
    }

    public int describeContents() {
        return  0;
    }

}
