
package Arrays;

class ReverseInArray {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 7, 8, 98, 9 };

        System.out.println("Before reverse");
        print(arr);
        System.out.println();
        reverse(arr);
        System.out.println("After reverse");
        print(arr);
    }
}
