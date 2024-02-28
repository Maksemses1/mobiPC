package org.example;

public class DataBaseUtils {
    DBrequests dbrequests = new DBrequests();
    private int getIntFromDatabase(String sql){
        return dbrequests.getIntFromRequest(sql);
    }
    private String getStringFromDatabase(String sql){
        return dbrequests.getStringFromRequest(sql);
    }
    int getAdminId(String AdminUser) {
        String sql = "Select Admin_id from users where User=\"" + AdminUser + "\" ";
        int userId = getIntFromDatabase(sql);
        return userId;
    }
    public String getUserName(int Admin_id) {
        String sql = "Select User from users where id=" + Admin_id + " ";
        String UserName = getStringFromDatabase(sql);
        return UserName;
    }
    String getPassword(String AdminUser) {
        String sql = "Select Password from users where User=\"" + AdminUser + "\" ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public String getPassword(int Admin_id) {
        String sql = "Select Password from users where id=" + Admin_id + " ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    public int getAge(int admin_id) {
        String sql = "Select Age from users where id=" + admin_id + " ";
        int age = getIntFromDatabase(sql);
        return age;
    }
    public String getGender(int admin_id) {
        String sql = "Select Gender from users where id=" + admin_id + " ";
        String gender = getStringFromDatabase(sql);
        return gender;
    }
    public String getEmail(int admin_id) {
        String sql = "Select Email from users where id=" + admin_id + " ";
        String email = getStringFromDatabase(sql);
        return email;
    }
}
