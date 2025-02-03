package Stack;

import java.util.Deque;
import java.util.LinkedList;

import Queues.deque;

class Stack{
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data){ 
    deque.addLast(data);
    }

    public int pop(){
        return deque.removeLast();
    }

    public int peek(){
        return deque.getLast();
    }
}

public class stackUsingDeque {
    public static void main(String[] args) {
Stack s =  new Stack();
 
s.push(2);
s.push(2);
s.push(3);

System.out.println("Peek ="+ s.peek());

System.out.println(s.pop());







        
    }
}
