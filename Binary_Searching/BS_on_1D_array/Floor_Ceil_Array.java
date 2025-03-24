public class Floor_Ceil_Array {

    public static int Floor(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans == -1 ? -1 : arr[ans]; // Return actual value or -1
    }

    public static int Ceil(int arr[], int target) {
        int n = arr.length;
        int ans = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans == -1 ? -1 : arr[ans]; // Return actual value or -1
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int target = 5;

        int[] result = new int[2]; // Declare an array for floor and ceil
        result[0] = Floor(arr, target);
        result[1] = Ceil(arr, target);

        System.out.println("The floor and ceil are: " + result[0] + " " + result[1]);
    }
}
