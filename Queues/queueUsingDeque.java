package Queues;
// import java.util.Deque;

// import java.util.*;
// import java.util.LinkedList;

// import java.util.Deque;
// import java.util.LinkedList;

// import Queues.deque;

// class Queue {
//     Deque<Integer> Deque = new LinkedList<>();

//     public void add(int data) {
//         deque.addLast(data);
//     }

//     public int remove() {
//         return deque.removeFirst();

//     }

//     public int peek() {
//         return deque.getFirst();
//     }
// }

// public class queueUsingDeque {
//     public static void main(String[] args) {
//         Queue q = new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         System.out.println("peek = " + q.peek());
//         System.out.println(q.remove());

//     }
// }

import java.util.Deque;
import java.util.LinkedList;

class Queue {
    Deque<Integer> deque = new LinkedList<>();

    public void add(int data) {
        deque.addLast(data);
    }

    public int remove() {
        return deque.removeFirst();
    }

    public int peek() {
        return deque.getFirst();
    }
}

public class queueUsingDeque {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println("peek = " + q.peek());
    }
}
