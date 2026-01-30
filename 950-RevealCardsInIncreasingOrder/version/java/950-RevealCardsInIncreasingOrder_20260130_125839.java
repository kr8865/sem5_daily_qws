// Last updated: 30/01/2026, 12:58:39
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int ans[] = new int[deck.length];
5
6        Queue<Integer>q = new LinkedList<>();
7        for(int i=0;i<deck.length;i++){
8            q.add(i);
9        }
10        
11        for(int i : deck){
12            ans[q.poll()]=i;
13
14            if(!q.isEmpty()){
15                q.add(q.poll());
16            }
17        }
18
19        return ans;
20    }
21}