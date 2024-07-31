package com.xuxi.io.outputstream_;

import java.io.*;

public class BufferedCopy02_ {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\asus\\Desktop\\文件\\照片\\3.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\Demo\\2.jpg", true);
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, readCount);
        }
        System.out.println("复制完成");
        bis.close();
        bos.close();
    }
}
