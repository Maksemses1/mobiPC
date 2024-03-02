package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Connector {
    private final String URL = "jdbc:mysql://localhost:3306/mobi";
    private final String USER = "root";
    private final String PASSWORD = "123q";
    private Connection connection;

    public Connection Connection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
