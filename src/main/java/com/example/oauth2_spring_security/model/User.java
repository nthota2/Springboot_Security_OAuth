package com.example.oauth2_spring_security.model;
import lombok.Data;

@Data
public class User {
    private String name;
    private String email;

    //Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
