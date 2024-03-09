package org.example;

import org.example.Config.MyConfig;
import org.example.Users.Admin;
import org.example.Users.Student;
import org.example.Users.Teacher;
import org.example.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("userFactory")
public class UserFactory {
    private Student student;
    private Teacher teacher;
    private Admin admin;
    private final DataBaseGetters getter;
    @Autowired
    UserFactory(DataBaseGetters getter, Student student, Teacher teacher, Admin admin){
        this.student = student;
        this.teacher = teacher;
        this.admin = admin;
        this.getter = getter;
        System.out.println("UserFactory init");
    }
    String getUserType(int idUser) {
        return getter.getUserType(idUser);
    }
    User createUserClass(int idUser) {
        switch (getUserType(idUser)){
            case "STUDENT":
                return student;
            case "TEACHER":
                return teacher;
            case "ADMIN":
                return admin;
            default:
                return null;
        }
    }
    public User createUser(int idUser) {
        User user = createUserClass(idUser);
        user.setId(idUser);
        user.init();
        return user;
    }
}
