// package Searching;

// First Approch:

public class Linear_Search {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(i);
                  return i;
                
              

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = { 3, 4, 6, 7, 8, 9, 10, 11, 12, 13 };
        int key = 10;

        linearSearch(numbers, key);

        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key is found on indes = " + index);
        // }
        // System.out.println();

    }
}

// Second Approch:

// public class Linear_Search {

//     public static int linearSearch2(int number[], int key) {
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

//         finding(number, key);

//     }
// }
