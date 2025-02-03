package Sorting;

public class CountingSort {

    public static void countinSort(int arr[]){
        // Find largest
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
int count[] = new int [largest];
for(int i = 0; i<arr.length; i++){
    count[arr[i]]++;
}

// Sorting
int j = 0;
for(int i = 0; i<count.length; i++){
    while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
    }
}




    }
    public static void main(String[] args) {
        countinSort(null);
    }
    
}
