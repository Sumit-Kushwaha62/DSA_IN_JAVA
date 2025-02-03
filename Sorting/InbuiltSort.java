// package Sorting;
/* import java.util.Arrays;
 * Arrays.sort(arr)
 * complexity = O(n logn)
 * Arrays.sort(arr, si, ei ) sort arrays from starting index to ending index
 */

import java.util.Arrays;

public class InbuiltSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(" Inbuilt sorting function of arrays:");

        int arr[] = { 2, 3, 8, 9, 0, 4, 3, 5, 7, 6 };

        // These all sorting is sort values in a assending order:
        Arrays.sort(arr, 1, 5);
        print(arr);

        System.out.println();

        Arrays.sort(arr);

        print(arr);

        // For reverse orde, It's only work on objects like Integer not on int

        /*
         * import java.util.Collections;
         * Arrays.sort(arr, Collections.reverseOrder())
         * 
         * Arrays.sort(arr, si, ei, Collections.reverseOrder())
         */

    }
}
