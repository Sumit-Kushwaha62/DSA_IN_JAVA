package Searching;

// Write Using the tutorials:

// public class Linear_Search {

//     public static int linearSearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;

//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         int numbers[] = { 3, 4, 6, 7, 8, 9, 10, 11, 12, 13 };
//         int key = 10;

//         linearSearch(numbers, key);

//         int index = linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("Key is found on indes = " + index);
//         }
//         System.out.println();

//     }
// }

//Write by my self for practice:

// public class Linear_Search {

//     public static int finding(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {

//             if (number[i] == key) {
//                 System.out.println("Key is found on index " + i + " " + "and the value of it " + number[i]);
//                 return i;

//             }

//         }
//         System.out.println("key is not found!");
//         return -1;
//     }

//     public static void main(String[] args) {

//         int number[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 45, 43 };
//         int key = 9;

//          finding(number, key);

//     }
// }

/* ------------------------- LINEAR SEARCH -----------------------------*/

//class BinarySearch{
//    public static int binarySearch(int arr[], int key){
//        int start = 0, end = arr.length-1;
//        int mid = (start+end)/2;
//
//        while(start <= end){
//            if(arr[mid] == key){
//               System.out.println("The key is"+mid);
//                return mid;
//
//            }
//            else if(arr[mid] < key){
//                start = mid +1;
//            }
//            else if(arr[mid] > key){
//                end = mid -1;
//            }
//
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//
//        int arr[] = {3,2,4,5,6,7,8,9};
//        int key = 9;
//        int result = binarySearch(arr, 9);
//
//    }
//}

/* ---------------------------------- BINARY SEARCH ---------------------------------*/
// class Linear_Search{

//     public static int Search(int arr[], int key){

//         int start = 0, end = arr.length-1;
//         while(start <= end){
//           int mid = (start + end)/2;
//             if(arr[mid] == key){
//                 System.out.println("key is found on index "+ mid +" and the value is "+arr[mid]);
//                 return mid;
//             }
//             else if(arr[mid] <= key){
//                 start = mid+1;
//             }
//             else if(arr[mid] >= key){
//                 end = mid-1;
//             }
//         }
//         System.out.println("Key is not found!");
//         return -1;
//     }
//     public static void main(String[] args) {

//         int arr[] = {3,5,6,7,8,9,2,1};
//         int key = 9;
//         Search(arr, key);

//     }
// }

/* 
class Linear_Search{

    public static int max_min(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;


        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }

            
        }
        System.out.println("The smallest value is  " +smallest);
        System.out.println("The largest value is "+ largest);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7,8,9};
        max_min(arr);
    }
}*/

// class Linear_Search{

//     public static void search(int arr[], int key){
//         int smalles = Integer.MAX_VALUE;
//         int largest = Integer.MIN_VALUE;

//         for(int i = 0; i<arr.length; i++){
//             if(smalles > arr[i]){
//                 smalles = arr[i];
//             }
//             if(largest < arr[i]){
//             largest = arr[i];
//             }
//         }

//         System.out.println("Most largest is: " + largest);
//         System.out.println("Most smallest is " + smalles);

//     }
//     public static void main(String[] args) {
//         int arr[] = {3,4,5,8,7,6,4,3,4};
// search(arr, 8);

//     }
// }

class Linear_Search {

    public static int search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("key is found on index:" + i);
                return i;
            }

        }
        System.out.println("Key is not found:");
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 0;
        search(arr, key);
    }
}