import java.util.*;

// public class BasicOf_2Darray {

//     public static boolean search(int matrix[][], int key, int row, int colum) {

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < colum; j++) {
//                 if (matrix[i][j] == key) {

//                     System.out.println("found at cell ( " + i + " , " + " " + j + "  )");

//                     return true;
//                 }
//             }

//         }
//         System.out.println("Key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];

//         int row = matrix.length, colum = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of matrix ");

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < colum; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Output:

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < colum; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         search(matrix, 8, row, colum);
//     }

// }

class BasicOf_2Darray {
















public static void Sum(int arr[][]){
    int sum = 0;
    for(int i = 0; i<arr.length; i++){
        for(int j= 0; j<arr[0].length; j++){
            sum = sum + arr[i][j];
        }
    }
    System.out.println("The sum of elements: " + sum);
}




    public static int maximum(int arr[][]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }

        }
        System.out.println("The maximum value is = " + max);
        return max;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int Search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Key is found on index = " + " ( " + i + " , " + j + " )");
                    return arr[i][j];
                }
            }
        }
        System.out.println("Key is not found:");
        return -1;
    }

    public static void main(String[] args) {

        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;

        // User input in 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);

        Search(arr, 8);
        maximum(arr);
        print(arr);
        Sum(arr);
        print(arr);


    }
}