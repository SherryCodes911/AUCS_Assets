package DSA_Lab03_Ahtisham;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * <p>
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * <p>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */


// Definition for singly-linked list.
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution2 {
    public static ListNode2 mergeTwoLists(ListNode2 list1, ListNode2 list2) {
        ListNode2 dummy = new ListNode2();
        ListNode2 cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;



    }

    static void printList(ListNode2 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class Lab_Part_02_Task_03 {
    public static void main(String[] args) {
        ListNode2 list1 = new ListNode2(1);
        list1.next = new ListNode2(2);
        list1.next.next = new ListNode2(4);


        ListNode2 list2 = new ListNode2(1);
        list2.next = new ListNode2(3);
        list2.next.next = new ListNode2(4);

        Solution2.printList(list1);
        Solution2.printList(list2);

        ListNode2 list3 = Solution2.mergeTwoLists(list1, list2);

        Solution2.printList(list3);

    }
}
