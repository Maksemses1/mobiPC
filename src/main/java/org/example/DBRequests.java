package org.example;

import org.example.JDBC_utils.DataBase_Connector;

import java.sql.*;

public class DBRequests extends DataBase_Connector {
    Connection connection;

    private ResultSet getResultSet(String sql) throws SQLException {
        connection = Connection();
        ResultSet resultSet;
        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        resultSet = stmt.getResultSet();
        return resultSet;
    }
    protected int getIntFromRequest(String sql) {
        int Int = 0;
        try {
            ResultSet rs = getResultSet(sql);
            rs.next();
            Int = rs.getInt(1);
        } catch (SQLException e) {
            return Int;
        }
        closeConnection();
        return Int;
    }
    protected String getStringFromRequest(String sql) {
        String String = null;
        try {
            ResultSet rs = getResultSet(sql);
            rs.next();
            String = rs.getString(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        closeConnection();
        return String;
    }
    PreparedStatement CreateStatement(String sql) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stmt;
    }
    protected void insertRequest(String sql){
        try {
            connection = Connection();
            PreparedStatement stmt = CreateStatement(sql);
            System.out.println(stmt);
            stmt.execute();
            closeConnection();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
