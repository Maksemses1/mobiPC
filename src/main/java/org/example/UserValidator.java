package org.example;

import org.example.JDBC_utils.DataBaseGetters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userValidator")
public class UserValidator extends DBRequests{
    @Autowired
    private DataBaseGetters getter;

    UserValidator(){
        System.out.println("UserValidator init");
    }

    boolean isNameInDB(String name){
        int id = getter.getId(name);
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
