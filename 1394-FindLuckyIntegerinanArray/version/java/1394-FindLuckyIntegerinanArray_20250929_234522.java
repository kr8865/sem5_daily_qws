// Last updated: 9/29/2025, 11:45:22 PM
import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxLucky = -1;
        // Check for lucky numbers
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                maxLucky = Math.max(maxLucky, key);
            }
        }
        
        return maxLucky;
    }
}
