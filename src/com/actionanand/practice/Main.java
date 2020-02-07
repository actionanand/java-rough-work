package com.actionanand.practice;

import java.io.IOException;

public class Main {

    public static String propertyValue;

    public static void main(String[] args) throws IOException {

        Config cfg = new Config();
        cfg.setConfigValues();
        propertyValue = cfg.getConfigValues("name");
        System.out.println(propertyValue);
        System.out.println(cfg.getConfigValues("age"));
    }

}
