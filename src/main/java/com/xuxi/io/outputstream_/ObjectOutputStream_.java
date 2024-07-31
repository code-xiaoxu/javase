package com.xuxi.io.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args)throws Exception
    {
        String filePath = "d:\\Demo\\abc.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(123);
        oos.writeBoolean(true);
        oos.writeUTF("你好");
        oos.writeObject(new Dog("小黑", 3));
        oos.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

