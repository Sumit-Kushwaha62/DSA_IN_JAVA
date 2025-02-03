package ArrayList;

import java.util.*;

class PairSum1 {

    /* Brute Force Approch for pair Sum-1 */

    public static boolean parisumEx(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println();
                    System.out.println("The target is exist: ");
                    return true;
                }
            }
        }
        System.out.println("Something is wrong! Target not exit:");
        return false;
    }

    // ***************** Optimized Approch *************

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;

    }

    /* Pair sum - 2 */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(parisumEx(list, target));
    }
}
