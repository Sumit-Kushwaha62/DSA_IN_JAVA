package Arrays;

public class Largest_in_array {

    public static int Largest(int number[]) {
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }

            if (smallest > number[i]) {
                smallest = number[i];
            }
        }

        System.out.println("smallest value is = " + smallest);
        System.out.println("The largest value is:" + Largest);
        // return Largest;
        return 1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int result = Largest(number);
    }
}
