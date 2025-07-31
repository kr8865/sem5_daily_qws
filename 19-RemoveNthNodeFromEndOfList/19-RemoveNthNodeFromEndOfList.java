// Last updated: 7/31/2025, 2:08:44 PM
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
        ListNode temp=head;
        ListNode t=head;
        int size=0;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(head==null || head.next==null){
            head=null;
            return head;
        }
        if(size-n-1<0){
            return head.next;
        }
        for(int i=0;i<size-n-1;i++){
            t=t.next;

        }
        t.next=t.next.next;
        return head;
        
    }
}