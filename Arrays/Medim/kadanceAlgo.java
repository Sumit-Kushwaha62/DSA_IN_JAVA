public class kadanceAlgo {

    public static int maxSum(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    max = Math.max(sum, max);
                }
            }

        }
        return max;
    }

    // Better solution:
    public static int maxSum1(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    // Most optimal approch:
    public static int maxSum3(int arr[]) {
        

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        max = Math.max(sum, max);

        if (sum < 0) {
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 9, -4, 5, -1, -1, 7 };
        System.out.println(maxSum1(arr));

    }
}
