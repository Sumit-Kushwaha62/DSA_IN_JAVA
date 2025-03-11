// package Easy;

public class leftRotationByDplace {
    /*
     * 
     * // Using an extra space:
     * public static void rotateArrayExtraSpace(int[] arr, int D) {
     * int n = arr.length;
     * D = D % n;
     * int[] temp = new int[D];
     * 
     * // Copy first D elements to temp
     * for (int i = 0; i < D; i++) {
     * temp[i] = arr[i];
     * }
     * 
     * // Shift remaining elements left
     * for (int i = D; i < n; i++) {
     * arr[i - D] = arr[i];
     * }
     * 
     * // Append temp elements to the end
     * for (int i = 0; i < D; i++) {
     * arr[n - D + i] = temp[i];
     * }
     * }
     */

    // Better approch:

    public static void rotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than the array length

        // Rotate the first part of the array
        rotate(arr, 0, n - 1);

        // Rotate the first k elements
        rotate(arr, 0, k - 1);

        // Rotate the remaining elements
        rotate(arr, k, n - 1);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


public static void rotatex(int arr[] , int start, int end){
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

public static void rotateZ(int arr[], int k){
int n = arr.length;
k = k%n;

    rotatex(arr, 0, n-1);
    rotatex(arr, 0, k-1);
    rotatex(arr, k, n-1);
}

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int k = 3; // Number of rotations
        int D = 3;

         rotateArray(arr, k); // Pass the array and the number of rotations
        print(arr); // Print the rotated array


        // System.out.println();
        // rotateZ(arr, k);
        // print(arr);

    }
}
