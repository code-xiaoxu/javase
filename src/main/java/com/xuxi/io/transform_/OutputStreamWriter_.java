package com.xuxi.io.transform_;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("d:\\Demo\\demo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        BufferedWriter bufferedWriter = new BufferedWriter(osw);
        bufferedWriter.write("你好，zhangsan");
        bufferedWriter.close();
    }
}
