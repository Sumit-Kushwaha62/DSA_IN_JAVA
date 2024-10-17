package Arrays;

import java.util.*;

//*************************** Linear Search *****************************

// public class Test {

//     public static int Search(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] == key) {
//                 System.out.println(" Key is found on index = " + i);
//                 return i;
//             }
//         }
//         System.out.println(" Key is not found:");
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         Search(arr, 4);
//     }
// }

// ******************** Binary Search **********************

// class Test {

//     public static int Search(int arr[], int key) {
//         int start = 0, end = arr.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (arr[mid] == key) {
//                 System.out.println("key is" + mid);
//                 return mid;
//             }
//             if (arr[mid] > key) {

//                 end = mid - 1;
//             }

//             start = mid + 1;
//         }

//         System.out.println("Key is not found ");
//         return -1;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         Search(arr, 8);
//     }
// }

//********************** Largest in arrays ***********************

// class Test{

//     public static int largest(int arr[]){

//         int smallest = Integer.MAX_VALUE;
//         int Largest = Integer.MIN_VALUE;

//         for(int i = 0; i<arr.length; i++){
//             if(smallest > arr[i]){
//                 smallest = arr[i];
//             }

//             if(Largest < arr[i]){
//                 Largest = arr[i];
//             }
//         }
//         System.out.println("most largest is: " + Largest);
//         System.out.println("Most samllest is: ="+ smallest);
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = { 1,2,3,4,5,6};
//         largest(arr);
//     }
// }

//********************Reverse in arrays ******************** */

// class Test {

//     public static int Reverse(int arr[]) {
//         int start = 0, end = arr.length - 1;

//         while (start < end) {
//             int temp = arr[end];
//             arr[end] = arr[start];
//             arr[start] = temp;

//             start++;
//             end--;
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 3, 4, 5, 0, 8 };
//         Reverse(arr);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// ************** Print Sub arrays *****************

// class Test {

//     public static int Pairs(int arr[]) {
//         int tp = 0;
//         for (int i = 0; i < arr.length; i++) {
//             int currentNumber = arr[i];
//             for (int j = 1; j < arr.length; j++) {
//                 System.out.print(" ( " + currentNumber + " , " + arr[j] + "  )" + " ");
//                 tp++;
//             }

//             System.out.println();
//         }
//         System.out.println("Total sub arrsy" + tp);
//         return -1;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
//         Pairs(arr);
//     }
// }

class Test{
    public static int Print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,8,5,4,8,9,0};
       Print(arr);
System.out.println();
      Arrays.sort(arr);
      Print(arr);
    }
}