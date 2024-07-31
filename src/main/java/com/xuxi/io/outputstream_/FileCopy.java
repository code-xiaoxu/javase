package com.xuxi.io.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\asus\\Desktop\\文件\\照片\\3.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\Demo\\1.jpg",true);
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while((readCount=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,readCount);
        }
        System.out.println("复制完成");
        fileInputStream.close();
        fileOutputStream.close();
    }
}
