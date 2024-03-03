package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Connector {
    private final String URL = "jdbc:postgresql://mobicluster-13902.8nj.gcp-europe-west1.cockroachlabs.cloud:26257/mobidb";
    private final String USER = "root1";
    private final String PASSWORD = "lBXxR60GHsyUmY3ng__ZZA";
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
