//package Easy;

public class RotateArrayByOne {

    public static int rotate(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        return arr[arr.length - 1] = temp;
    }

    // print
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // for last value rotation:
    public static int test(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        return arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };

        test(arr);
        System.out.println();
        print(arr);

    }
}
