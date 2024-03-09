package org.example.Users;

import org.example.Users.User;
import org.springframework.stereotype.Component;

@Component("student")
public class Student extends User {

    public Student(){

    }

    public Student(String user, int age, String gender, String email, String password, String userType) {
        super(user, age, gender, email, password, userType);
    }

    @Override
    public String toString() {
        return "STUDENT";
    }
}
