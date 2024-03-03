package org.example;

public class UserValidator extends DBRequests{
    DataBaseGetters getters = new DataBaseGetters();

    boolean isNameInDB(String name){
        int id = getters.getId(name);
        if(id!= 0){
            return true;
        }
        return false;
    }
    boolean isEmailInDB(String email){
        String sql = "SELECT COUNT(*) FROM users WHERE email = '"+email+"';";
        int CountEmail = getIntFromRequest(sql);
        if(CountEmail != 0){
            return true;
        }
        return false;
    }
}
