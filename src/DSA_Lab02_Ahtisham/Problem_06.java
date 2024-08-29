package DSA_Lab02_Ahtisham;

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


public class Problem06 {
    public static int countPrimes(int n) {

        if (n < 2)
            return 0;

        int totalPrimes = 0;

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                totalPrimes++;

        }


        return totalPrimes;
    }

    public static void main(String[] args) {

        System.out.println(Problem06.countPrimes(20));


    }
}
