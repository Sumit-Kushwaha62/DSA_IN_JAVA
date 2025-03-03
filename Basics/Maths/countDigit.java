
class countDigit {

    public static int countdigit(int N) {
    int res = 0;

    while (N > 0) {
    N = N / 10;
    res++;
    }

    return res;

    }

    // public static int countdigit(int N) {
    //     int res = 0;

    //     while (N > 0) {
    //         res = N / 10;
    //         res++;

    //     }
    //     return res;

    // }

    public static void main(String[] args) {
        int N = 233453;
System.out.println(countdigit(N));
System.out.println("Test");
      
    }
}
