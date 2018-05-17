package com.computeams;

public class Queue {

    private Node head;
    private Node tail;

    public void enqueue(Node node) {
        if (head == null && tail == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Node dequeue() throws NullPointerException, QueueIsEmptyException {
        Node tempHead;
        tempHead = head;
        if (head == null) {

            throw new QueueIsEmptyException();
        }


        if (head.hasNext()) {
            head = head.getNext();
        } else
            head = null;
        return tempHead;
    }

    @Override
    public String toString() {
        String queue = "";
        if (head == null && tail == null) {
            return "Queue is empty";
        }
        Node element = head;
        while (element.hasNext()) {
            queue += element.getValue() + " ";
            element = element.getNext();
        }
        queue += element.getValue();
        return queue;
    }
}
