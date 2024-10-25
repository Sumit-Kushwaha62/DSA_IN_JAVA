
// <<<<<<<<<<< Brute Forch Approch >>>>>>>>>>>>>>

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

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

    }
}




//<<<<<<<<<<<< Optimal Approch >>>>>>>>>>>>>>>>>>

public class DiagonalSum {

    public static int DiagonalSum(int matrix[][]) {

        int n = matrix.length;
        int sum = 0;

        // Iterate through the matrix to calculate the diagonal sums
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += matrix[i][i];

            /*
             * Add secondary diagonal element, only if it's not the same as the primary
             * diagonal element
             */
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

    }
}
