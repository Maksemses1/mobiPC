package org.example;

public class DataBaseUtils {
    DBrequests dbrequests = new DBrequests();
    private int getIntFromDatabase(String sql){
        return dbrequests.getIntFromRequest(sql);
    }
    private String getStringFromDatabase(String sql){
        return dbrequests.getStringFromRequest(sql);
    }
    int getAdminId(String User) {
        String sql = "Select Admin_id from users where User=\"" + User + "\" ";
        int userId = getIntFromDatabase(sql);
        return userId;
    }
    public String getUserName(int id) {
        String sql = "Select User from users where id=" + id + " ";
        String UserName = getStringFromDatabase(sql);
        return UserName;
    }
    String getPassword(String User) {
        String sql = "Select Password from users where User=\"" + User + "\" ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public String getPassword(int id) {
        String sql = "Select Password from users where id=" + id + " ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public int getAge(int id) {
        String sql = "Select Age from users where id=" + id + " ";
        int age = getIntFromDatabase(sql);
        return age;
    }
    public String getGender(int id) {
        String sql = "Select Gender from users where id=" + id + " ";
        String gender = getStringFromDatabase(sql);
        return gender;
    }
    public String getEmail(int id) {
        String sql = "Select Email from users where id=" + id + " ";
        String email = getStringFromDatabase(sql);
        return email;
    }
    String getUserType(int id) {
        String sql = "Select UserType from users where id=" + id + " ";
        String userType = getStringFromDatabase(sql);
        return userType;
    }
}
