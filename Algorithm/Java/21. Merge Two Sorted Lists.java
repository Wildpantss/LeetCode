/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // handle special case
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // main algorithm
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        ListNode res;
        if (l1.val < l2.val) {
            res = l1;
            l1 = l1.next;
        }
        else {
            res = l2;
            l2 = l2.next;
        }
        ListNode ptr3 = res;

        // traverse
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr3.next = l1;
                l1 = l1.next;
                ptr3 = ptr3.next;
            }
            else {
                ptr3.next = l2;
                l2 = l2.next;
                ptr3 = ptr3.next;
            }
        }

        // process the longer one's remainder
        if (l1 != null) ptr3.next = l1;
        else ptr3.next = l2;

        return res;
    }
}
