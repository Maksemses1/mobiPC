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
        String sql = "Select Admin_id from administrators where User=\"" + AdminUser + "\" ";
        int userId = getIntFromDatabase(sql);
        return userId;
    }
    String getUserName(int Admin_id) {
        String sql = "Select User from administrators where Admin_id=" + Admin_id + " ";
        String UserName = getStringFromDatabase(sql);
        return UserName;
    }
    String getPassword(String AdminUser) {
        String sql = "Select Password from administrators where User=\"" + AdminUser + "\" ";
        String password = getStringFromDatabase(sql);
        return password;
    }
    String getPassword(int Admin_id) {
        String sql = "Select Password from administrators where Admin_id=" + Admin_id + " ";
        String password = getStringFromDatabase(sql);
        return password;
    }
}
