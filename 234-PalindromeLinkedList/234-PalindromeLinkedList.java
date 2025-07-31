// Last updated: 7/31/2025, 2:06:36 PM
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
    public boolean isPalindrome(ListNode head) {

        //mid
        if(head==null || head.next==null){
            return true;
        }

        ListNode mid=midv(head);//1
        ListNode temp=mid;//2
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode temp1 = head;
        while (!st.isEmpty()) {
            if (temp1.val != st.pop()) {
                return false;
            }
            temp1 = temp1.next;
        }

        return true;
    

    }
    public static ListNode midv(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
   
}