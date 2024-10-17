
// // ************* 2D_Arrays ***************

// //<<<<<<<<<<<<<<<< Spiral_Matrix >>>>>>>>>>>>>>>>>>>

// public class Test {

//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // top row
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             startRow++;

//             // right column
//             for (int i = startRow; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             endCol--;

//             // bottom row
//             if (startRow <= endRow) {
//                 for (int j = endCol; j >= startCol; j--) {
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//                 endRow--;
//             }

//             // left column
//             if (startCol <= endCol) {
//                 for (int i = endRow; i >= startRow; i--) {
//                     System.out.print(matrix[i][startCol] + " ");
//                 }
//                 startCol++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Matrix initialization.
//         int[][] matrix = {
//                 { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 }
//         };

//         // printSpiral(matrix);
// int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
//         System.out.println();
//     }
// }

//<<<<<<<<<<<<< self solutions >>>>>>>>>>>>>>

public class Test {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0, endRow = matrix.length - 1, startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // print top elements

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            startRow++;

            // print right side elements

            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            endCol--;

            // print bottom elements

            for (int j = endCol; j >= startCol; j++) {
                if (startRow <= endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            endRow--;

            // print left elements
            for (int i = endRow; i >= startRow; i++) {
                if (startRow <= endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);
    }
}
