package com.xuxi.io.inputstream_;

import lombok.var;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
         String filePath = "d:\\Demo\\abc.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readUTF());
        Object o = ois.readObject();
        System.out.println("类型为"+o.getClass());
        System.out.println(o);
    }
}
