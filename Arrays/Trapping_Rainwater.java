
// package Arrays;

import java.util.*;
// Trapping rainwater is important question which is can ask same as in the interview 

// Minimum numbers of bars should be > 2
// Assending and Desending no water is trapped: 
// trapped water = (waterlevel - baslevel height)* width

public class Trapping_Rainwater {

    // Corner case if array is empty:
    public static int trappedRainwater(int height[]) {
        if (height == null || height.length == 0) {
            return 0;
        }

        // calculate left max boundary
        int n = height.length;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i], height[i - 1]);
        }
        // Calculate right max boundary

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i], height[i + 1]);
        }
        // loops for trapped water and waterlevel:

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + waterLevel - height[i];
        }

        // for (int i = 0; i < n; i++) {
        // totalTrapedwater += Math.min(leftmax[i], rightmax[i]) - height[i];

        // }

        return trappedWater;
    }

    public static int trapped(int height[]) {

        // calculate leftMax boundary:

        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate rightMax boundary:

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // calculate totel traped water:

        int totalTrapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            totalTrapedwater = totalTrapedwater + waterLevel - height[i];
        }

        return totalTrapedwater;

    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapped(height));

    }
}
