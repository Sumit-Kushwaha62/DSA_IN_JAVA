package Arrays;
import java.util.*;

public class containsDuplicates {

    public static boolean CondtainsDuplicate(int arr[]){
        // Creat hashset to store integers:
        Set<Integer > intSet = new HashSet<>();

        // Iterate over each element
        for(int num: arr){
            // check the number in hashset

            if(intSet.contains(arr))
            return true;


            // Add the number to hashset:
            intSet.add(arr);

        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 3, 2, 7, 5 , 3};
    }
}
