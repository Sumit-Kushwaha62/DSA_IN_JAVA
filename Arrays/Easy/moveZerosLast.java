import java.util.ArrayList;
import java.util.List;

public class moveZerosLast {

    // Brute force approch:

    public static void moveZeroesBrute(int[] nums) {
        List<Integer> move = new ArrayList<>();

        // Add non-zero elements to the list

        for (int num : nums) {
            if (num != 0) {
                move.add(num);
            }
        }

        // Overwrite the original array with non-zero elements
        for (int i = 0; i < move.size(); i++) {
            nums[i] = move.get(i);
        }

        // Fill the remaining positions with zeros
        for (int i = move.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // ***************Most Optimal Approch***************************
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeroOptimal(int arr[]) {
        int n = arr.length;
        int j = -1; // Pointer for the first zero found

        // Find the first zero position
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, return (array is already optimized)
        if (j == -1) {
            return;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++; // Move j to the next zero position
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 0, 3, 0, 2, 0, 4, 0 };

        // print:
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
