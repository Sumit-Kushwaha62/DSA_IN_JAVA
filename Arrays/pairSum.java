public class pairSum {
    // Brute Force:
    public static boolean pairSum1(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }

            }

        }
        return false;
    }

    // Optimal approch using 2 pointer:

    public static boolean pairSumOpt(int arr[], int target) {

        int lp = 0;
        int rp = arr.length - 1;
        while (lp < rp) {
            if (arr[lp] + arr[rp] == target) {
                return true;
            }
            if (arr[lp] + arr[rp] < target) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }

    /*
     * Brute force solution is same as pairsum for pairsum2 , so now talk abute
     * opitimal approch
     * Statement = pairsum where arrays is sorted and rotaited;
     */
    public static boolean PairSum2(int arr[], int target) {

        int bp = -1;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {// breaking point;
                bp = i;
                break;

            }
        }
        int lp = bp + 1; // smallest
        int rp = bp;// largest

        while (lp != rp) {
            if (arr[lp] + arr[rp] == target) {
                return true;
            }
            if (arr[lp] + arr[rp] < target) {
                lp = (lp + 1) % n;

            } else {
                rp = (n + rp - 1) % n;

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int list[] = { 1, 2, 3, 4, 5, 6 };
        int arr[] = { 11, 15, 6, 8, 9, 10 };

        int target = 100;
        System.out.println(PairSum2(arr, target));

    }
}
