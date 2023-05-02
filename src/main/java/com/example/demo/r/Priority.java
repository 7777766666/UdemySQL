package com.example.demo.r;

import java.util.PriorityQueue;

public class Priority {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(77);
        priorityQueue.add(11);
        priorityQueue.add(222);
        priorityQueue.add(7);
        priorityQueue.add(9);
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);


    }


}
