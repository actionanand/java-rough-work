package com.actionanand.practice;

import java.io.*;
import java.util.Properties;

public class Config {

    Properties p;
    final String filename = "config.properties";

    public Config() throws FileNotFoundException {
    }

    //Storing environmental values
    public void setConfigValues() throws IOException {
        OutputStream os = new FileOutputStream(filename);
        p = new Properties();
        p.setProperty("name","Anand");
        p.setProperty("age","27");
        p.store(os, null);
    }

    //retrieving environmental values
    public String getConfigValues(String key) throws IOException {
//        InputStream is = new FileInputStream(System.getProperty("user.dir") + "/" + filename);
        InputStream is = new FileInputStream(filename);
        p = new Properties();
        String name;

        p.load(is);
        name = p.getProperty(key);

//        To print all properties' values
//        p.list(System.out);
        return name;
    }
}