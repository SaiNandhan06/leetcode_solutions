/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        if(curr == null || curr.next == null) return;
        curr.val = curr.next.val;
        curr.next = curr.next.next;
    }
}
