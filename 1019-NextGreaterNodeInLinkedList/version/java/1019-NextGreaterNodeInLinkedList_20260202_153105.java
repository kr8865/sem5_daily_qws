// Last updated: 02/02/2026, 15:31:05
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
12    class Pair{
13        ListNode node;
14        int idx;
15        Pair(ListNode node,int idx){
16            this.node=node;
17            this.idx=idx;
18        }
19    }
20    public int[] nextLargerNodes(ListNode head) {
21        Stack<Pair> st=new Stack<>();
22        ListNode v=head;
23        int size=0;
24        while(v!=null){
25            size++;
26            v=v.next;
27        }
28        int[] ans=new int[size];
29        ListNode temp=head;
30        int k=0;
31        while(temp!=null){
32            while(!st.isEmpty()&& (st.peek().node.val<temp.val)){
33                ans[st.pop().idx]=temp.val;
34            }
35            st.push(new Pair(temp,k));
36            k=k+1;
37            temp=temp.next;
38        }
39
40        return ans;
41        
42    }
43}