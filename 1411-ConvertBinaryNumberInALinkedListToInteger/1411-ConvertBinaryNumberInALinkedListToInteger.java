// Last updated: 7/31/2025, 2:04:27 PM
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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        ListNode temp2=head;
        int size=0;
        while(temp2!=null){
            size++;
            temp2=temp2.next;
        }
        int k=size-1;
        int ans=0;
        while(temp!=null){
            int val=temp.val;
            ans+=val*Math.pow(2,k);
            
            k--;
            temp=temp.next;

        }
        return ans;
        
    }
}