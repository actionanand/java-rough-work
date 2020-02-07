package com.actionanand.practice;

import java.io.IOException;
import java.sql.*;

public class JdbcDemo {
    public void connect2DB() throws IOException, SQLException {

        Config cfg = new Config();
        String url = cfg.getConfigValues("url");
        String username = cfg.getConfigValues("username");
        String password = cfg.getConfigValues("password");
        String dbName = cfg.getConfigValues("dbName");
        ResultSet resultSet;

        //establishing Connection Obj
        Connection c = DriverManager.getConnection(url, username, password);

        //Creating statement Obj
        Statement statement = c.createStatement();

        //execute the statement Obj
        resultSet = statement.executeQuery("SELECT * FROM " + dbName);

        //processing the result
        while(resultSet.next()) {
            System.out.printf(resultSet.getString("name"));
        }
    }
}
