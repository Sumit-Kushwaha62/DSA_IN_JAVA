package Queues;

import java.util.*;

class Queues {

    int arr[];
    int size;
    int rear;

    Queues(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // add data:

    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full!");
            return;
        }

        rear = rear + 1;
        arr[rear] = data;
    }

    // remove data:
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queues is Empty!");
            return -1;
        }

        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear = rear - 1;
        return front;

    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queues");
            return -1;
        }
        return arr[0];
    }

    public class queuesUsingArray {
        public static void main(String[] args) {
            Queues q = new Queues(6);

            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();

            }

        }

    }
}
