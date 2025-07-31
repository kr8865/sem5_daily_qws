// Last updated: 7/31/2025, 2:07:04 PM
class Solution {
    public int majorityElement(int[] nums) {
        return (Moore_voting(nums));
    }
        public static int Moore_voting(int[] arr) {
		int e=arr[0];
		int v=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==e) {
				v++;
			}
			else {
				v--;
				if(v==0) {
					e=arr[i];
					v=1;
				}
			}
			
		}
		return e;
        
    }
}