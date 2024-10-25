package Arrays;

public class BestTime_StockBuySell {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // calculate profit and update in butPrice variable:
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;

                // update maximum profit which is bigger
                maxProfit = Math.max(maxProfit, profit);

                // If profit is not gating then update buy price by current index value
            } else {
                buyPrice = prices[i];

            }
        }
        System.out.println("maximum profit day is = " + maxProfit);
        System.out.println("Best day for buy stock = " + buyPrice);
        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));

    }
}
