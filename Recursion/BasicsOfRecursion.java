// package Recursion;
/* Recursion is a method of solving a computational problem where the solution
depends on solutions to smaller instances of the same problem= */

public class BasicsOfRecursion {

    public static void decrease(int n){
        if(n == 0 ){
            return;
        }
         decrease(n-1);
        System.out.println(n+" ");
       
    }


    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fn = factorial(n-1);
        int fn1 = n * fn;
        return fn1;
    }


    public static int naturalNumbers(int n){
        if(n == 1){
            return 1;
        }

        int sum = naturalNumbers(n-1);
        int w = n+ sum;
        return w;

    }
    public static void main(String[] args) {
       
        System.out.println( naturalNumbers(5));
    }
}
