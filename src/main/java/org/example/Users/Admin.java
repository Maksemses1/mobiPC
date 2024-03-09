package org.example.Users;

import org.example.Users.User;
import org.springframework.stereotype.Component;

@Component("admin")
public class Admin extends User {

    @Override
    public String toString() {
        return "ADMIN";
    }
}
