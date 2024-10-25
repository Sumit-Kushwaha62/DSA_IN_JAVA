package Sorting;

// public class Insertion_Sort {

//     public static void Insertion_Sort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;

//             // finding out the correct possition to insert:
//             while (prev >= 0 && arr[prev] > arr[curr]) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // Insertion
//             arr[prev + 1] = arr[curr];
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 4, 5, 3, 0, 2, 3 };

//     }
// }

class Insertion_Sort {
    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            int current = arr[i];
            int previes = i - 1;

            while (previes >= 0 && arr[previes] > current) {
                arr[previes + 1] = arr[previes];
                previes--;
            }
            arr[previes+1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 4, 0, 9 };
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
