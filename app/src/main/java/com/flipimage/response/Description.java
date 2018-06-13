
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description implements Parcelable
{

    @SerializedName("_content")
    @Expose
    private String content;
    public final static Creator<Description> CREATOR = new Creator<Description>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Description createFromParcel(Parcel in) {
            return new Description(in);
        }

        public Description[] newArray(int size) {
            return (new Description[size]);
        }

    }
    ;

    protected Description(Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param content
     */
    public Description(String content) {
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
