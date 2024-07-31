package com.xuxi.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("张三", 90));
        personArrayList.add(new Person("李四", 30));
        personArrayList.add(new Person("王五", 40));
        personArrayList.add(new Person("赵六", 50));
        Iterator<Person> iterator = personArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
