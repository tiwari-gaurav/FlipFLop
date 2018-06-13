
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Title implements Parcelable
{

    @SerializedName("_content")
    @Expose
    private String content;
    public final static Creator<Title> CREATOR = new Creator<Title>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Title createFromParcel(Parcel in) {
            return new Title(in);
        }

        public Title[] newArray(int size) {
            return (new Title[size]);
        }

    }
    ;

    protected Title(Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Title() {
    }

    /**
     * 
     * @param content
     */
    public Title(String content) {
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
