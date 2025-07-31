// Last updated: 7/31/2025, 2:07:25 PM
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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode pos=null;
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
              
            }
        }
        slow=head;
        if(fast==null || fast.next==null){
            return null;
        }

        while(slow!=fast){
           
            slow=slow.next;
            fast=fast.next;
            
        }
        
        
       
       return fast;
       

        
    }
    
}