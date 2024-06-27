package com.sarowar.exam_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "blogs")
public class Blog {
    @Id
    private String id;
    private String coverImage;
    private String title;
    private String desc;
    private Date date;

    // Constructors
    public Blog() {
        this.date = new Date();
    }

    public Blog(String coverImage, String title, String desc) {
        this.coverImage = coverImage;
        this.title = title;
        this.desc = desc;
        this.date = new Date();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}