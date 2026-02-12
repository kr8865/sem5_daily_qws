// Last updated: 12/02/2026, 12:03:21
1class Solution {
2    public int hIndex(int[] citations) {
3        Arrays.sort(citations);
4       int lo=0;
5       int ans=0;
6       int hi=citations.length;
7       while(lo<=hi){
8        int mid=(lo+hi)/2;
9            if(publish(mid,citations)){
10                ans=mid;
11                lo=mid+1;
12            }
13
14            else{
15                hi=mid-1;
16            }
17
18       }
19       return ans;
20
21    }
22    public static boolean publish(int mid,int[] citations){
23        int c=0;
24        for(int i=0;i<citations.length;i++){
25            if(citations[i]>=mid){
26                c++;
27            }
28        }
29        if(c>=mid){
30            return true;
31        }
32        return false;
33    }
34}