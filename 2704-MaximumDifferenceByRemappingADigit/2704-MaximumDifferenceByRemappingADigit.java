// Last updated: 7/31/2025, 2:03:40 PM
class Solution {
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        int getmaxv=getmax(s,true);
        int getminv=getmax(s,false);
        return getmaxv-getminv;

        
    }
    public static int getmax(String s,boolean maximize){
        int best = maximize ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        for(char i='0';i<='9';i++){
            for(char j='0';j<='9';j++){
                if(i==j)continue;
                String remapped=s.replace(i,j);
                int val=Integer.parseInt(remapped);
                if(maximize){
                    best=Math.max(best,val);
                }
                else{
                    best=Math.min(best,val);
                }
            }
        }
        return best;
    }
}