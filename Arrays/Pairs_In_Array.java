package Arrays;

public class Pairs_In_Array {

    public static void ArraysPair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i]; // 1,2,3,4,5,6,7,8
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + currentNumber + " , " + number[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs of arrays is: = " + tp);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        ArraysPair(number);
    }
}









