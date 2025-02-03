public class stockBuy {

    public static int stockBuy_Sell(int arr[]){
        int maxProfit = 0, bestBuy = arr[0];

        for(int i = 1; i<arr.length; i++){
if(arr[i] > bestBuy){
maxProfit = Math.max(maxProfit, arr[i] - bestBuy);
}

bestBuy = Math.min(bestBuy , arr[i]);

        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stockBuy_Sell( prices));
        
    }
}
