package com.actionanand.practice;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

//    public static String propertyValue;

    public static void main(String[] args) throws IOException, SQLException {

//        Config cfg = new Config();
//        cfg.setConfigValues();
//        propertyValue = cfg.getConfigValues("name");
        JdbcDemo db = new JdbcDemo();
        db.connect2DB();
    }

}
