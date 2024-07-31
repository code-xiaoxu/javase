package com.xuxi.io.writer_;

import com.xuxi.io.reader_.BufferedReader_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String src = "D:\\Demo\\story.txt";
        String dest = "D:\\Demo\\story_copy.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest));
        String line;
        while((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
