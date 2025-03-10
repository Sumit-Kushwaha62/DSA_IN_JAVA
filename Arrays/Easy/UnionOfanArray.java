//package Easy; 

import java.util.*;

public class UnionOfanArray {

    // Brute forch approch

    public static void union(int arr1[], int arr2[]) {

        ArrayList<Integer> unionList = new ArrayList<>();
        // Add unique elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            if (!unionList.contains(arr1[i])) {
                unionList.add(arr1[i]);
            }
        }

        // Add unique elements from arr2
        for (int j = 0; j < arr2.length; j++) {
            if (!unionList.contains(arr2[j])) {
                unionList.add(arr2[j]);
            }
        }

        System.out.println("The Union is = " + unionList);

    }

    public static ArrayList<Integer> unionHash(int arr1[], int arr2[]) {

        Set<Integer> hm = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hm.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            hm.add(arr2[j]);
        }
        return new ArrayList<>(hm);

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 4, 5, 6, 7 };

        ArrayList<Integer> union = unionHash(arr1, arr2);
        System.out.println("The unions is = " + union);

    }
}
