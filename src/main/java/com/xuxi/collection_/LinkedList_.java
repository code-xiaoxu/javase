package com.xuxi.collection_;


import java.util.*;
import java.util.List;
@SuppressWarnings({ "all"})
public class LinkedList_ {
    public static void main(String[] args) {
        Node node1 = new Node("jack");
        Node node2 = new Node("tom");
        Node node3 = new Node("mary");
        node1.next = node2;
        node2.next = node3;
        node3.prev = node2;
        node2.prev =node1;
        Node last= node3;
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last = last.prev;

        } 
        List list = new ArrayList(10);
        List list1 =new ArrayList();
        Vector vector = new Vector();
        Vector vector1 = new Vector(8);
        LinkedList linkedList = new LinkedList();
    }
}
class Node{
     public Object item;
    public Node prev;
    public  Node next;
    public Node(Object item){
        this.item = item;
    }
    public  String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
