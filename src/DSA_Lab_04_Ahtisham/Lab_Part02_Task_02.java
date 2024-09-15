package DSA_Lab_04_Ahtisham;

/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * The most significant bit is at the head of the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 * Example 2:
 * <p>
 * Input: head = [0]
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The Linked List is not empty.
 * Number of nodes will not exceed 30.
 * Each node's value is either 0 or 1.
 */


// Definition for singly-linked list.
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution1 {
    public int getDecimalValue(ListNode1 head) {
        int sum = 0;
        int count = -1;
        ListNode1 temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;

        while (temp != null) {
            sum += (int) ((Math.pow(2, count)) * temp.val);
            temp = temp.next;
            count--;
        }

        return sum;
    }
}

public class Lab_Part02_Task_02 {
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(0);
        head.next.next = new ListNode1(1);
        head.next.next.next = new ListNode1(0);
        head.next.next.next.next = new ListNode1(0);
        head.next.next.next.next.next = new ListNode1(1);
        head.next.next.next.next.next.next = new ListNode1(0);
        head.next.next.next.next.next.next.next = new ListNode1(1);
        head.next.next.next.next.next.next.next.next = new ListNode1(0);
        head.next.next.next.next.next.next.next.next.next = new ListNode1(1);
        int sum = new Solution1().getDecimalValue(head);
        System.out.println(sum);


    }
}
