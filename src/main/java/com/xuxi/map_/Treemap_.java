package com.xuxi.map_;
import java.util.*;
@SuppressWarnings("all")
public class Treemap_ {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
//                return o1.compareTo(o2);
            }
        });
        map.put("abc",3);
        map.put("bacfa",5);
        map.put("ab",2);
        System.out.println(map);

        map.put("as",4);
        System.out.println(map);
    }
}



