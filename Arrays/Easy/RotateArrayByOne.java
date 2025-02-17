package Easy;

public class RotateArrayByOne {

    public static int rotate(int arr[]){
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
         return arr[arr.length -1] = temp;
    }

    // print
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6};
        System.out.println(rotate(arr));
        print(arr);
    }
}
