package Searching;

import java.util.*;
/* 
public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparisons:
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 33, 44, 45 };
        int key = 9;

        int result = binarySearch(numbers, key);

        System.out.println("Index for key is :" + result);

    }
}*/


class BinarySearch{


    public static int search(int arr[], int key){

        int start = 0,  end = arr.length;
       

    while(start <= end){
int mid = (start+end)/2;

        if(arr[mid] == key){
            return mid;
            
        }
        if(arr[mid] < key){
           start =  mid+1;
        }

        else{
           end =  mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8};
        int result = search(arr, 6);

        System.out.println("The index of " + result);
    }
}




// public class BinarySearch {

// public static int binarySearch(int arr[], int key) {
// int start = 0, end = arr.length - 1;
// int mid = (start + end) / 2;

// while (start <= end) {
// if (arr[mid] == key) {
// return mid;

// } else if (arr[mid] < key) {
// start = mid + 1;

// } else if (arr[mid] > key) {
// end = mid - 1;
// }

// }
// return -1;
// }

// public static void main(String[] args) {
// int arr[] = { 2, 3, 4, 5, 6, 78, 8, 9, 0 };
// int key = 9;

// binarySearch(arr,key);
// System.out.println(binarySearch(arr, key));
// }
// }

// class BinarySearch{
// public static int binarySearch(int arr[], int key){
// int start = 0, end = arr.length-1;

// while(start <= end){
// int mid = (start+end)/2;
// if(arr[mid] == key){
// System.out.println("The key is"+mid);
// return mid;

// }
// else if(arr[mid] < key){
// start = mid +1;
// }
// else if(arr[mid] > key){
// end = mid -1;
// }

// }
// return -1;
// }
// public static void main(String[] args) {

// int arr[] = {3,2,4,5,6,7,8,9};
// int key = 9;
// int result = binarySearch(arr, 9);

// }
// }

// class BinarySearch{
// public static void main(String[] args) {
// System.out.println("HI");
// int marks[] = new int[50];

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your number here:");
// for(int i = 0; i<marks.length; i++){
// marks[i] = sc.nextInt();
// }

// for(int j = 0; j<marks.length; j++){
// System.out.println(marks[j]);
// }
// }
// }
