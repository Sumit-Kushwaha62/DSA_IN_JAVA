package ArrayList;
import java.util.*;
public class MostWater {

   // *********************Container with most water < Brute Force > ********* O(n^2)

    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;

    //     for(int i = 0; i<height.size(); i++){
    //         for(int j = i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }



// ***********Two pointer Approach***************O(n)

public static int storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0; 
    int rp = height.size() - 1;

    while(lp <= rp){
        // Calculate water area:
        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp - lp;
        int currentNumber = ht * width;
        maxWater = Math.max(maxWater, currentNumber);


        // update pointer

        if(height.get(lp) < height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
    return maxWater;
}




    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(storeWater(height));


    }
}



// ************ Into Arrys ******************

// public static int storeWater(int[] height) {
//     int maxWater = 0;
//     int lp = 0;
//     int rp = height.length - 1;

//     while (lp <= rp) {
//         // Calculate water area:
//         int ht = Math.min(height[lp], height[rp]);
//         int width = rp - lp;
//         int currentWater = ht * width;
//         maxWater = Math.max(maxWater, currentWater);

//         // update pointer
//         if (height[lp] < height[rp]) {
//             lp++;
//         } else {
//             rp--;
//         }
//     }
//     return maxWater;
// }
