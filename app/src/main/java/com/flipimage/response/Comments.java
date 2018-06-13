
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comments implements Parcelable
{

    @SerializedName("_content")
    @Expose
    private String content;
    public final static Creator<Comments> CREATOR = new Creator<Comments>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Comments createFromParcel(Parcel in) {
            return new Comments(in);
        }

        public Comments[] newArray(int size) {
            return (new Comments[size]);
        }

    }
    ;

    protected Comments(Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comments() {
    }

    /**
     * 
     * @param content
     */
    public Comments(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(content);
    }

    public int describeContents() {
        return  0;
    }

}
