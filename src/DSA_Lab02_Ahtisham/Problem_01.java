package DSA_Lab02_Ahtisham;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 * Example 2:
 * <p>
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 * - ans = [1,3,2,1,1,3,2,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 1000
 * 1 <= nums[i] <= 1000
 */
public class Problem_01 {
    public static int[] getConcatenation(int[] nums) {
        int[] concatenatedArray = new int[nums.length * 2];

        for (int i = 0, j = nums.length; i < nums.length && j < concatenatedArray.length; i++, j++) {
            concatenatedArray[i] = nums[i];
            concatenatedArray[j] = nums[i];
        }

        return concatenatedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        int[] concatenatedArray = getConcatenation(array);
        for (int j : concatenatedArray) System.out.print(j + " ");
    }
}
