// Last updated: 7/31/2025, 2:03:29 PM
class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        int maxodd=0;
        int maxeven = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int f:freq){
            if(f>0){
            if(f%2==0){
                maxeven=Math.min(maxeven,f);
            }
            else{
                maxodd=Math.max(maxodd,f);
            }
            }
        }
         return (maxodd > 0 && maxeven != Integer.MAX_VALUE) ? maxodd - maxeven : 0;
        
    }
}