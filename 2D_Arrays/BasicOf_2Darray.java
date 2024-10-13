import java.util.*;

public class BasicOf_2Darray {

    public static boolean search(int matrix[][], int key, int row, int colum) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("found at cell ( " + i + " , " + " " + j + "  )");

                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int row = matrix.length, colum = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of matrix ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output:

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 8, row, colum);
    }

}
