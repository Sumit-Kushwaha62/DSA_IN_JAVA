

public class firstOccurrence {

    public static int firstoccurrance(int arr[], int key, int i){
if(i == arr.length){
    return -1;

}
if(arr[i] == key){
    return i;
}
return firstoccurrance(arr, key, i+1);
    }

    public static void lastoccurrance(int arr[], int key, int i){


        
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4,5, 3, 8,9, 8};
        System.out.println(firstoccurrance(arr, 3, 0));
    }
}
