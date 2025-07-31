// Last updated: 7/31/2025, 2:03:33 PM
class Solution {
    public int countPartitions(int[] nums) {
        int p=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
             c=c+a;
            int c1=0;
            for(int j=i+1;j<nums.length;j++){
                c1=c1+nums[j];
                
            }
            int d=c-c1;
            if(d%2==0){
                p++;
            }
        }
     return p;   
    }
}