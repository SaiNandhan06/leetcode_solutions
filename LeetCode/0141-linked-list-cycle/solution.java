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
        if(head == null || head.next == null){
            return false;
        }
        ListNode value1x = head;
        ListNode value2x = head;

        while(value2x != null && value2x.next != null){
            value1x = value1x.next;
            value2x = value2x.next.next;

            if(value1x == value2x) return true;
        }
        return false;
    }
}
