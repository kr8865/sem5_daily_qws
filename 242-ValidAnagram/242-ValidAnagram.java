// Last updated: 7/31/2025, 2:06:30 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                int v=map.get(c);
                map.put(c,v+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int v=map.get(t.charAt(i));
                if(v==1){
                    map.remove(t.charAt(i));
                }
                else{
                map.put(t.charAt(i),v-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
        
    }
}