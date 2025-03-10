public class sort_0_s_1_s {

    // Very brute forch approch to manualy over write values:
    public static void sort(int arr[]) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int n : arr) {
            if (n == 0) {
                count0++;
            } else if (n == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int index = 0;

        for (int a = 0; a < count0; a++) {
            arr[index++] = 0;
        }
        for (int b = 0; b < count1; b++) {
            arr[index++] = 1;
        }
        for (int c = 0; c < count2; c++) {
            arr[index++] = 2;
        }
    }

    // Optimal approch:

    public static void sort1(int arr[]) {
int low = 0, mid = 0, high = arr.length-1;

while (mid <= high) {
    
if(arr[mid] == 0){
    int temp = arr[low];
    arr[low] = arr[mid];
    arr[mid] = temp;
    low++;
    mid++;
}

else if(arr[mid] == 1){
mid++;

}else if(arr[mid] == 2) {
int temp = arr[mid];
arr[mid] = arr[high];
arr[high] = temp;
high--;
}


}
    }

    // print
    public static void print(int arr[]) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 2, 2, 1, 0, 1 };
      sort1(arr);
        print(arr);

    }
}
