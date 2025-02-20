class Test {

// Left and Right rotate an arrays: 

public static void  rotate(int arr[], int start, int end){

    while (start < end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end ] = temp;
start++;
end--;
    }
}

public static void RotateByPlace(int arr[], int k){

    int n = arr.length;
    k = k%n;
    rotate(arr, 0, n-1);
    rotate(arr, 0, k-1);
    rotate(arr, k, n-1);
}

// print stetments:

public static void print(int arr[]){
    for(int i = 0; i<arr.length; i++){

    
    System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6 };
        int k = 3; // Number of rotations


        print(arr);
        RotateByPlace(arr, k);
        System.out.println();
        print(arr);

    }
}