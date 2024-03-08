package org.example;

import org.example.Users.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userFactory")
public class UserFactory {
    private final DataBaseGetters getter;
    @Autowired
    UserFactory(DataBaseGetters getter){
        this.getter = getter;
        System.out.println("UserFactory init");
    }
    String getUserType(int idUser) {
        return getter.getUserType(idUser);
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
