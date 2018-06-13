
package com.flipimage.response;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tags implements Parcelable
{

    @SerializedName("tag")
    @Expose
    private List<Object> tag = null;
    public final static Creator<Tags> CREATOR = new Creator<Tags>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Tags createFromParcel(Parcel in) {
            return new Tags(in);
        }

        public Tags[] newArray(int size) {
            return (new Tags[size]);
        }

    }
    ;

    protected Tags(Parcel in) {
        in.readList(this.tag, (Object.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tags() {
    }

    /**
     * 
     * @param tag
     */
    public Tags(List<Object> tag) {
        super();
        this.tag = tag;
    }

    public List<Object> getTag() {
        return tag;
    }

    public void setTag(List<Object> tag) {
        this.tag = tag;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(tag);
    }

    public int describeContents() {
        return  0;
    }

}
