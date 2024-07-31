package com.xuxi.collection_.hashSet;

import java.util.*;
@SuppressWarnings({ "all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Person("jack", 20, new Mydate(1999, 10, 1)));
        set.add(new Person("zhangsan", 20, new Mydate(1999, 10, 1)));
        set.add(new Person("jack", 20, new Mydate(1999, 9, 1)));
        System.out.println("set---"+set);
    }
}
class Person{
    private String name;
    private int age;
    private Mydate birthday;
    public Person(String name, int age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "[name="+name+",age="+age+",birthday="+birthday+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}
class Mydate{
    private int year;
    private int month;
    private int day;
    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return year == mydate.year && month == mydate.month && day == mydate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
    public String toString(){
        return year+"年"+month+"月"+day+"日";
    }
}
