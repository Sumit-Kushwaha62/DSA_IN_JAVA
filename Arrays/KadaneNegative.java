// 


// <<<<<<<<<<< kadance when all values are of arrays is negative >>>>>>>> 
// It's return the largest and smllest negative vlaues of ararys: 




public class KadaneNegative {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -8, -6, -1};

        int[] result = kadaneForNegativeNumbers(arr);
        System.out.println("Largest negative value: " + result[0]);
        System.out.println("Smallest negative value: " + result[1]);
    }

    public static int[] kadaneForNegativeNumbers(int[] arr) {
        int maxNegative = arr[0]; // Largest negative (maximum subarray sum)
        int minNegative = arr[0]; // Smallest negative (minimum value in the array)
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Kadane's logic, but modified for negative numbers
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxNegative = Math.max(maxNegative, currentMax);

            // Track the smallest negative number
            minNegative = Math.min(minNegative, arr[i]);
        }

        return new int[]{maxNegative, minNegative};
    }
}






