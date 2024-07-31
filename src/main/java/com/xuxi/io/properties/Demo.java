package com.xuxi.io.properties;

import java.io.IOException;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(Demo.class.getClassLoader().getResourceAsStream("demo.txt"));
//        properties.load(new InputStreamReader( new FileInputStream("D:\\tool\\IDEA2024\\实习\\Javase\\src\\main\\resources\\demo.txt"),
//                "UTF-8"));
        String name = properties.getProperty("name");
        String age  = properties.getProperty("age");
        String sex = properties.getProperty("sex");

        System.out.println(age);
        System.out.println(sex);
        System.out.println(name);
    }
}
