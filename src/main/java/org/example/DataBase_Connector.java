package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Connector {
    @Value("${connect.URL}")
    private String URL;

    @Value("${connect.USER}")
    private String USER;

    @Value("${connect.PASSWORD}")
    private String PASSWORD;
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
