
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usage implements Parcelable
{

    @SerializedName("candownload")
    @Expose
    private Integer candownload;
    @SerializedName("canblog")
    @Expose
    private Integer canblog;
    @SerializedName("canprint")
    @Expose
    private Integer canprint;
    @SerializedName("canshare")
    @Expose
    private Integer canshare;
    public final static Creator<Usage> CREATOR = new Creator<Usage>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Usage createFromParcel(Parcel in) {
            return new Usage(in);
        }

        public Usage[] newArray(int size) {
            return (new Usage[size]);
        }

    }
    ;

    protected Usage(Parcel in) {
        this.candownload = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.canblog = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.canprint = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.canshare = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usage() {
    }

    /**
     * 
     * @param candownload
     * @param canblog
     * @param canprint
     * @param canshare
     */
    public Usage(Integer candownload, Integer canblog, Integer canprint, Integer canshare) {
        super();
        this.candownload = candownload;
        this.canblog = canblog;
        this.canprint = canprint;
        this.canshare = canshare;
    }

    public Integer getCandownload() {
        return candownload;
    }

    public void setCandownload(Integer candownload) {
        this.candownload = candownload;
    }

    public Integer getCanblog() {
        return canblog;
    }

    public void setCanblog(Integer canblog) {
        this.canblog = canblog;
    }

    public Integer getCanprint() {
        return canprint;
    }

    public void setCanprint(Integer canprint) {
        this.canprint = canprint;
    }

    public Integer getCanshare() {
        return canshare;
    }

    public void setCanshare(Integer canshare) {
        this.canshare = canshare;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(candownload);
        dest.writeValue(canblog);
        dest.writeValue(canprint);
        dest.writeValue(canshare);
    }

    public int describeContents() {
        return  0;
    }

}
