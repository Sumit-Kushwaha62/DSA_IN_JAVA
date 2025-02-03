// # Tested: 

package Arrays;

class Print_Subarray {

    public static void Subarrays(int arr[]) {
        int TotalSubarrays = 0;

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                TotalSubarrays++;
            }

            System.out.println();
        }
        System.out.println(TotalSubarrays);
    }

    public static void main(String[] args) {
        int arr2[] = { 1, 2, 3, 4 };
        int arr[] = { 2, 4, 6, 8, 10 };
        System.out.println();

        Subarrays(arr);
    }
}

/*
 * Total Subarrays=
 * 
 * n×(n+1)/ 2
 * ​
 * 
 * 
 */