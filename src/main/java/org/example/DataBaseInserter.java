package org.example;

import org.example.Users.User;


public class DataBaseInserter extends DBRequests{
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
