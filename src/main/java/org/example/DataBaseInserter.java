package org.example;

import org.example.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("inserter")
public class DataBaseInserter extends DBRequests{

    DataBaseInserter(){
        System.out.println("Inserter init");
    }


    String CreateInsertUserString(User user){
        String sql = "INSERT INTO users (\"user\", \"password\", \"age\", \"email\", \"gender\", \"usertype\") VALUES ('%s', '%s', %d, '%s', '%s', '%s')";
        return String.format(sql,
                user.getUser(),
                user.getPassword(),
                user.getAge(),
                user.getEmail(),
                user.getGender(),
                user.getUserType());
    }
    public void insertUser(User user) {
        String sql = CreateInsertUserString(user);
        insertRequest(sql);
    };
}
