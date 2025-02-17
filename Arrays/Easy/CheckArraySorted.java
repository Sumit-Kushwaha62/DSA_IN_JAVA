// package Easy;

public class CheckArraySorted {

    public static boolean check(int arr[]) {
        int n = arr.length - 1;
        boolean accending = true;
        boolean deccending = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                accending = false;
            }
            if (arr[i]> arr[i + 1]) {
                deccending = false;
            }

        }
        return accending || deccending;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7 };
        System.out.println(check(arr));
    }

}
