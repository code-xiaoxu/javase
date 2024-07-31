package com.xuxi.io.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream_ {
    public static void main(String[] args) {
       read02();

    }
    /*
        该方法一个字节一个字节的读，效率较低
     */
    public static void read01() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("d:\\Demo\\new2.txt");
            int readdata = 0;
            while ((readdata = fileInputStream.read()) != -1) {
                System.out.print((char) readdata);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

        public static void read02() {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream("d:\\Demo\\new2.txt");
                byte[] buff = new byte[8];
                int readlen = 0;
                while ((readlen = fileInputStream.read(buff)) != -1) {
                    System.out.print(new String(buff, 0, readlen));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

