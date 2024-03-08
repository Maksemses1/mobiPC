package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userValidator")
public class UserValidator extends DBRequests{
    private final DataBaseGetters getter;

    @Autowired
    UserValidator(DataBaseGetters getter){
        this.getter = getter;
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
