//package Easy;

public class CheckArraySorted {

    public static boolean check(int arr[]) {
        int n = arr.length - 1;
        boolean accending = true;
        boolean deccending = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                accending = false;
            }
            if (arr[i]< arr[i + 1]) {
                deccending = false;
            }

        }
        return accending || deccending;
    }

 public static boolean test(int arr[]){
    int n = arr.length;
    boolean accending = true;
    boolean deccending = true;

    for(int i = 1; i<n; i++){
        if(arr[i] > arr[i-1]){
            accending  =  false;
        }
        if(arr[i] < arr[i-1]){
            deccending = false;
        }
    }
    return accending || deccending;
 }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7 };
        int arr1[] = { 9,8,7,6};
        int arr2[] = { 3,4,8,5,2,9};

        System.out.println(test(arr));
        System.out.println(test(arr1));
        System.out.println(test(arr2));
  
    }

}
