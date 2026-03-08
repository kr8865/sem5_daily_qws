// Last updated: 08/03/2026, 10:15:24
1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3       
4        int n=nums.length;
5        long ts=0;
6        for(int i=0;i<n;i++){
7            ts+=nums[i];
8        }
9        long[] product=new long[n];
10        product[n-1]=1;
11        for(int i=n-2;i>=0;i--){
12                if(product[i+1]>ts){
13                product[i]=ts+7;
14            }
15            else {
16                if( product[i+1]*nums[i+1]>ts){
17                    product[i]=ts+7;
18                }
19                else{
20                    product[i] = product[i + 1] * nums[i+1];
21                }
22            }
23        }
24        long ls=0;
25        for(int i=0;i<n;i++){
26            if(ls==product[i]){
27                return i;
28            }
29            ls+=nums[i];
30        }
31        return -1;
32    }
33}