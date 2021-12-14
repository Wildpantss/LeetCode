/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0, bLength = 0;
        ListNode pa = headA, pb = headB;
        while (pa != null) {
            aLength ++;
            pa = pa.next;
        }
        while (pb != null) {
            bLength ++;
            pb = pb.next;
        }
        // now got a,b's length
        pa = headA; pb = headB;
        if (aLength > bLength) for (int i = 0; i < aLength - bLength; ++i) pa = pa.next;
        if (aLength < bLength) for (int i = 0; i < bLength - aLength; ++i) pb = pb.next;

        while (pa != null && pb != null) {
            if (pa == pb) return pa;
            pa = pa.next;
            pb = pb.next;
        }
        // if not found
        return null;
    }
}
