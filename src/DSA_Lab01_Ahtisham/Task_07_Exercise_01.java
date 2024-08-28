package DSA_Lab01_Ahtisham;
//Lab Task 07: Anagram Check

/**
 * Given two strings, determine if they are anagrams of each other. Two strings are considered anagrams if they contain the same characters in the same frequencies but possibly in a different order.
 * Input:
 * str1 = "listen"
 * str2 = "silent"
 * <p>
 * Expected output:
 * Anagram
 * <p>
 * Input string:
 * str1 = "hello"
 * str2 = "world"
 * <p>
 * Expected output:
 * Not Anagram
 */
public class Task_07_Exercise_01 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not a Anagram");
            return;
        }

        char temp1 = ' ';
        char temp2 = ' ';
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1.length - 1; j++) {

                if (c1[j] > c1[j + 1]) {
                    temp1 = c1[j];
                    c1[j] = c1[j + 1];
                    c1[j + 1] = temp1;
                }
                if (c2[j] > c2[j + 1]) {
                    temp2 = c2[j];
                    c2[j] = c2[j + 1];
                    c2[j + 1] = temp2;
                }
            }
        }


        for (int i = 0; i < c2.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println(s1 + " and " + s2 + " are not an Anagrams");
                return;
            }
        }
        System.out.println(s1 + " and " + s2 + " are Anagrams");

    }
}
