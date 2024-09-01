package DSA_Lab02_Ahtisham;


import java.util.Arrays;

/**
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * Example 2:
 * <p>
 * Input: n = 0
 * Output: 0
 * Example 3:
 * <p>
 * Input: n = 1
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 5 * 106
 */
public class Problem_06 {
    public static int countPrimes(int n) {
        if (n <= 2)
            return 0;

        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime, true);

        int count = 0;
        for (int i = 2; (i * i) < n; i++) {
            if (isPrime[i]) {
                for (int j = i; (j * i) < n; j++) {
                    isPrime[j * i] = false;
                }
            }
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i])
                count++;
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
