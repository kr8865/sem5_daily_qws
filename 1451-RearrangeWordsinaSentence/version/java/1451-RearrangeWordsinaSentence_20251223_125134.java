// Last updated: 23/12/2025, 12:51:34
1class Solution {
2
3    public String arrangeWords(String text) {
4        int k=0;
5        int idx=0;
6       
7        String ans = text.toLowerCase();
8
9        PriorityQueue<Pair> pq=new PriorityQueue<>();
10        for(int i=0;i<ans.length();i++){
11            char ch=ans.charAt(i);
12            if(ch==' '){
13                pq.add(new Pair(ans.substring(k,i),i-k,idx++));
14                k=i+1;
15            }
16        }
17        pq.add(new Pair(ans.substring(k), ans.length() - k,idx));
18
19        StringBuilder sb = new StringBuilder();
20        while (!pq.isEmpty()) {
21            sb.append(pq.poll().st).append(" ");
22        }
23
24        sb.deleteCharAt(sb.length() - 1);
25        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
26
27        return sb.toString();
28
29        
30    }
31    class Pair implements Comparable<Pair>{
32        String st;
33        int len;
34        int idx;
35        Pair(String st,int len,int idx){
36            this.st=st;
37            this.len=len;
38            this.idx=idx;
39        }
40        @Override
41        public int compareTo(Pair p2){
42           if(this.len!=p2.len){
43            return this.len-p2.len;
44           }
45           return this.idx-p2.idx;
46
47
48        }
49    }
50}