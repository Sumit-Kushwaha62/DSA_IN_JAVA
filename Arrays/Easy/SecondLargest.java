//package Easy;

public class SecondLargest {

    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length - 1;
        int secondlargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargest && arr[i] != max) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    // Using one loop:
    public static int secondlargest1(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length - 1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > largest && arr[i] < secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 8, 9, 7 };

    }
}
