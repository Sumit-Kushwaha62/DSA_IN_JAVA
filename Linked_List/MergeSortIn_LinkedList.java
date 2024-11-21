package Linked_List;

// Approach:
// 1. Find the middle of the linked list
// 2. Divide the linked list into two parts (left and right)
// 3. Recursively sort both halves
// 4. Merge the sorted halves

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortIn_LinkedList {
    private Node head;

    // Add a new node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append the remaining elements of either list
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; // Skip the dummy node
    }

    // Merge sort function
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // Divide into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort the two halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortIn_LinkedList ll = new MergeSortIn_LinkedList();

        // Add nodes to the linked list
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(9);
        ll.addFirst(11);

        System.out.println("Original List:");
        ll.print();

        // Sort the linked list using merge sort
        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}
