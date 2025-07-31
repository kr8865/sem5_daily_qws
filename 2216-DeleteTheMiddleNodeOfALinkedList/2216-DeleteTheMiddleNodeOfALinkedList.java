// Last updated: 7/31/2025, 2:03:44 PM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
             return null;
        }

    ListNode slow = head, fast = head, prev = null;

    // Move slow to middle, fast to end
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    // Delete the middle node
    prev.next = slow.next;

    return head;
        
        
        
    }
}