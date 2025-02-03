package Strings;

public class removeOccurences {

    public static void remove(String str1, char c){
       
        str1 = str1.replace(String.valueOf(c), " ");
System.out.println(str1);
    }







    public static void main(String[] args) {
        String str = "sdkedksjekdcdd";
 String str1 = "abcabcababacccababc";
        char c = 'a';
System.out.println();
        remove(str1 , c);
    }
}
