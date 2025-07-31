// Last updated: 7/31/2025, 2:07:43 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }

        int i=1;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(i==left){
                break;

            }
            pre=pre.next;
            i++;
        }
        
        ListNode prev=null;
        ListNode last=pre.next;//5
        ListNode curr=last;///5
        ListNode next;
        while(left<=right){//2//3//4 //1
            next=curr.next; //3//4//5  //null
            curr.next=prev;//2->null//3->2->null//4->3->2->null //5->null
            prev=curr;//2//3//4 //5
            curr=next;//3//4//5 //null
            
            left++;//3//4
        }
        pre.next=prev;
        last.next=curr;


return dummy.next;
    }

}