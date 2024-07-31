package com.xuxi.demo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    /*
      优先队列
     */
    public static void main(String[] args)
    {
        PriorityQueue<Person> queue = new PriorityQueue<Person>();
        queue.add(new Person("张三", 20));
        queue.add(new Person("李四", 30));
        queue.add(new Person("王五", 10));
        queue.add(new Person("王ka", 60));

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
