import java.util.ArrayList;

public class Test {

    // Print arrays:
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static int test(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 1, 1, 1, 4 };

        System.out.println(test(arr));

        System.out.println("---------------");

    }
}
