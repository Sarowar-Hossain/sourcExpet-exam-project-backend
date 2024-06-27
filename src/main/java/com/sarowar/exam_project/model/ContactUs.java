package com.sarowar.exam_project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contactUs")
public class ContactUs {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String organization;
    private String product;
    private String quantity;
    private String destination;
    private String message;

    // Constructor
    public ContactUs() {
    }

    // Parameterized Constructor
    public ContactUs(String name, String email, String phone, String organization, String product, String quantity, String destination, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.organization = organization;
        this.product = product;
        this.quantity = quantity;
        this.destination = destination;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}