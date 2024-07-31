package com.xuxi.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person  implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return o.getAge() - this.getAge();
    }
}
