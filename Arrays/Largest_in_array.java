
package Arrays;

class Largest_in_array {

    public static void largest(int arr[]) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }

            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("smallest key is = " + smallest);
        System.out.println("largest key is = " + largest);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 8, 8, 9 };
        largest(arr);

    }
}
