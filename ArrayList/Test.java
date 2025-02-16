
public class Test {

    public static int Container(int arr[]) {
        int maxWater = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int ht = Math.min(arr[i], arr[j]);
                int width = j - i;
                int currWater = ht * width;

                maxWater = Math.max(maxWater, currWater);
            }

        }
        return maxWater;
    }

    public static int mostWater(int arr[]) {
        int maxWater = 0;
        int lp = 0;
        int rp = arr.length - 1;

        while (lp <= rp) {
            // area
            int height = Math.min(arr[lp], arr[rp]);
            int width = rp - lp;
            int currentwater = height * width;
            maxWater = Math.max(maxWater, currentwater);

            // update
            if (arr[lp] < arr[rp]) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 4, 9, 9 };
        int arr[] = { 2, 1, 8, 6, 4, 6, 5, 5 };
        System.out.println(mostWater(arr));

    }
}
