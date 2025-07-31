// Last updated: 7/31/2025, 2:05:09 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0 ,si=0, ei=0,p=1;
		while(ei<nums.length) {
			//grow
			p=p*nums[ei];
			//shrink
			while(p>=k && si<=ei) {
				p=p/nums[si];
				si++;
			}
			//ans update
			ans=ans+ (ei-si+1);//window size
			ei++;
			
		}
		return ans;
    }
}