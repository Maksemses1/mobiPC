package org.example.Users;

import org.example.DataBaseUtils;

public abstract class User extends Object {
    private int id;
    private String user = null;
    private int age = -1;
    private String gender = null;
    private String email = null;
    private String password = "";
    public User(int idUser){
        this.id = idUser;
        init();
    }
    void init(){
        DataBaseUtils utils = new DataBaseUtils();
        this.user = utils.getUserName(this.id);
        this.age = utils.getAge(this.id);
        this.gender = utils.getGender(this.id);
        this.email = utils.getEmail(this.id);
        this.password = utils.getPassword(this.id);
    }

    public String getUser(){
        return user;
    };
    public int getAge(){
        return age;
    };
    public String getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    };
    public String getPassword(){
        return password;
    }
    public int getId(){
        return id;
    }
}
