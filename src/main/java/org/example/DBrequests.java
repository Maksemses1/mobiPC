package org.example;

import java.sql.*;

public class DBrequests extends JDBS_Connect {

    private ResultSet getResultSet(String sql) throws SQLException {
        Connection conn = Connection();
        ResultSet resultSet;
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        resultSet = stmt.getResultSet();
        return resultSet;
    }
    int getIntFromRequest(String sql) {
        int Int = 0;
        try {
            ResultSet rs = getResultSet(sql);
            rs.next();
            Int = rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        closeConnection();
        return Int;
    }
    String getStringFromRequest(String sql) {
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
}
