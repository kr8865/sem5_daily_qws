// Last updated: 7/31/2025, 2:05:51 PM
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        String[] st=s.split("\\s+");
        int len=0;
        if(s==null ||s.isEmpty()){
            len=0;
        }
        else{
        len=st.length;
        }
        return len;
        
    }
}