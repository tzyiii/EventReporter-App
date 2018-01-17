package com.laioffer.eventreporter;

/**
 * Created by zhengyitian on 2018/1/3.
 */


public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;
    private int like;
    private String id;
    private long time;
    private String username;
    private String imgUri;
    private int CommentNumber;
    private double latitude;
    private double longitude;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() { return this.title; }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() { return this.address; }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() { return this.description; }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public int getCommentNumber() {
        return CommentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        CommentNumber = commentNumber;
    }

    public Event() {}

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}

