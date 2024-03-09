package org.example.Users;

import org.example.Users.User;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher extends User {


    public Teacher() {
    }
    public Teacher(String user, int age, String gender, String email, String password, String userType) {
        super(user, age, gender, email, password, userType);
    }
    @Override
    public String toString() {
        return "TEACHER";
    }
}
