//package Easy;

import java.util.*;

public class findMissingNumber {

    // The brute forch approch using nested loops:
    public static int find(int arr[]) {
        for (int i = 1; i < arr.length + 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    } // T & S - O(n):

    // Better approch: using hashing:
    public static int find1(int arr[]) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 1; i < arr.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }// T & S - O(n):

    // Better approch using sorting
    public static int find2(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    } // T - O(nlogn), S - O(1):

    // Optimal approch using Sum method:

    public static int find4(int arr[]) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i];

        }
        return sum - res;
    }// T O(n), S O(1):

    // Optimal approch using XOR method:

    public static int find5(int arr[]) {
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            xor = xor ^ i + 1;
        }

        xor = xor ^ n + 1;
        return xor;
    }

    public static int test(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n + 1; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                return i;
            }

        }
        return -1;
    }

    public static int test1(int arr[]) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];

        }
        return sum - result;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };

        // System.out.println();
        // System.out.println(find5(arr));

        System.out.println(test(arr));

        System.out.println(test1(arr));

        System.out.println(find4(arr));

    }
}
