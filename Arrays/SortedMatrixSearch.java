
public class SortedMatrixSearch {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at ( " + row + " , " + col + " )");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key is not exit:");
        return false;
    }

    public static boolean test(int matrix[][], int key) {

        int n = matrix.length;
        int row = 0;
        int colom = matrix[0].length - 1;

        while (row < n && colom >= 0) {
            if (matrix[row][colom] == key) {
                System.out.println("key is found:");
                return true;

            } else if (key < matrix[row][colom]) {
                colom--;
            } else {
                row++;
            }
        }
        System.out.println(" key not found:");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 39;
        test(matrix, key);

    }
}
