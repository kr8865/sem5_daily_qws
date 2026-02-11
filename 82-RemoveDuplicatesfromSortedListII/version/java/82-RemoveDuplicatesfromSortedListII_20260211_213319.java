// Last updated: 11/02/2026, 21:33:19
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        TreeMap<Integer ,Integer> map=new TreeMap<>();
14        ListNode temp=head;
15        while(temp!=null){
16            if(map.containsKey(temp.val)){
17                int v=map.get(temp.val);
18                map.put(temp.val,v+1);
19            }
20            else{
21                map.put(temp.val,1);
22            }
23            temp=temp.next;
24        }
25        ListNode dummy=new ListNode(-1);
26        ListNode ans=dummy;
27        for(int v:map.keySet()){
28            if(map.get(v)==1){
29                dummy.next=new ListNode(v);
30                dummy=dummy.next;
31            }
32
33        }
34        dummy.next=null;
35        return ans.next;
36    
37    } 
38}
39