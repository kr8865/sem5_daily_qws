// Last updated: 7/31/2025, 2:06:19 PM
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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        int i=0;
        ListNode even=new ListNode(-1);
        ListNode evenl=even;
        ListNode odd=new ListNode(-1);
        ListNode oddl=odd;
        while(temp!=null){
            if(i%2==0){
                evenl.next=temp;
                evenl=evenl.next;

            }
            else{
                oddl.next=temp;
                oddl=oddl.next;
            }
            i++;
            temp=temp.next;

        }
        oddl.next=null;
        evenl.next=odd.next;
        return even.next;
        
    }
}