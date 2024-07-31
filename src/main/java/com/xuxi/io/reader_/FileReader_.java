package com.xuxi.io.reader_;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) throws IOException {
        read02();
    }
  static void read01() throws IOException {
      FileReader fileReader = new FileReader("d:\\Demo\\story.txt");
      int readdata = 0;
      while((readdata = fileReader.read())!=-1){
          System.out.print((char)readdata);
      }
      fileReader.close();
  }
   static void read02() throws IOException {
      FileReader fileReader = new FileReader("d:\\Demo\\story.txt");
      int readlen = 0;
      char[] buf = new char[1024];
      while((readlen = fileReader.read(buf))!=-1){
          System.out.print(new String(buf,0,readlen));
      }
      fileReader.close();
  }
}
