package DSA_Lab01_Ahtisham;
//Lab Task 06: Palindrome
//A palindrome is a sequence of characters that reads the same forward and backward. In the context of strings, a palindrome is a word, phrase, or sequence that remains unchanged when its characters are reversed. For example, "madam" and "racecar" are palindromes, while "hello" is not.

import java.util.Scanner;

/**
 * Task: Given a string, check if it is a palindrome or not. A string is considered a palindrome if it reads the same forward and backward.
 * Hint: The string str is converted to a array of characters using the .toCharArray() method.
 * Input string: radar
 * Expected output: Palindrome

 * Input string: apple

 * Expected output: Not Palindrome
 */
public class Task_06_Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        int j = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(s + " not a Palindrome");
                return;
            }
            j++;
        }
        System.out.println(s + " is Palindrome");

    }
}
