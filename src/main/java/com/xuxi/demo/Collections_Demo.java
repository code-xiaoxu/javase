package com.xuxi.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Demo {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三", 20));
        list.add(new Person("李四", 30));
        list.add(new Person("王五", 40));
        list.sort((p1, p2) -> p2.getAge() - p1.getAge());
        for (Person p : list) {
            System.out.println(p.getName() + ":" + p.getAge());
        }
    }
}
