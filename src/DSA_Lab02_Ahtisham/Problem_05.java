package DSA_Lab02_Ahtisham;

/**
 * You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
 * <p>
 * answer1 : the number of indices i such that nums1[i] exists in nums2.
 * answer2 : the number of indices i such that nums2[i] exists in nums1.
 * Return [answer1,answer2].
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [2,3,2], nums2 = [1,2]
 * <p>
 * Output: [2,1]
 * <p>
 * Explanation:
 * <p>
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
 * <p>
 * Output: [3,4]
 * <p>
 * Explanation:
 * <p>
 * The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.
 * <p>
 * The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.
 * <p>
 * Example 3:
 * <p>
 * Input: nums1 = [3,4,2,3], nums2 = [1,5]
 * <p>
 * Output: [0,0]
 * <p>
 * Explanation:
 * <p>
 * No numbers are common between nums1 and nums2, so answer is [0,0].
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums1.length
 * m == nums2.length
 * 1 <= n, m <= 100
 * 1 <= nums1[i], nums2[i] <= 100
 */
public class Problem_05 {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0, ans2 = 0;
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    ans1++;
                    break;
                }
            }
        }
        for (int k : nums2) {
            for (int i : nums1) {
                if (k == i) {
                    ans2++;
                    break;
                }
            }
        }
        return new int[]{ans1, ans2};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};
        int[] result = findIntersectionValues(nums1, nums2);

        for (int j : result) {
            System.out.print(j + " ");
        }
    }

}
