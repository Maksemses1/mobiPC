package org.example.Users;

public class Student extends User {


    public Student(int id) {
        super(id);
    }
    public Student(String user, int age, String gender, String email, String password, String userType) {
        super(user, age, gender, email, password, userType);
    }

    @Override
    public String toString() {
        return "STUDENT";
    }
}
