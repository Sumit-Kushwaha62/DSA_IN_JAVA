import java.util.ArrayList;

public class Test {

    // optimal solution for rearrenge array:

    // public static int[] test(int nums[]) {
    // int n = nums.length;
    // int[] ans = new int[n]; // ✅ सही ढंग से ans[] ऐरे बनाना

    // int posIndex = 0, negIndex = 1;

    // for (int i = 0; i < n; i++) {
    // if (nums[i] < 0) {
    // if (negIndex < n) { // ✅ सीमा जांच (Boundary Check)
    // ans[negIndex] = nums[i];
    // negIndex += 2;
    // }
    // } else {
    // if (posIndex < n) { // ✅ सीमा जांच (Boundary Check)
    // ans[posIndex] = nums[i];
    // posIndex += 2;
    // }
    // }
    // }
    // return ans; // ✅ सही डेटा टाइप return कर रहे हैं
    // }

   

    public static int test(int arr[]) {
        int n = arr.length;

   
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5};

        System.out.println(test(arr));
        

        System.out.println("---------------");

        // print:

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
