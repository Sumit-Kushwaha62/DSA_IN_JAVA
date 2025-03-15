//package Easy;

public class maximumConsecutive {
    public static int max(int arr[]) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static int test(int arr[]) {
        int n = arr.length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 1, 1, 1, 2, 0, 1, 1 };
        System.out.println(test(arr));
        System.out.println(max(arr));
    }
}
