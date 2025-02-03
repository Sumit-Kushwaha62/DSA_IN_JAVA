

import java.util.*;


public class majorityElements {


// Brute Force Approch:

public static int majorityElement(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        int frequency = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == arr[i]) {
                frequency++;
            }
        }

        if (frequency > n / 2) {
            return arr[i];
        }
    }

    // If no majority element found
    return -1;
}


// Using for each loops:
public static int majorityElement1(int arr[]){
    int n = arr.length;
    

    for(int val: arr){
        int frequency = 0;
        for(int el : arr){
            if(el == val){
                frequency++;

            }
        }
        if(frequency > n/2){
            return val;
        }
    }
    return -1;
}

// <<<<<<<<<<<< Better Approach using sorting >>>>>>>>>>>>>




    public static int majorityElement3(int arr[]) {

        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Frequency count and find the majority element
        int freq = 1; // To count occurrences of the current element
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++; // Increment frequency if current element matches previous
            } else {
                freq = 1; // Reset frequency count for the new element
            }

            // Check if the current frequency exceeds n/2
            if (freq > n / 2) {
                return arr[i];
            }
        }

        // If no majority element is found
        return -1;
    }


//<<<<<<<<<< most optimal approch using Moore's Voting Algorithm >>>>>>>>>>> 


public static int majorityElement4(int arr[]){
    int freq = 0, ans = 0;

    for(int i = 0; i<arr.length; i++){
        if(freq == 0){
            ans = arr[i];
        } 
        if( arr[i] == ans){
            freq++;
        }
        else{
            freq--;
        }
    }
    

// if majority elments is not exit so this algo return a last value of arrya
// which is not right so tha we need to write validation code:

// Step 2: Verify the candidate
freq = 0; // Reset frequency to count occurrences of the candidate
for (int num : arr) {
    if (num == ans) {
        freq++;
    }
}

if (freq > arr.length / 2) {
    return ans; // Candidate is the majority element
}

return -1; // No majority element exists
}



    public static void main(String[] args) {
        int arr[] = { 1,2,2,1,1};
        System.out.println(majorityElement4(arr));
    }
}
