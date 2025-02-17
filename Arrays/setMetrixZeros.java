public class setMetrixZeros {
// Better approch: 
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to track which rows and columns need to be zeroed
        int[] rows = new int[m];
        int[] cols = new int[n];

        // Step 1: Traverse the matrix and mark rows and columns that contain zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1; // Mark the row
                    cols[j] = 1; // Mark the column
                }
            }
        }

        // Step 2: Zero out the marked rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

// Most optimal approch: 


    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
setZeroes(matrix);

        
        // Print the modified matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
    }
}
