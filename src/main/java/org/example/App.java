package org.example;

import org.example.Users.*;

public class App
{
    public static void main( String[] args ) {
        DataBaseUtils utils = new DataBaseUtils();
        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser(2);
        System.out.println(utils.getUserType(2));
        System.out.println(user.getUser() + "\n" +
                user.getAge() + "\n" +
                user.getEmail() + "\n" +
                user.getGender() + "\n" +
                user.getPassword() + "\n" +
                user.getId() + "\n" +
                user + "\n");


    }
}
