//package DSA_Practice.Arrays.Medim;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    // Brute force approch:
    public static int sum(int arr[], int target) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The values exit on index " + i + " " + " " + j);
                    return arr[i] + arr[j];

                }
            }
        }
        return -1;
    }

    // Better Approch:

    public static int sum1(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        Arrays.sort(arr);
        while (start < end) {

            if (arr[start] + arr[end] == target) {
                System.out.println(" The values exit on  = " + start + " " + end);
                return arr[start] + arr[end];
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return -1;
    }

    // Most Optimal approch is Hashing:

    public static int[] twosum(int arr[], int target) {
        Map<Integer, Integer> sort = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int second = target - arr[i];
            if (sort.containsKey(second)) {
                return new int[] { sort.get(second), i };
            }
            sort.put(arr[i], i);
        }
        throw new IllegalArgumentException("no found");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 2, 9, 7, 2 };
        int target = 10;
        System.out.println(Arrays.toString(twosum(arr, target)));

        System.out.println("---------------");

        System.out.println(sum1(arr, target));
    }

}
