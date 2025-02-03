package Queues;

import java.util.*;

class Queues {

    int arr[];
    int size;
    int rear;
    int front;

    Queues(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

public boolean isFull(){
    return (rear+1)% size == front;
}



    // add data:

    public void add(int data) {
        if (isEmpty()) {
            System.out.println("Queues is Empty!");
            return;
        }

        // if add 1st elem.
        if(front == -1){
            front = 0;

        }
        rear = (rear+1)% size;
        arr[rear] = data;
    }

    // remove data:
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queues is Empty!");
            return -1;
        }

        int result = arr[front];

        // last elem. delet if
        if (rear == front){
            rear = front = -1;
        }else{
            front = (front +1)% size;
        }
        return result;

    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queues");
            return -1;
        }
        return arr[front];
    }

    public class circularQueuesUsingArray {
        public static void main(String[] args) {
            Queues q = new Queues(6);

            // q.add(1);
            // q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();

            }

        }

    }
}