package Linked_List;

import java.util.*;

public class BasicsOf_LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            return value;
        }

        int value = head.data;
        head = head.next;
        return value;
    }

    // Remove last

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        return value;
    }

    // Remove at index

    public void Print() {
        if (head == null) {
            System.out.println("Linked list is empty:");
            return;
        }
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        BasicsOf_LinkedList ll = new BasicsOf_LinkedList();

        ll.addFirst(4);
        ll.addFirst(8);
        ll.addFirst(88);
        ll.addLast(2);
        ll.addLast(1);
        ll.addAtIndex(2, 99);
        System.out.println();
        ll.Print();

    }
}
