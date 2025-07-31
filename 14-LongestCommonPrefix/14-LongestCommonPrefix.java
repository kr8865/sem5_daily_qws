// Last updated: 7/31/2025, 2:08:47 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last= strs[strs.length-1];
        String st="";
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
                
            }
            st=st+first.charAt(i);

        }
        return st;
    }
}