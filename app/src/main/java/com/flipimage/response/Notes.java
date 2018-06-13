
package com.flipimage.response;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notes implements Parcelable
{

    @SerializedName("note")
    @Expose
    private List<Object> note = null;
    public final static Creator<Notes> CREATOR = new Creator<Notes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Notes createFromParcel(Parcel in) {
            return new Notes(in);
        }

        public Notes[] newArray(int size) {
            return (new Notes[size]);
        }

    }
    ;

    protected Notes(Parcel in) {
        in.readList(this.note, (Object.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Notes() {
    }

    /**
     * 
     * @param note
     */
    public Notes(List<Object> note) {
        super();
        this.note = note;
    }

    public List<Object> getNote() {
        return note;
    }

    public void setNote(List<Object> note) {
        this.note = note;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(note);
    }

    public int describeContents() {
        return  0;
    }

}
