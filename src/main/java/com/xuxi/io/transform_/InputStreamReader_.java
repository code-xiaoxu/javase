package com.xuxi.io.transform_;

import java.io.*;

public class InputStreamReader_ {
    /*
    * InputStreamReader:字节流到字符流的桥梁
    *
     */
    public static void main(String[] args) throws IOException {
        String path = "D:\\Demo\\story.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();
    }
}
