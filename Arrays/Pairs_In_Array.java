// # Tested:

package Arrays;

class Pairs_In_Array {

    public static void pairs(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            // for case - 1 only
            // for (int j = 0; j < arr.length; j++) {
            // System.out.print("( " + currentNumber + " , " + arr[j] + " )");

            // for case - 2
            for (int j = 0; j < arr.length; j++) {
                System.out.print("( " + currentNumber + " , " + arr[j] + " )");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total paires is = " + totalpairs);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int arr[] ={ 1,2};
        System.out.println();
        pairs(arr);
    }
}
