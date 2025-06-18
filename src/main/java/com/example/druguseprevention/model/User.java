package com.example.druguseprevention.model;

import java.util.Date;

public class User {
    private Long id;
    private String name;
    private String email;
    private String role;
    private Date registrationDate;

    public User() {
    }

    public User(Long id, String name, String email, String role, Date registrationDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.registrationDate = registrationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}