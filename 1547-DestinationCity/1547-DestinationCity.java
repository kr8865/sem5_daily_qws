// Last updated: 7/31/2025, 2:04:20 PM
import java.util.*;
class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap <String , String> hm = new HashMap<>();
        for(List<String> s : paths){
            hm.put(s.get(0), s.get(1));
        }
        Set <String> source = hm.keySet();
    Collection<String> dest = hm.values();
        for(String s : dest){
            if(!source.contains(s)) return s;
        }
        return null;
        
    }
}