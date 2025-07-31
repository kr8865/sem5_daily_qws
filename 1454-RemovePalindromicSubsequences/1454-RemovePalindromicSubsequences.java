// Last updated: 7/31/2025, 2:04:23 PM
class Solution {
    public int removePalindromeSub(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return 2;
            }
            else{
                left++;
                right--;
            }
        }
        return 1;
    }
}