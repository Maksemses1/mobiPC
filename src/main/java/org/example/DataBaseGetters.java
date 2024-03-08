package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("getter")
public class DataBaseGetters extends DBRequests{

    private int getIntFromDatabase(String sql){
        return getIntFromRequest(sql);
    }
    private String getStringFromDatabase(String sql){
        return getStringFromRequest(sql);
    }

    public DataBaseGetters(){
        System.out.println("getter init");
    }
    int getId(String User) {
        String sql = "SELECT id FROM users WHERE \"user\" = '" + User + "' ";
        int userId = getIntFromDatabase(sql);
        return userId;
    }
    public String getUserName(int id) {
        String sql = "SELECT user FROM users WHERE \"id\"=" + id + " ";
        String UserName = getStringFromDatabase(sql);
        return UserName;
    }
    String getPassword(String User) {
        String sql = "SELECT password FROM users WHERE \"user\"=" + User + " ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public String getPassword(int id) {
        String sql = "SELECT password FROM users WHERE \"id\"=" + id + " ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public int getAge(int id) {
        String sql = "SELECT age FROM users WHERE \"id\"=" + id + " ";
        int age = getIntFromDatabase(sql);
        return age;
    }
    public String getGender(int id) {
        String sql = "SELECT gender FROM users WHERE \"id\"=" + id + " ";
        String gender = getStringFromDatabase(sql);
        return gender;
    }
    public String getEmail(int id) {
        String sql = "SELECT email FROM users WHERE \"id\"=" + id + " ";
        String email = getStringFromDatabase(sql);
        return email;
    }
    String getUserType(int id) {
        String sql = "SELECT usertype FROM users WHERE \"id\"=" + id + " ";
        String UserType = getStringFromDatabase(sql);
        return UserType;
    }
}
