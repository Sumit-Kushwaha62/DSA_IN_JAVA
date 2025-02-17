package Library_Pracitce;

public class secondLargest {

    // <<<<<<<<<<<<<< Two Looops Approach: >>>>>>>>>>>>>>

    // Function to find the second largest element using two loops
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            // If the array has less than 2 elements, return -1
            return -1;
        }

        // Step 1: Find the largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 2: Find the second largest element
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                // arr[i] < largest && largest > secondLargest
                secondLargest = arr[i];
            }
        }

        // If no second largest is found, return -1
        // return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
        return secondLargest;
    }

    // Second largest using One loops:

    public static int largest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = { 12, 35, 1, 10, 34 };

        // Call the function and display the result
        // int result = findSecondLargest(arr);
        // System.out.println(result);

        System.out.println();

        int result = largest(arr);
        System.out.println(result);

    }
}
// boolean accending = true;
// boolean deccending = true;

// for(int i = 0; i<nums.length-1; i++){
// if(nums[i] > nums[i+1]){
// accending = false;
// }

// if(nums[i] < nums[i+1]){
// deccending = false;
// }
// }
// return accending || deccending;