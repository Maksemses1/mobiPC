package org.example.Users;

import org.example.DataBaseGetters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
public abstract class User {
    private int id;

    @Autowired
    private DataBaseGetters getter;
    private String user = null;
    private int age = -1;
    private String gender = null;
    private String email = null;
    private String password = "";
    private String userType = null;


    public User(){
    }
    public User(String user, int age, String gender, String email, String password, String userType){
        this.user = user;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }


    public void init(){
        this.user = getter.getUserName(this.id);
        this.age = getter.getAge(this.id);
        this.gender = getter.getGender(this.id);
        this.email = getter.getEmail(this.id);
        this.password = getter.getPassword(this.id);
    }

    public void setId(int id){
        this.id = id;
    }
    public String getUser(){
        return user;
    }

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getId(){
        return id;
    }
    public String getUserType() {
        return userType;
    }

}
