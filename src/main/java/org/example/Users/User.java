package org.example.Users;

import org.example.DataBaseGetters;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataBaseGetters getter = context.getBean("getter", DataBaseGetters.class);
        this.user = getter.getUserName(this.id);
        this.age = getter.getAge(this.id);
        this.gender = getter.getGender(this.id);
        this.email = getter.getEmail(this.id);
        this.password = getter.getPassword(this.id);
        context.close();
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
