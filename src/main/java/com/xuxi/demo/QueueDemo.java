package com.xuxi.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    /**
     * 队列
     * 先进先出
     * @param args
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //添加
        queue.add("a");
        queue.offer("b");

        //取队首
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //删除
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue.size());
    }
}
