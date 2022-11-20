package com.example.autotranslatorapp.models;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String image;
    public String email;
    public String token;
    public String id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
