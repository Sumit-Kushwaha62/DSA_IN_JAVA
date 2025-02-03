package Arrays;

// /* You have a array and a target integer check which paire  of arrays is equal to target integer if not avalible so return -1; */

public class twoSum {

    public static boolean pairSum(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {

                return true;

            } else if (sum > target) {
                right--;
            }

            else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        int target = 10;
        System.out.println(pairSum(arr, target));

    }
}

// public class twoSum {

// public static boolean pairSum(int arr[], int target) {

// int left = 0, right = arr.length - 1;

// while (left < right) {
// int sum = arr[left] + arr[right];

// if (sum == target) {
// return true; // Pair found
// } else if (sum > target) {
// right--; // Decrease the right pointer to reduce the sum
// } else {
// left++; // Increase the left pointer to increase the sum
// }
// }
// return false; // No pair found
// }

// public static void main(String[] args) {
// int arr[] = {2, 3, 4, 5, 9, 8, 4};
// int target = 10;
// System.out.println(pairSum(arr, target)); // Should print true or false
// }
// }
