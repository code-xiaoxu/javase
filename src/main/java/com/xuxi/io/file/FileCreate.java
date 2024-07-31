package com.xuxi.io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        create03();
    }
   static void create01(){
        String filename = "D:\\Demo\\new1.txt";
        File file1 = new File(filename);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void create02(){
        File parentfile = new File("D:\\Demo\\");
        String filename = "new2.txt";
        File file1 = new File(parentfile, filename);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     static void create03(){
        String parentfilename = "D:\\Demo\\";
        String filename = "new3.txt";
        File file1 = new File(parentfilename, filename);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
