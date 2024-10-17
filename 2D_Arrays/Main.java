
public class SpiralMatrix {

    // Diagonal Sum Brute force. This brute force is work
    // on a O(n^2) time complexity which is not good because
    // we can write a more optimize code.

    // public static int diagonalSum(int matrix[][]) {
    //     int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum = sum + matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum = sum + matrix[i][j];
        // }
        // }
        // }

        // More optimized version:

//         for (int i = 0; i < matrix.length; i++) {
//             // primary diagonal
//             sum += matrix[i][i];

//             // secondary diagonal
//             if (i != matrix.length - 1 - i)
//                 ;
//             sum += matrix[i][matrix.length - i - 1];
//         }
//         return sum;
//     }

//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length - 1;
//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Key is found at ( " + row + ", " + col + ")");
//                 return true;

//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("Key is not found");
//         return false;
//     }

//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {

//             // top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // bottom
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }

//                 System.out.print(matrix[i][startCol] + " ");

//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 }
//         };

//         int result = diagonalSum(matrix);
//         System.out.println(matrix.length);

//         System.out.println(
        
//         );

//         int key = 100;
//        staircaseSearch(matrix, key);
//     }
// }




import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static List<Integer> printSpiral(int[][] mat) {
        
        // Define ans list to store the result.
        List<Integer> ans = new ArrayList<>();
        
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of columns
        
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
