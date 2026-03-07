// Last updated: 07/03/2026, 09:19:45
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int[] arr=nums.clone();
5        Arrays.sort(arr);
6        ArrayList<Integer> list=new ArrayList<>();
7        list.add(arr[0]);
8        for(int i=1;i<n;i++){
9            if(arr[i]!=arr[i-1]){
10                list.add(arr[i]);
11            }
12
13        }
14        int m=list.size();
15       int[][] dp=new int[n+1][m+1];
16       for(int i=1;i<=n;i++){
17        for(int j=1;j<=list.size();j++){
18            if(nums[i-1]==list.get(j-1)){
19                dp[i][j]=1+dp[i-1][j-1];
20            }
21            else{
22                int v=dp[i][j-1];
23                int b=dp[i-1][j];
24                dp[i][j]=Math.max(v,b);
25            }
26        }
27       }
28       return dp[n][list.size()];
29    }
30}