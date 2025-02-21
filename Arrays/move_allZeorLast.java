// package Library_Pracitce;

public class move_allZeorLast {

    // <<<<<<<<<<<<<<<<< Optiamal approach using swapping >>>>>>>>>>>>>>>: 


    public static void moveZeros(int[] arr) {
        // find first 0th index:
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    // Other approch, move all zero in front and fill reimaning space with zero:

    public static void moveZero(int arr[]) {
        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeroIndex] = arr[i];
                zeroIndex++;
            }
        }

        while (zeroIndex < arr.length) {
            arr[zeroIndex] = 0;
            zeroIndex++;
        }
    }

    // <<<<<<<<< Most bruth forch approch which is temp arrays >>>>>>>>>>>>>>>>
    public static void moveZeros1(int[] arr) {
        int[] temp = new int[arr.length]; // Temporary array to store results
        int index = 0; // Index to track non-zero elements in temp

        // Step 1: Copy all non-zero elements to the temporary array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill the rest of the temp array with zeros
        while (index < arr.length) {
            temp[index] = 0;
            index++;
        }

        // Step 3: Copy the temporary array back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 8, 0, 9, 3, 0, 5, 6 };
        // System.out.println();
        moveZero(arr);
        print(arr);
    }
}
