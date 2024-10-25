package Sorting;

import java.util.*;

// ************** Normal form of bubble sort *****************

class Bubble_Sort {

    public static void bubbleSort(int arr[]) {
        for (int tern = 0; tern < arr.length - 1; tern++) {
            for (int j = 0; j < arr.length - 1 - tern; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };

        bubbleSort(arr);
        print(arr);
    }
}

/**************** Bubble Sort function (adaptive version) ***************/

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int flag;

        // Outer loop for each pass
        for (int i = 0; i < arr.length - 1; i++) {
            flag = 0; // Reset flag for each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = 1; // Set flag to indicate a swap was made
                    }
                }

                // If no swap happened, array is sorted, break out of the loop
                if (flag == 0) {
                    break;
                }
            }
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
