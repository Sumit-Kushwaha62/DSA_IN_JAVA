package Arrays;

// Using Arrays: 

// import java.util.Arrays;

// public class ChocolateDistribution {

//     public static int distribute(int[] chocolates, int n, int m) {
//         // Edge case: if there are fewer packets than the number of students
//         if (m > n) return -1;

//         // Sort the array to consider only consecutive packets
//         Arrays.sort(chocolates);

//         int minDifference = Integer.MAX_VALUE;

//         // Traverse the sorted array and find the minimum difference
//         for (int i = 0; i <= n - m; i++) {
//             int minElement = chocolates[i];
//             int maxElement = chocolates[i + m - 1];
//             minDifference = Math.min(minDifference, maxElement - minElement);
//         }
//         return minDifference;
//     }

//     public static void main(String[] args) {
//         int[] chocolates = {7, 3, 2, 4, 9, 12, 56};

//         int n = chocolates.length; // Number of packets
//         int m = 3; // Number of students

//         int result = distribute(chocolates, n, m);
//         System.out.println("Minimum difference is: " + result);
//     }
// }




// // <<<<<<<<<<<<<<<<<<<,-------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 // Using arraylist: 




import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {

    public static int distribute(ArrayList<Integer> chocolates, int n, int m) {
        // Edge case: if there are fewer packets than the number of students
        if (m > n) return -1;

        // Sort the list to consider only consecutive packets
        Collections.sort(chocolates);

        int minDifference = Integer.MAX_VALUE;

        // Traverse the sorted list and find the minimum difference
        for (int i = 0; i <= n - m; i++) {
            int minElement = chocolates.get(i);
            int maxElement = chocolates.get(i + m - 1);
            minDifference = Math.min(minDifference, maxElement - minElement);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        ArrayList<Integer> chocolates = new ArrayList<>();
        chocolates.add(7);
        chocolates.add(3);
        chocolates.add(2);
        chocolates.add(4);
        chocolates.add(9);
        chocolates.add(12);
        chocolates.add(56);

        int n = chocolates.size(); // Number of packets
        int m = 3; // Number of students

        int result = distribute(chocolates, n, m);
        System.out.println("Minimum difference is: " + result);
    }
}
