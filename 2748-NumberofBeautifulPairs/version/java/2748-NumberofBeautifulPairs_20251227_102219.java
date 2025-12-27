// Last updated: 27/12/2025, 10:22:19
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length-1;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(gcd(i,j,nums)){
7                    c++;
8                }
9            }
10        }
11        return c;
12    }
13    public boolean gcd(int i,int j,int[] nums ){
14        int l1=0;
15        int n=nums[i];
16        while(n>0){
17            int d=n%10;
18            n=n/10;
19            l1=d;
20        }
21        int l2=nums[j]%10;
22        int f=2;
23        int t=Math.min(l1,l2);
24        while(f<=t){
25            if(l1%f==0 && l2%f==0){
26                return false;
27            }
28            f++;
29        }
30        return true;
31
32    }
33}