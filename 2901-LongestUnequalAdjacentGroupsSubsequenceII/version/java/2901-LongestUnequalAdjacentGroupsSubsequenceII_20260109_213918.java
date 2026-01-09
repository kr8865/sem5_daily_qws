// Last updated: 09/01/2026, 21:39:18
1class Solution {
2    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
3        int[][] dp = new int[words.length][2];
4        for(int i=0 ; i<words.length ; i++){
5            dp[i][0] = 1;
6            dp[i][1] = i;
7        }
8        for(int i=0 ; i<words.length; i++){
9            for(int j=i-1 ; j>=0 ; j--){
10                if(groups[i]!=groups[j] && dist(words[i],words[j]) && dp[j][0]+1>dp[i][0]){
11                    // now Ith can come after jth one
12                    dp[i][0] = dp[j][0]+1;
13                    dp[i][1] = j;
14                }
15            }
16        }
17        int idx=0;
18        for(int i=0 ; i<words.length ; i++){
19            if(dp[i][0]>dp[idx][0]){
20                idx = i;
21            }
22        }
23
24        List<String> ans = new ArrayList<>();
25        int temp=idx;//storing parent element index
26        for(int i=0 ; i<dp[idx][0] ; i++){
27            ans.add(0,words[temp]);
28            temp = dp[temp][1];
29        }
30        return ans;
31    }
32    //for checking hamming distance condition
33    //flag get changed after one different alphabet then further different alphabet lead to false
34    public boolean dist(String s1,String s2){
35        if(s1.length()!=s2.length()) return false;
36        boolean flag = true;
37        for(int i=0 ; i<s1.length() ; i++){
38            if(s1.charAt(i)!=s2.charAt(i)){
39                if(flag) flag = false;
40                else return false;
41            }
42        }
43        return true;
44    }
45}