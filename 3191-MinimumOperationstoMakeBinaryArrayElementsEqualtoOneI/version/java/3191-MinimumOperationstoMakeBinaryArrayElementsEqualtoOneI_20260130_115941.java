// Last updated: 30/01/2026, 11:59:41
1class Solution {
2    public int minOperations(int[] nums) {
3        int k=0;
4       for(int i=0;i<nums.length-2;i++){
5        if(nums[i]==0){
6            k++;
7            for(int j=i;j<=i+2;j++){
8                if(nums[j]==0){
9                    nums[j]=1;
10                }
11                else{
12                    nums[j]=0;
13                }
14            }
15        }
16       }
17       for(int i=0;i<nums.length;i++){
18        if(nums[i]==0){
19            return -1;
20        }
21       }
22       return k;
23    }
24}