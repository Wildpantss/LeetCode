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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ptrs
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode();
        ListNode p3 = res; 

        int remainder = 0;

        // process header
        remainder = (p1.val + p2.val) / 10;
        res.val = (p1.val + p2.val) % 10;
        p1 = p1.next;
        p2 = p2.next;

        // traverse
        while (p1 != null && p2 != null) {
            p3.next = new ListNode((p1.val + p2.val + remainder) % 10);
            remainder = (p1.val + p2.val + remainder) / 10;
            p1 = p1.next;
            p2 = p2.next;
            p3 = p3.next;
        }

        // the shorter one has been traversed, but the other has remainders.
        while (p1 != null) {
            // process p1 tails
            p3.next = new ListNode((p1.val + remainder) % 10);
            remainder = (p1.val + remainder) / 10;
            p1 = p1.next;
            p3 = p3.next;
        }
        while (p2 != null) {
            // process p2 tails
            p3.next = new ListNode((p2.val + remainder) % 10);
            remainder = (p2.val + remainder) / 10;
            p2 = p2.next;
            p3 = p3.next;
        }
        
        // last remainder
        if (remainder != 0) {
            p3.next = new ListNode(remainder);
        }

        return res;
    }
}