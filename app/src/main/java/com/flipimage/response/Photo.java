
package com.flipimage.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private Integer farm;
    @SerializedName("dateuploaded")
    @Expose
    private String dateuploaded;
    @SerializedName("isfavorite")
    @Expose
    private Integer isfavorite;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("safety_level")
    @Expose
    private String safetyLevel;
    @SerializedName("rotation")
    @Expose
    private Integer rotation;
    @SerializedName("originalsecret")
    @Expose
    private String originalsecret;
    @SerializedName("originalformat")
    @Expose
    private String originalformat;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("editability")
    @Expose
    private Editability editability;
    @SerializedName("publiceditability")
    @Expose
    private Publiceditability publiceditability;
    @SerializedName("usage")
    @Expose
    private Usage usage;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("people")
    @Expose
    private People people;
    @SerializedName("tags")
    @Expose
    private Tags tags;
    @SerializedName("urls")
    @Expose
    private Urls urls;
    @SerializedName("media")
    @Expose
    private String media;
    public final static Creator<Photo> CREATOR = new Creator<Photo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        public Photo[] newArray(int size) {
            return (new Photo[size]);
        }

    }
    ;

    protected Photo(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.secret = ((String) in.readValue((String.class.getClassLoader())));
        this.server = ((String) in.readValue((String.class.getClassLoader())));
        this.farm = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dateuploaded = ((String) in.readValue((String.class.getClassLoader())));
        this.isfavorite = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.license = ((String) in.readValue((String.class.getClassLoader())));
        this.safetyLevel = ((String) in.readValue((String.class.getClassLoader())));
        this.rotation = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.originalsecret = ((String) in.readValue((String.class.getClassLoader())));
        this.originalformat = ((String) in.readValue((String.class.getClassLoader())));
        this.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
        this.title = ((Title) in.readValue((Title.class.getClassLoader())));
        this.description = ((Description) in.readValue((Description.class.getClassLoader())));
        this.visibility = ((Visibility) in.readValue((Visibility.class.getClassLoader())));
        this.dates = ((Dates) in.readValue((Dates.class.getClassLoader())));
        this.views = ((String) in.readValue((String.class.getClassLoader())));
        this.editability = ((Editability) in.readValue((Editability.class.getClassLoader())));
        this.publiceditability = ((Publiceditability) in.readValue((Publiceditability.class.getClassLoader())));
        this.usage = ((Usage) in.readValue((Usage.class.getClassLoader())));
        this.comments = ((Comments) in.readValue((Comments.class.getClassLoader())));
        this.notes = ((Notes) in.readValue((Notes.class.getClassLoader())));
        this.people = ((People) in.readValue((People.class.getClassLoader())));
        this.tags = ((Tags) in.readValue((Tags.class.getClassLoader())));
        this.urls = ((Urls) in.readValue((Urls.class.getClassLoader())));
        this.media = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param tags
     * @param visibility
     * @param urls
     * @param editability
     * @param originalformat
     * @param people
     * @param dateuploaded
     * @param isfavorite
     * @param publiceditability
     * @param id
     * @param farm
     * @param title
     * @param originalsecret
     * @param dates
     * @param views
     * @param description
     * @param rotation
     * @param owner
     * @param usage
     * @param secret
     * @param server
     * @param safetyLevel
     * @param notes
     * @param license
     * @param media
     * @param comments
     */
    public Photo(String id, String secret, String server, Integer farm, String dateuploaded, Integer isfavorite, String license, String safetyLevel, Integer rotation, String originalsecret, String originalformat, Owner owner, Title title, Description description, Visibility visibility, Dates dates, String views, Editability editability, Publiceditability publiceditability, Usage usage, Comments comments, Notes notes, People people, Tags tags, Urls urls, String media) {
        super();
        this.id = id;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.dateuploaded = dateuploaded;
        this.isfavorite = isfavorite;
        this.license = license;
        this.safetyLevel = safetyLevel;
        this.rotation = rotation;
        this.originalsecret = originalsecret;
        this.originalformat = originalformat;
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.visibility = visibility;
        this.dates = dates;
        this.views = views;
        this.editability = editability;
        this.publiceditability = publiceditability;
        this.usage = usage;
        this.comments = comments;
        this.notes = notes;
        this.people = people;
        this.tags = tags;
        this.urls = urls;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getFarm() {
        return farm;
    }

    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    public String getDateuploaded() {
        return dateuploaded;
    }

    public void setDateuploaded(String dateuploaded) {
        this.dateuploaded = dateuploaded;
    }

    public Integer getIsfavorite() {
        return isfavorite;
    }

    public void setIsfavorite(Integer isfavorite) {
        this.isfavorite = isfavorite;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getOriginalsecret() {
        return originalsecret;
    }

    public void setOriginalsecret(String originalsecret) {
        this.originalsecret = originalsecret;
    }

    public String getOriginalformat() {
        return originalformat;
    }

    public void setOriginalformat(String originalformat) {
        this.originalformat = originalformat;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public Editability getEditability() {
        return editability;
    }

    public void setEditability(Editability editability) {
        this.editability = editability;
    }

    public Publiceditability getPubliceditability() {
        return publiceditability;
    }

    public void setPubliceditability(Publiceditability publiceditability) {
        this.publiceditability = publiceditability;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(secret);
        dest.writeValue(server);
        dest.writeValue(farm);
        dest.writeValue(dateuploaded);
        dest.writeValue(isfavorite);
        dest.writeValue(license);
        dest.writeValue(safetyLevel);
        dest.writeValue(rotation);
        dest.writeValue(originalsecret);
        dest.writeValue(originalformat);
        dest.writeValue(owner);
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(visibility);
        dest.writeValue(dates);
        dest.writeValue(views);
        dest.writeValue(editability);
        dest.writeValue(publiceditability);
        dest.writeValue(usage);
        dest.writeValue(comments);
        dest.writeValue(notes);
        dest.writeValue(people);
        dest.writeValue(tags);
        dest.writeValue(urls);
        dest.writeValue(media);
    }

    public int describeContents() {
        return  0;
    }

}
