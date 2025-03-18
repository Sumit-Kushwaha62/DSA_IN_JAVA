public class stockSell_1 {

    public static int test(int arr[]){
        int n = arr.length;
        int maxProfit = 0;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void test1(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i<n/2; i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
    }
   
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 8, 5, 4, 5};

        System.out.println(test(arr));
    }
}















