package Linked_List;
/* 
public class Search_InLinkedlist {

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

    public int itr_Search(int Key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == Key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        Search_InLinkedlist list = new Search_InLinkedlist();

        list.addLast(3);
        list.addLast(4);
        list.addLast(9);
        list.addLast(88);
        list.addLast(74);
        list.addLast(40);
        list.addLast(444);
        list.addLast(44);

        list.Print();

        System.out.println("Element found at index: " + list.itr_Search(88));
    }
}


*/

// Recursive Search in LinkedList:

public class Search_InLinkedlist {

    // Node class
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

    // Method to add a node to the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Recursive helper function to search for a key
    public int helper(Node head, int key) {
        if (head == null) { // Base case: End of the list
            return -1; // Key not found
        }
        if (head.data == key) { // Key found
            return 0;
        }

        // Recursive call
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1; // Key not found in the rest of the list
        }
        return idx + 1; // Add 1 to the index from the next node
    }

    // Public method to initiate recursive search
    public int recSearch(int key) {
        return helper(head, key);
    }

    // Main method
    public static void main(String[] args) {
        Search_InLinkedlist ll = new Search_InLinkedlist();

        // Adding elements to the linked list
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);

        // Searching for a key
        int key = 30;
        int result = ll.recSearch(key);
        if (result != -1) {
            System.out.println("Key " + key + " found at index: " + result);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
