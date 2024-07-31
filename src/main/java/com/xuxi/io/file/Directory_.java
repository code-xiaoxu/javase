package com.xuxi.io.file;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
        File file = new File("d:\\Demo\\new1.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件删除成功");
        }else
            System.out.println("文件不存在");
        System.out.println("---------");
    }
}
