package org.example;

import org.example.Users.*;

public class UserFactory {
    DataBaseGetters utils = new DataBaseGetters();
    String getUserType(int idUser) {
        return utils.getUserType(idUser);
    }
    public  User createUser(int idUser) {
        switch (getUserType(idUser)){
            case "STUDENT":
                return new Student(idUser);
            case "TEACHER":
                return new Teacher(idUser);
            case "ADMIN":
                return new Admin(idUser);
            default:
                return null;
        }
    }
}
