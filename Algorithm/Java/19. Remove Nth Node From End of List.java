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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        boolean flag = false;

        if (head.next == null && n == 1) return null;

        // 2 - ptr solution
        ListNode p1 = head;
        ListNode p2 = head;

        // find p2 pos
        for (int i = 0; i < n; ++i) {
            if (p2.next == null) {
                flag = true;
                break;
            }
            p2 = p2.next;
        }

        // 2 ptr moving
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        // remove p1 node (p1 at the node before target)
        if (flag == true) head = head.next;
        else {
            if (p1.next.next == null) p1.next = null;
            else {
                p1.next = p1.next.next;
            }
        }

        return head;
    }
}
