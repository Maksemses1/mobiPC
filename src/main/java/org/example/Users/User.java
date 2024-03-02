package org.example.Users;

import org.example.DataBaseGetters;

public abstract class User {
    private int id;
    private String user = null;
    private int age = -1;
    private String gender = null;
    private String email = null;
    private String password = "";
    private String userType = null;
    public User(int idUser){
        this.id = idUser;
        init();
    }
    public User(String user, int age, String gender, String email, String password, String userType){
        this.user = user;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    void init(){
        DataBaseGetters utils = new DataBaseGetters();
        this.user = utils.getUserName(this.id);
        this.age = utils.getAge(this.id);
        this.gender = utils.getGender(this.id);
        this.email = utils.getEmail(this.id);
        this.password = utils.getPassword(this.id);
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
