import java.util.ArrayList;
import java.util.Scanner;

class Test {

    public static int Largest(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

    public static int binary_search(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // Coparishion:
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pair(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = 0;

            for (int j = 0; j < arr.length; j++) {
                System.out.print("( " + currentNumber + ", " + arr[j] + " )");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("tatal paris is = " + totalpairs);
    }

    public static void printSubarray(int arr[]) {
        int totalpairs = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("The total paise is = " + totalpairs);
    }

    public static int search(int arr[][], int key, int row, int colom) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colom; j++) {
                if (arr[i][j] == key) {

                    System.out.println("The value is exit on index = " + i + " , " + j + " ");
                    return arr[i][j];

                }

            }
        }

        System.out.println("The value is not found ");

        return -1;

    }

public static void print(int arr[][]){
for(int i = 0; i<arr.length; i++){
    for(int j = 0; j<arr[i].length; j++){
        System.out.print(arr[i][j]+" ");
    }
}
}
   
public static void max(int arr[][]){
    int max = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length; i++){
        for(int j= 0; j<arr[0].length; j++){
            if(arr[i][j]  > max){
                max = arr[i][j];
             
            }
        }
    }



    
       System.out.println("The max value is = "+max);
}


public static void kadance(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i<arr.length; i++){
            currentSum = currentSum + arr[i];
        }

        if(currentSum < 0){
            currentSum = 0;
        }

        maxSum = Math.max(currentSum, maxSum);

        System.out.println("The maximum sum is = "+ maxSum);
    }

    
// Reverse printing: 
public static void printArr(ArrayList <Integer> list ){
    for(int i = list.size()-1; i>=0; i--){
System.out.print(list.get(i)+" ");
    }
}



public static void max(ArrayList <Integer> list){
    int maximum = Integer.MIN_VALUE;
    for(int i = 0; i<list.size(); i++){

        if(list.get(i) > maximum){

            maximum = list.get(i);
        }
     
// maximum = Math.max(maximum, list.get(i));



       
    }
    System.out.println("The max value is =" + maximum);
   
}

public static void main(String[] args) {

        // int arr[][] = { { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 100, 11, 12 },
        // };
       


  ArrayList<Integer> list = new ArrayList<>();


list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.add(7);
list.add(8);
list.add(9);
list.add(10);


printArr(list);























// int arr[][] = new int[3][3];

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your numbers hare:");
// for(int i = 0; i<arr.length; i++){
//     for(int j = 0; j<arr[0].length; j++){
//        arr[i][j] = sc.nextInt();
//     }
// }

// print(arr);



    }
}