
// Trapping rainwater is important question which is can ask same as in the interview 
// Minimum numbers of bars should be > 2
// Assending and Desending no water is trapped: 
// trapped water = (waterlevel - baslevel height)* width

// public class Trapping_Rainwater {

//     public static int trappedRainwater(int height[]) {
//         // calculate left max boundary
//         int n = height.length;
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for (int i = 1; i < height.length; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
//         // Calculate right max boundary

//         int rightMax[] = new int[height.length];
//         rightMax[height.length - 1] = height[height.length - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }
//         // loops

//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater = trappedWater + waterLevel - height[i];
//         }
//         // waterLevel = min(leftmax bound, rightmax bound)
//         // trapped water = waterLevel - height[i];

//         return trappedWater;
//     }

//     public static void main(String[] args) {

//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };

//         System.out.println(trappedRainwater(height));
//     }
// }

// ***************************************

// public class TrappingRainWater {
// public static int trap(int[] height) {
// if (height == null || height.length == 0) return 0;

// int n = height.length;
// int[] leftMax = new int[n];
// int[] rightMax = new int[n];
// int waterTrapped = 0;

// // Fill leftMax array
// leftMax[0] = height[0];
// for (int i = 1; i < n; i++) {
// leftMax[i] = Math.max(leftMax[i - 1], height[i]);
// }

// // Fill rightMax array
// rightMax[n - 1] = height[n - 1];
// for (int i = n - 2; i >= 0; i--) {
// rightMax[i] = Math.max(rightMax[i + 1], height[i]);
// }

// // Calculate the trapped water
// for (int i = 0; i < n; i++) {
// waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
// }

// return waterTrapped;
// }

// public static void main(String[] args) {
// int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
// System.out.println("Water trapped: " + trap(height)); // Output: 6
// }
// }

class Trapping_Rainwater {

    public static int trappedRainwater(int height[]) {

        if (height == null || height.length == 0) {
            return 0;
        }

        // basic terminologys

        int n = height.length;

        int totalTrapedwater = 0;

        // Calculting leftmax boundary:

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {

            leftmax[i] = Math.max(height[i], leftmax[i - 1]);

        }

        // Calculating rightmax boundary:

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);

        }








        // Calculation total water:

        for (int i = 0; i < n; i++) {
            totalTrapedwater += Math.min(leftmax[i], rightmax[i]) - height[i];

        }

        return totalTrapedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trappedRainwater(height));
    }
}





// class Trapping_Rainwater {

//     public static int trappedRainwater(int height[]) {

//         if (height == null || height.length == 0) {
//             return 0;
//         }

//         // Basic terminologies
//         int n = height.length;
//         int totalTrapedwater = 0;

//         // Calculating leftmax boundary:
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];  // Initialize the first element
//         for (int i = 1; i < n; i++) {  // Change `<=` to `<` to avoid ArrayIndexOutOfBounds
//             leftmax[i] = Math.max(height[i], leftmax[i - 1]);
//         }

//         // Calculating rightmax boundary:
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = height[n - 1];  // Initialize the last element
//         for (int i = n - 2; i >= 0; i--) {  // Iterate correctly from `n-2` down to `0`
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//         }

//         // Calculate total trapped water:
//         for (int i = 0; i < n; i++) {
//             totalTrapedwater += Math.min(leftmax[i], rightmax[i]) - height[i];  // Fix subtraction
//         }

//         return totalTrapedwater;
//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(trappedRainwater(height));  // Should print the trapped water
//     }
// }







