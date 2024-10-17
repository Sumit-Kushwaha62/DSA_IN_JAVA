package Arrays;

import java.util.*;
/* 
// <<<<<<<<<<<<<<<< Create an array >>>>>>>>>>>>>>>>>>>

public class BasicsOfArray {
    public static void main(String[] args) {

        // Creating of an arrays:
        // First way
        int marks[] = new int[13];

        // Second way
        int numbers[] = { 2, 3, 4, 5 };

        // Third way
        String fruits[] = { "apple", " mango", "orange" };

        // Taking user input in array:
        System.out.println("Enter you number here");
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Pysics:" + marks[0]);
        System.out.println("Chemistery:" + marks[1]);
        System.out.println("Maths:" + marks[2]);

        // Update value
        marks[2] = 100;

        System.out.println("Maths:" + marks[2]);
        System.out.println(marks.length);

    }
}

// <<<<<<<<<<<<<<< Arrays are always pass by reference >>>>>>>>>>>>>>>>
// Here we change arrays values using function but due to reference it's
// actually change:
public class BasicsOfArray {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }

}
*/
// ******************* Basics Operations on Arrays ************************

// <<<<<<<<<<< Method to insert an element at a specific index
// >>>>>>>>>>>>>>>>>>>>>>>>>>

// class BasicsOfArray {
//     public static int insert(int[] arr, int size, int element, int index) {
//         // Check if the array is full
//         if (size >= arr.length) {
//             System.out.println("Array is full. Cannot insert " + element);
//             return size;
//         }

//         // Check if the index is valid
//         if (index < 0 || index > size) {
//             System.out.println("Invalid index. Cannot insert " + element);
//             return size;
//         }

//         // Shift elements to the right to make space for the new element
//         for (int i = size; i > index; i--) {
//             arr[i] = arr[i - 1];
//         }

//         // Insert the element
//         arr[index] = element;

//         return size + 1;

//     }
//     // <<<<<<<<<< Method to delete an element at a specific index
//     // >>>>>>>>>>>>>>>>>>>>

//     public static int delete(int[] arr, int size, int index) {

//         // Check if the index is valid
//         if (index < 0 || index >= size) {
//             System.out.println("Invalid index. Cannot delete element.");
//             return size;
//         }
//         // check array have element
//         if (size == 0) {
//             System.out.println("Arrays is empty:");
//         }
//         // Shift elements to the left to fill the gap
//         for (int i = index; i < size - 1; i++) {
//             arr[i] = arr[i + 1];
//         }

//         return size - 1; // Return the new size
//     }

//     public static void Traversal(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static int Searching(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.println("key is found on index: " + i);
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         int arr[] = { 1, 2, 3, 4, 5, 0, 0 };

//         int size = 5;

//         System.out.println("Before insertions");

//         Traversal(arr);
//         System.out.println();
//         insert(arr, size, 99, 0);
//         System.out.println();
//         System.out.println("After insertions");
//         Traversal(arr);
//         System.out.println();

//         delete(arr, 5, 3);
//         System.out.println("After deletaions");
//         Traversal(arr);

//     }
// }

// <<<<<<<<<<<<< Input arrays >>>>>>>>>>>>>

class BasicOf_array {
    public static void main(String[] args) {

        int marks[] = new int[5]; // Array of size 50

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers here:");

        // Input numbers into the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Print the array elements
        for (int j = 0; j < marks.length; j++) {
            System.out.print(marks[j]);
        }

        sc.close(); // Close the scanner after use
    }
}

// class BasicsOfArray {

// public static void Traversal(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static int Searching(int arr[], int key) {
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == key) {
// System.out.println("key is found on index: " + i);
// return i;
// }
// }
// return -1;
// }

// public static void Insertion(int arr[], int elements, int size, int
// possition) {

// for (int i = size - 1; i >= possition; i--) {
// arr[i + 1] = arr[i];
// }

// arr[possition] = elements;

// }

// public static int deletaion(int arr[], int size) {

// if (size == 0) {
// System.out.println("Array is empty");
// return size;
// }
// for (int i = 0; i < size - 1; i++) {
// arr[i] = arr[i + 1];
// }
// return size - 1;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 0 };

// deletaion(arr, arr.length);
// Traversal(arr);

// }

// }

// public class BasicOf_array {

// public static void Traversal(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// // <<<<<<<<<<< Method to insert an element at a specific index

// public static int insert(int[] arr, int size, int element, int index) {
// // Check if the array is full
// if (size >= arr.length) {
// System.out.println("Array is full. Cannot insert " + element);
// return size;
// }

// // Check if the index is valid
// if (index < 0 || index > size) {
// System.out.println("Invalid index. Cannot insert " + element);
// return size;
// }

// // Shift elements to the right to make space for the new element
// for (int i = size; i > index; i--) {
// arr[i] = arr[i - 1];
// }

// // Insert the element
// arr[index] = element;

// return size + 1;
// }

// // <<<<<<<<<< Method to delete an element at a specific index

// public static int delete(int[] arr, int size, int index) {

// // Check if the index is valid
// if (index < 0 || index >= size) {
// System.out.println("Invalid index. Cannot delete element.");
// return size;
// }
// // check array have element
// if (size == 0) {
// System.out.println("Arrays is empty:");
// }
// // Shift elements to the left to fill the gap
// for (int i = index; i < size - 1; i++) {
// arr[i] = arr[i + 1];
// }

// return size - 1; // Return the new size
// }

// public static void main(String[] args) {

// int arr[] = { 1, 2, 3, 4, 5, 0, 0 };

// int size = 5;

// System.out.println("Before insertions");

// Traversal(arr);
// System.out.println();
// insert(arr, size, 99, 0);
// System.out.println();
// System.out.println("After insertions");
// Traversal(arr);
// System.out.println();

// delete(arr, 5, 3);
// System.out.println("After deletaions");
// Traversal(arr);

// }
// }
