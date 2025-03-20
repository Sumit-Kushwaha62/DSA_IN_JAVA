public class findNumAppearOnes {

    public static int find(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int appear(int arr[]) {
        int xor = 0;
        int n = arr.length;

        for (int num : arr) {
            xor = xor ^ num;

        }
        return xor;
    }

    public static int test(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int test1(int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 3, 4, 6, 7, 6, 7 };
        // System.out.println(find(arr));
        // System.out.println();
        // System.out.println(appear(arr));

       System.out.println(find(arr));
    }
}