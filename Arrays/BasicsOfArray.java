package Arrays;

import java.util.*;

// public class BasicsOfArray {
//     public static void main(String[] args) {

//         // Creating of arrays:

//         // First way
//         int marks[] = new int[13];

//         // Second way
//         int numbers[] = { 2, 3, 4, 5 };

//         // Third way
//         String fruits[] = { "apple", " mango", "orange" };

//         // Taking user input in array:
//         System.out.println("Enter you number here");
//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("Pysics:" + marks[0]);
//         System.out.println("Chemistery:" + marks[1]);
//         System.out.println("Maths:" + marks[2]);

//         // Update value
//         marks[2] = 100;

//         System.out.println("Maths:" + marks[2]);
//         System.out.println(marks.length);

//     }
// }

// Arrays are always pass by reference:
public class BasicsOfArray{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
marks[i] = marks[i]+1;
        }
    }


    public static void main(String[] args) {
        int marks[] = { 97, 98, 99};
        update(marks);

        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
