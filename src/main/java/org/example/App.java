package org.example;

import org.example.Users.*;

public class App
{
    public static void main( String[] args ) {
        DataBaseUtils utils = new DataBaseUtils();
        Admin admin = new Admin("maksym", 16, "male", "123@gmail.com", "123456789", 1);
        System.out.println(utils.getPassword("Maksym"));
        System.out.println(admin.getAdmin_id());


    }
}
