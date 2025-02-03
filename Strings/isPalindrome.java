// package Strings;

import java.util.*;

public class isPalindrome {
    public static boolean palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void palindrom1(String str) {
        int left = 0, right = str.length() - 1;
    
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("It's a palindrome");
    }
    

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrom(str));
        System.out.println();
        palindrom1(str);

    }
}
