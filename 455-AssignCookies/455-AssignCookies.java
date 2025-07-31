// Last updated: 7/31/2025, 2:05:46 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                c++;
                i++;
                j++;
            }
            else if(s[j]<g[i]){
                j++;
            }
            else{
                i++;
            }
        }
        return c;
    }
}