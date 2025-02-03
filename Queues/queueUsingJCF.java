package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class queueUsingJCF {

    // The queues is not a class we need to impliment using interfaces.
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();// ArrayDeque

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
