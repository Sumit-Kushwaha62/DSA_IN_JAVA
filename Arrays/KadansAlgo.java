package Arrays;

//***************** Kadans Algorithm ****************

class KadansAlgo {

    public static void kadance(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            /*
             * check that, ager currentSum big ho zero se to currentSum ko zero hi rahne do
             * negative mat karo
             * this code is return zero when all elements are negative in this case simpley
             * remove if constions
             * so it's return most negative value;
             */
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);

        }

        System.out.println("Our max subarray sum is:" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, 1, -2, -1, 5, -3 };
        kadance(arr);

    }
}
