package org.example.Users;

public class Admin extends User {
    private int Admin_id;
    public Admin(String login, int age, String gender, String email, String password, int Admin_id) {
        super(login, age, gender, email, password);
        this.Admin_id = Admin_id;
    }
    public int getAdmin_id() {
        return Admin_id;
    }
}
