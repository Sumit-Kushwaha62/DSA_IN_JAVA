package Arrays;



//<<<<<<<<<<<<<< Print Subarray >>>>>>>>>>>>>>>>>>>>>>>

// public class Print_Subarrays {

//     public static void printSubarrays(int number[]) {
//         int ts = 0;
//         for (int i = 0; i < number.length; i++) {
//             int start = i;
//             for (int j = i; j < number.length; j++) {
//                 int end = j;

//                 for (int k = start; k <= end; k++) {
//                     System.out.print(number[k] + " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
// System.out.println();
//         }
//         System.out.println("Total subarrays: = " + ts);
//     }

//     public static void main(String[] args) {
//         int number[] = { 2, 4, 6, 8, 10 };
//         printSubarrays(number);
//     }
// }

// package Arrays;

//<<<<<<<<<<<<<<<<<<  Max SubArray   Brute Force   >>>>>>>>>>>>>>>>>>>

// public class Max_SubarraySum {

//     public static void maxSubArraySum(int number[]){
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0; i<number.length; i++){
//             int start = i;
//             for(int j=i; j<number.length; j++){
//                 int end = j;
//                 currentSum = 0;
//                 for(int k= start; k<=end; k++){
//                   currentSum += number[k];  
//                 }
//                 System.out.println(currentSum);
//                 if(maxSum < currentSum){
//                     maxSum = currentSum;
//                 }
//             }
//         }
// System.out.println("Maximum sum: = " +maxSum);

//     }
//     public static void main(String[] args) {
//         int number[] = {2,4,6,8,10};

//         // int number[] = {1, -2, 6, -1, 3};
//         maxSubArraySum(number);
//     }
// }

//<<<<<<<<<<<<<<<<<< Prefix Sum Approch >>>>>>>>>>>>>>>>>>>>>

// class Max_SubarraySum {

//     public static void MaxSubArraySum(int number[]){
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         // Create and calculate prefix array
//         int prefix[] = new int[number.length];
//         prefix[0] = number[0];  // Initialize the first element of the prefix array

//         // Fill the prefix array
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + number[i];
//         }

//         // Iterate over all subarrays
//         for (int i = 0; i < number.length; i++) {
//             int start = i;

//             for (int j = i; j < number.length; j++) {
//                 int end = j;

//                 // Calculate currentSum using the prefix array
//                 if (start == 0) {
//                     currentSum = prefix[end];  // If start is 0, the sum is just prefix[end]
//                 } else {
//                     currentSum = prefix[end] - prefix[start - 1];  // Otherwise, subtract prefix[start - 1]
//                 }

//                 // Update maxSum if currentSum is larger
//                 if (maxSum < currentSum) {
//                     maxSum = currentSum;
//                 }
//             }
//         }

//         System.out.println("Max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         int number[] = {1, -2, 6, -1, 3};
//         MaxSubArraySum(number);
//     }
// }

//<<<<<<<<<<<< Using Kadane's Algorithm >>>>>>>>>>>>>>>

class Max_SubarraySum {

    public static void kadanesAlgo(int numbers[]) {

        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];

            if (currentSum < 0) {
                currentSum = 0;
            }
            maximumSum = Math.max(currentSum, maximumSum);

            for (int k = 1; k < numbers.length; k++) {

                currentSum = Math.max(numbers[i], maxSum);

                maxSum = Math.max(maxSum, currentSum);
            }

        }

        System.out.println("Our maximux subarray sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        kadanesAlgo(numbers);
    }
}
