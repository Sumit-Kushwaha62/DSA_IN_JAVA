package Arrays;

//***************** Kadans Algorithm ****************

/*
             * check that, ager currentSum big ho zero se to currentSum ko zero hi rahne do
             * negative mat karo
             * this code is return zero when all elements are negative in this case simpley
             * remove if constions
             * so it's return most negative value;
             */

// # Tested:

class KadansAlgo {

    public static void kadance(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            /*
             * If all the element of arrays is negative in that condition this code is
             * return the zero as answer if we want most negative element as default so just
             * delete if condion
             * 
             */
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Our max subarray sum is:" + maxSum);
    }

    public static void test(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;

            }

            ms = Math.max(cs, ms);
        }
        System.out.println("Max is = " + ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, 1, -2, -1, 5, -3 };

        int arr1[] = { -2, -3, -4, -5 };
        test(arr1);
        // kadance(arr);
    }
}
