

// public class OperationsOnArray {
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,0,8,4,2,4,5};

//         for(int i=0; i<arr.length; i++){
//          System.out.println(arr[i]);

//         }
//     }
// }





class Linear_search{

    public static int Search(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("key is found:"+arr[i]);
                return i;
            }
        }
        System.out.println("key is not found:");
        return -1;
        
    }
    public static void main(String[] args) {
       int arr[] ={ 3,4,5,7,6,8,9,7,1};
       int key = -1; 

       int result = Search(arr, key);
    }
}