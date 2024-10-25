
package Arrays;

class Pairs_In_Array {

    public static void pairs(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + currentNumber + " , " + arr[j] + " )");
                totalpairs++;
            }

            System.out.println();
        }
        System.out.println("total paires is = " + totalpairs);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        pairs(arr);
    }
}
