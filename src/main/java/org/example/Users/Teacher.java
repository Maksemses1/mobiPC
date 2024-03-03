package org.example.Users;

public class Teacher extends User {


    public Teacher(int id) {
        super(id);
    }
    public Teacher(String user, int age, String gender, String email, String password, String userType) {
        super(user, age, gender, email, password, userType);
    }
    @Override
    public String toString() {
        return "TEACHER";
    }
}
