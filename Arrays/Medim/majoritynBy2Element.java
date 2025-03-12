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

// Better approch using, Use only if you get all the element is unique:
    public static int majorityElement1(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            // Check if this element is the majority element
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 2, 8, 7, 6, 2 };
        System.out.println(majorityElement(arr));

    }
}
