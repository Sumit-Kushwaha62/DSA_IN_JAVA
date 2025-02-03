package Sorting;

public class mergeSort {


    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int si, int ei){
int mid = si + (ei - si)/2;
merge(arr, si, mid);
merge(arr, mid, ei);
merge1(arr, si, mid, ei);




    }

    public static void merge1(int arr[], int si, int ei){
        int temp[] = new int[ei - si +1];

        int i = si; 
        int j = mid+1; 
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++; k++;

            }else{
                temp[k] =  arr[j];
                j++; 
            }
            k++;
        }
        while (i<= mid) {
            temp[k++] = arr[i++];
        }

        while (j<= ei) {
           temp[k++] = arr[j++]; 
        }

        for(k = 0; k<temp.length; k++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3,4, 8, 5, 0, 8, 9};
        merge(arr, 0, arr.length-1);
    }
}
