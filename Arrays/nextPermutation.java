
import java.util.*;

public class nextPermutation {

    
        public static void nextPermutation(int[] nums) {
            
            // Step 1: Find the first decreasing element from the end
            int n = nums.length, pivot = -1;
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    pivot = i;
                    break;
                }
            }
    
            // Step 2: If no such element is found, reverse the array (last permutation case)
            if (pivot == -1) {
                reverse(nums, 0, n - 1);
                return;
            }
    
            // Step 3: Find the smallest element larger than nums[pivot] to the right of pivot
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    // Step 4: Swap the pivot with this element
                    swap(nums, i, pivot);
                    break;
                }
            }
    
            // Step 5: Reverse the elements to the right of the pivot
            reverse(nums, pivot + 1, n - 1);
        }
    
        // Helper method to swap two elements in the array
        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
        // Helper method to reverse a portion of the array
        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            System.out.println("Before: " + Arrays.toString(nums));
            nextPermutation(nums);
            System.out.println("After:  " + Arrays.toString(nums));
        }
    }
    
    