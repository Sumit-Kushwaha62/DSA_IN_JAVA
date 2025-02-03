package Queues;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null;
    Node rear = null;

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    // add
    public void add(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // remove

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queues is Empty");
            return -1;
        }

        int head = front.data;

        // is have single elem.
        if (rear == front) {
            rear = front = null;

        } else {
            front = front.next;
        }
        return head;
    }

    // peek

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queues is empty:");
            return -1;
        }
        return front.data;
    }
}

public class queuesUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
