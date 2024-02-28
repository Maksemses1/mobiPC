package org.example.Users;

public class User {
    private String login = null;
    private int age = -1;
    private String gender = null;
    private String email = null;
    private String password = "";
    public User(String login, int age, String gender, String email, String password){
        this.login = login;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
    public String getLogin(){
        return login;
    };
    public void setName(String name){
        this.login = name;
    };
    public int getAge(){
        return age;
    };
    public void setAge(int age){
        this.age = age;
    };
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    };
    public String getEmail(){
        return email;
    };
    public void setEmail(String email){
        this.email = email;
    };
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    };
}
