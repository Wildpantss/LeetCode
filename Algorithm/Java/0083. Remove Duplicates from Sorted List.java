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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;

        // traverse
        while (ptr != null) {
            // find next different node
            ListNode tmp = ptr.next;
            while (tmp != null && tmp.val == ptr.val) {
                tmp = tmp.next;
            }
            ptr.next = tmp;
            ptr = ptr.next;
        }
        return head;
    }
}