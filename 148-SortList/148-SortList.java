// Last updated: 7/31/2025, 2:07:21 PM
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
    public ListNode sortList(ListNode head) {
        return mergesort(head);
        
    }
    public static ListNode mid(ListNode head){
       ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode mergell=new ListNode(-1);
        ListNode temp=mergell;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergell.next;
        
    }
    public static ListNode mergesort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid1=mid(head);
        ListNode leftnode=mid1.next;
        mid1.next=null;
        
       
        ListNode a=mergesort(head);
        ListNode b=mergesort(leftnode);
        return merge(a,b);

    }
}