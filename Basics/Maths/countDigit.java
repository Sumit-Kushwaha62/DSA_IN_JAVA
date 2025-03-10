public class countDigit {

    public static int countnumber(int number) {
        int result = 0;

        while (number > 0) {
            result = number / 10;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 293842;
        System.out.println(countnumber(number));
        System.out.println("Test");
    }
}
