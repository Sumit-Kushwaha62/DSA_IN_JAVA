package Linked_List;

import java.util.*;

public class doublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    // remove:

    public int removeFirst() {
        if (head == null) {
            System.out.println("DDL is empty");

            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;

    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        System.out.println();
        dll.print();

    }
}
