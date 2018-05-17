package com.computeams;

public class Main {

    public static void main(String[] args) throws QueueIsEmptyException {
        
        //test();
        //testEmpty();
    }

    public static void test() {
        Queue queue = new Queue();

        queue.enqueue(new Node(0));
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(2));
        queue.enqueue(new Node(3));
        queue.enqueue(new Node(5));
        queue.enqueue(new Node(8));
        queue.enqueue(new Node(13));
        queue.enqueue(new Node(21));
        queue.enqueue(new Node(34));

        System.out.println(queue.toString());
        try {
            queue.dequeue();
            System.out.println(queue.toString());
            queue.dequeue();
            System.out.println(queue.toString());
            queue.dequeue();
            System.out.println(queue.toString());
            queue.dequeue();
            System.out.println(queue.toString());
            queue.dequeue();
        } catch (QueueIsEmptyException e) {
            e.printStackTrace();
            e.QueueIsEmptyException();
        }

        System.out.println(queue.toString());
        queue.enqueue(new Node(0));
        queue.enqueue(new Node(1));
        queue.enqueue(new Node(1));
        System.out.println(queue.toString());
        try {
            queue.dequeue();
            System.out.println(queue.toString());
            queue.dequeue();
            System.out.println(queue.toString());
        } catch (QueueIsEmptyException e) {
            e.printStackTrace();
        }

    }

    public static void testEmpty() throws QueueIsEmptyException {
        Queue queue = new Queue();
        queue.dequeue();
        try {
            queue.dequeue();
        } catch (QueueIsEmptyException e) {
            e.QueueIsEmptyException();
        }
    }

}
