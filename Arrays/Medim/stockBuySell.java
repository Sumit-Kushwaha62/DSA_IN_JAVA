public class stockBuySell {

    // Brute Force Approch:
    public static int stock(int prices[]) {

        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) { // Buying day
            for (int j = i + 1; j < n; j++) { // Selling day
                int profit = prices[j] - prices[i]; // Profit calculation
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    // Better approch using kadance algo:
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update minimum price
            maxProfit = Math.max(maxProfit, price - minPrice); // Calculate profit
        }
        return maxProfit;
    }

    // Two pointer Approch:
    public static int maxProfitTwoPointer(int[] prices) {
        int left = 0; // Buying day
        int right = 1; // Selling day
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right; // Move buying day forward
            }
            right++;
        }
        return maxProfit;
    }

    // Two pointer and Kandance both are have same complexity:

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
    }
}
