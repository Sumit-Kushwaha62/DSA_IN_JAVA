
// <<<<<<<<<<< Brute Forch Approch >>>>>>>>>>>>>>

// # Tested:

public class DiagonalSum {

    public static int DiagonalSum(int matrix[][]) {

        int sum = 0;
        int row = matrix.length;
        int colum = matrix[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colum; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // <<<<<<<<<<<< Optimal Approch >>>>>>>>>>>>>>>>>>

    public static int DiagonalSum1(int matrix[][]) {

        int n = matrix.length;
        int sum = 0;

        // secondary diagonal sum
        for (int i = 0; i < n; i++) {

            sum += matrix[i][i];

            if (i != n - i - 1) { // check the center element is not counted two times
                sum += matrix[i][n - i - 1];// primary digonal sum
            }
        }

        return sum;
    }

    public static int test(int arr[][]) {

        int n = arr.length;
        int row = arr.length;
        int colom = arr[0].length;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colom; j++) {
                // seconday diangoanal
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == n - 1) {
                    // primary digoanal
                    sum += arr[i][j];
                }

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println(test(arr));

    }
}
