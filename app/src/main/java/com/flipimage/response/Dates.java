
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dates implements Parcelable
{

    @SerializedName("posted")
    @Expose
    private String posted;
    @SerializedName("taken")
    @Expose
    private String taken;
    @SerializedName("takengranularity")
    @Expose
    private String takengranularity;
    @SerializedName("takenunknown")
    @Expose
    private Integer takenunknown;
    @SerializedName("lastupdate")
    @Expose
    private String lastupdate;
    public final static Creator<Dates> CREATOR = new Creator<Dates>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Dates createFromParcel(Parcel in) {
            return new Dates(in);
        }

        public Dates[] newArray(int size) {
            return (new Dates[size]);
        }

    }
    ;

    protected Dates(Parcel in) {
        this.posted = ((String) in.readValue((String.class.getClassLoader())));
        this.taken = ((String) in.readValue((String.class.getClassLoader())));
        this.takengranularity = ((String) in.readValue((String.class.getClassLoader())));
        this.takenunknown = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.lastupdate = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dates() {
    }

    /**
     * 
     * @param lastupdate
     * @param takenunknown
     * @param taken
     * @param takengranularity
     * @param posted
     */
    public Dates(String posted, String taken, String takengranularity, Integer takenunknown, String lastupdate) {
        super();
        this.posted = posted;
        this.taken = taken;
        this.takengranularity = takengranularity;
        this.takenunknown = takenunknown;
        this.lastupdate = lastupdate;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getTaken() {
        return taken;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }

    public String getTakengranularity() {
        return takengranularity;
    }

    public void setTakengranularity(String takengranularity) {
        this.takengranularity = takengranularity;
    }

    public Integer getTakenunknown() {
        return takenunknown;
    }

    public void setTakenunknown(Integer takenunknown) {
        this.takenunknown = takenunknown;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(posted);
        dest.writeValue(taken);
        dest.writeValue(takengranularity);
        dest.writeValue(takenunknown);
        dest.writeValue(lastupdate);
    }

    public int describeContents() {
        return  0;
    }

}
