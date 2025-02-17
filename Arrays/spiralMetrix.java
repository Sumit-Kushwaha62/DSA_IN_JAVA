public class spiralMetrix {

    public static void printSpiral(int[][] arr) {
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row (left to right)
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;

            // Right column (top to bottom)
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            // Bottom row (right to left) - FIXED CONDITION
            if (startRow <= endRow) { // Check rows remaining, not columns
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(arr[endRow][i] + " ");
                }
                endRow--;
            }

            // Left column (bottom to top)
            if (startCol <= endCol) { // Correct column check
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void test(int arr[][]) {
        int startRow = 0, startCol = 0, endRow = arr.length - 1, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            // bottom
            if (startRow <= endRow) {

                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(arr[endRow][i] + " ");
                }

            }
            endRow--;

            // left

            if (startCol <= endCol) {

                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 }
        };
        test(arr);
        System.out.println();
        printSpiral(arr);
    }
}