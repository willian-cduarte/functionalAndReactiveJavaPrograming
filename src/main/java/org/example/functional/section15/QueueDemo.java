package org.example.functional.section15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        QueueFun<String> queueFun = QueueFun.queue();
        QueueFun<String> enqueue = queueFun.enqueue("Ho are you?").enqueue("Fine?");

        System.out.println("enqueue");
        enqueue.forEach(System.out::println);

        System.out.println();
        System.out.println("enqueue.peek(): " + enqueue.peek());

        QueueFun<String> dequeue = enqueue.dequeue();

        System.out.println("dequeue");
        dequeue.forEach(System.out::println);

        System.out.println();
        System.out.println("enqueue.peek(): " + enqueue.peek());
        System.out.println("dequeue.peek(): " + dequeue.peek());

        System.out.println("dequeue.isEmpty(): " + dequeue.isEmpty());

        System.out.println("dequeue.size(): " + dequeue.size());

        Queue<String> queue = new LinkedList<>();
        queue.add("Hou are you?");
        queue.add("I'm fine");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
