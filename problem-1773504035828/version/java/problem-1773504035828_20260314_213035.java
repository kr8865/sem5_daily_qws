// Last updated: 14/03/2026, 21:30:35
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            boolean f=false;
5            for(int j=0;j<nums.length;j++){
6                if(i!=j && nums[i]%2==0){
7                    if(nums[i]==nums[j]){
8                        f=true;
9                        break;
10                        
11                    }
12                }
13                
14            }
15            if(nums[i]%2==0 && f==false){
16                    return nums[i];
17                }
18        }
19        return -1;
20        
21    }
22}