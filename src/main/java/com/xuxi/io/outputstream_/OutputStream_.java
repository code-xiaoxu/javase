package com.xuxi.io.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_ {
    public static void main(String[] args) throws IOException {
       write01();
    }
    public static void write01() throws IOException {
        FileOutputStream fos = null;
        fos = new FileOutputStream("d:\\Demo\\a.txt", true);
        fos.write("hello".getBytes());
//        fos.write('a');
        fos.close();
    }
}
