package DSA_Lab_05_Ahtisham;

import java.util.Stack;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * Example 1:
 * <p>
 * Input: head = [1,2,2,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: head = [1,2]
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 * <p>
 * Follow up: Could you do it in O(n) time and O(1) space?
 */

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            if (!stack.empty() && stack.pop() != curr.val)
                return false;
            curr = curr.next;
        }

        return true;
    }
}

public class Part_03_Task_02 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(new Solution().isPalindrome(head));
    }
}
