//package Easy;

public class OccurrenceElements {

    public static void findOccurrence(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
System.out.println("Occurrenc index is  = "+ i);
            }
        }
        if(count == 0){

            System.out.println("No any such elements is found!");
        }


    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3, 2,5 ,2, 6, 2, 8,9, 2};
        int target = 2; 
        findOccurrence(arr, target);
    }
}
