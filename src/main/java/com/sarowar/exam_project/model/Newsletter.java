package com.sarowar.exam_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "newsletter")
public class Newsletter {

    @Id
    private String id;
    private String email;
    private String subscriptionDate;

    // Constructor
    public Newsletter() {}

    // Parameterized Constructor
    public Newsletter(String email, String subscriptionDate) {
        this.email = email;
        this.subscriptionDate = subscriptionDate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
