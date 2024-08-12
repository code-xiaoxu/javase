package com.xuxi.thread.test;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU数量：" + runtime.availableProcessors());
    }
}
