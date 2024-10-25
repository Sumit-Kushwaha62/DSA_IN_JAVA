package Arrays;

//<<<<<<<<<<<<<<<<<< Prefix Sum Approch >>>>>>>>>>>>>>>>>>>>>

class Max_SubarraySum {

    public static void MaxSubArraySum(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Create and calculate prefix array
        int prefix[] = new int[number.length];
        prefix[0] = number[0]; // Initialize the first element of the prefix array

        // Fill the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Iterate over all subarrays
        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;

                // Calculate currentSum using the prefix array
                if (start == 0) {
                    currentSum = prefix[end]; // If start is 0, the sum is just prefix[end]
                } else {
                    currentSum = prefix[end] - prefix[start - 1]; // Otherwise, subtract prefix[start - 1]
                }

                // Update maxSum if currentSum is larger
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        MaxSubArraySum(number);
    }
}