package com.xuxi.io.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("d:\\Demo\\b.txt");
        fileWriter.write("hello,world");
        fileWriter.close();
    }
}
