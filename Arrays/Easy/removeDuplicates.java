// package Easy;

public class removeDuplicates {

    public static int removeDuplicate(int[] nums) {

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];

            }

        }
        return i + 1;

    }

   public static int test(int nums[]){

    int n = nums.length; 
    int i = 0;

    for(int j = 0; j<n; j++){
        if(nums[i] != nums[j]){
             i++;
            nums[i] = nums[j];
           
        }

    }
return i+1;

   }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 3, 4, 4, 5 };

        System.out.println(removeDuplicate(nums));
        System.out.println();

        // System.out.println(test(nums));

        // Print elements:
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }

    }
}
