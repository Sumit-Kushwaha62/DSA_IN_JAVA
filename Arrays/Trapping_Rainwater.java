
// Trapping rainwater is important question which is can ask same as in the interview 
// Minimum numbers of bars should be > 2
// Assending and Desending no water is trapped: 
// trapped water = (waterlevel - baslevel height)* width

public class Trapping_Rainwater {

    public static int trappedRainwater(int height[]) {
        // calculate left max boundary
        int n = height.length;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loops

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + waterLevel - height[i];
        }
        // waterLevel = min(leftmax bound, rightmax bound)
        // trapped water = waterLevel - height[i];

        return trappedWater;
    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trappedRainwater(height));
    }
}
