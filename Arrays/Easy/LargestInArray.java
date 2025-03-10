
package Easy;

public class LargestInArray {

    public static int largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

   

    public static void main(String[] args) {

        int arr[] = { 2, 3, 8, 9, 7, 10 };
    System.out.println(largest(arr));

    }
}
