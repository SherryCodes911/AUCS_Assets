package DSA_Lab03_Ahtisham;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */

//  Definition for singly-linked list.
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode currentNode = head;
        ListNode matchNode = currentNode;
        ListNode secondNode = currentNode;
        while (currentNode.next != null && secondNode != null) {
            if (matchNode.val == secondNode.val) {
                currentNode.next = secondNode.next;
                secondNode = secondNode.next;
            } else {
                currentNode = currentNode.next;
                matchNode = currentNode;
            }
        }

        return head;
    }

    void traverse(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class Lab_Part_02_Task_02 {
    public static void main(String[] args) {
        Solution list = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next = new ListNode(0);

        list.traverse(head);
        head = list.deleteDuplicates(head);
        list.traverse(head);

    }
}
