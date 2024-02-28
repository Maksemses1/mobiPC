package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBS_Connect {
    private final String URL = "jdbc:mysql://localhost:3306/mobi";
    private final String USER = "root";
    private final String PASSWORD = "123q";
    private Connection conn;
    public JDBS_Connect(){

    }

    public Connection Connection() {
        try {
            return conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
