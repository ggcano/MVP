package com.example.mvp.iu.Model;

import java.net.URL;

public class UserModel {

    private String fullName = "";
    private String email = "";


    public UserModel() {

    }

    public UserModel(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + fullName;
    }

    public String getLoquesea () {return "https://ui-avatars.com/api/?rounded=true&name=" + fullName;}
}
