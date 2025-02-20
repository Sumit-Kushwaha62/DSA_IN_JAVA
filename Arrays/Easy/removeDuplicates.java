// package Easy;

public class removeDuplicates {

    public static int removeDuplicate(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }

        }
        return i + 1;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 4, 4, 5 };
        int arr[] = { 2, 2, 3, 3, 4, 4, 5, 5 };
       // System.out.println(removeDuplicate(nums));
        // Print elements:


        System.out.println();

        System.out.println();

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
