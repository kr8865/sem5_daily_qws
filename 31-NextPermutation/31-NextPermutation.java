// Last updated: 7/31/2025, 2:08:35 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
        if(piv==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>piv;i--){
            if(nums[i]>nums[piv]){
                int temp=nums[i];
                nums[i]=nums[piv];
                nums[piv]=temp;
                break;
            }
        }
        int j=piv+1;
        int k=nums.length-1;
        while(j<=k){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            k--;
        }
        
        
    }
}