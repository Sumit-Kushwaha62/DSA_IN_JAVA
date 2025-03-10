public class reverseNumber {

    public static int reverse(int number){

        boolean isNegative = number <0;
        number = Math.abs(number);


        int reversed = 0;
        while (number != 0) {
            int digit = number%10;
            reversed = reversed*10+digit;
            number = number/10;
        }

        return isNegative? -reversed: reversed;
    }

    public static void main(String[] args) {
        int number =  -2938763;
        System.out.println();
        System.out.println(reverse(number));
    }
}
