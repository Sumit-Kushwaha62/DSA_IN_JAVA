
package Arrays;
//<<<<<<<<<<<<<<<<<<  Max SubArray   Brute Force   >>>>>>>>>>>>>>>>>>>

public class Maximum_SubarraySum_BruteForce {

    public static void maxSubArraySum(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {

                    currentSum += number[k];

                }

                System.out.println(currentSum);

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }
        }
        System.out.print("Maximum sum: = " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        maxSubArraySum(arr);
    }

}
