import java.util.HashMap;

public class majoritynBy2Element {

    // Brute force approch:
    public static int majorityElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > n / 2) {
                return arr[i];
            }

        }

        return -1;
    }

    // <<<<<<<<<< most optimal approch using Moore's Voting Algorithm >>>>>>>>>>>

    public static int majorityElement4(int arr[]) {
        int freq = 0, ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
            }
            if (arr[i] == ans) {
                freq++;
            } else {
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
        int arr[] = { 3, 2, 2, 2, 8, 7, 6, 2 };
        System.out.println(majorityElement(arr));

    }
}
