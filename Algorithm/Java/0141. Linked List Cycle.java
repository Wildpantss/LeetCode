/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head; // 1step each time
        ListNode p2 = head; // 2step each time
        
        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
            if (p2 == null) return false;
            else if (p2.next != null) {
                p2 = p2.next;
            }
            else return false;

            if (p1 == p2) return true;
        }
        return false;
    }
}
