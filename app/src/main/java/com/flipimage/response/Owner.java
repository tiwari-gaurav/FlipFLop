
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner implements Parcelable
{

    @SerializedName("nsid")
    @Expose
    private String nsid;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("realname")
    @Expose
    private String realname;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("iconserver")
    @Expose
    private String iconserver;
    @SerializedName("iconfarm")
    @Expose
    private Integer iconfarm;
    @SerializedName("path_alias")
    @Expose
    private String pathAlias;
    public final static Creator<Owner> CREATOR = new Creator<Owner>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Owner createFromParcel(Parcel in) {
            return new Owner(in);
        }

        public Owner[] newArray(int size) {
            return (new Owner[size]);
        }

    }
    ;

    protected Owner(Parcel in) {
        this.nsid = ((String) in.readValue((String.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.realname = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.iconserver = ((String) in.readValue((String.class.getClassLoader())));
        this.iconfarm = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pathAlias = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owner() {
    }

    /**
     * 
     * @param pathAlias
     * @param username
     * @param location
     * @param iconserver
     * @param realname
     * @param nsid
     * @param iconfarm
     */
    public Owner(String nsid, String username, String realname, String location, String iconserver, Integer iconfarm, String pathAlias) {
        super();
        this.nsid = nsid;
        this.username = username;
        this.realname = realname;
        this.location = location;
        this.iconserver = iconserver;
        this.iconfarm = iconfarm;
        this.pathAlias = pathAlias;
    }

    public String getNsid() {
        return nsid;
    }

    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIconserver() {
        return iconserver;
    }

    public void setIconserver(String iconserver) {
        this.iconserver = iconserver;
    }

    public Integer getIconfarm() {
        return iconfarm;
    }

    public void setIconfarm(Integer iconfarm) {
        this.iconfarm = iconfarm;
    }

    public String getPathAlias() {
        return pathAlias;
    }

    public void setPathAlias(String pathAlias) {
        this.pathAlias = pathAlias;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(nsid);
        dest.writeValue(username);
        dest.writeValue(realname);
        dest.writeValue(location);
        dest.writeValue(iconserver);
        dest.writeValue(iconfarm);
        dest.writeValue(pathAlias);
    }

    public int describeContents() {
        return  0;
    }

}
