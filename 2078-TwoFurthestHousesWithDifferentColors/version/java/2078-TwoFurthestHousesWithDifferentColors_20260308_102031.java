// Last updated: 08/03/2026, 10:20:31
1class Solution {
2    public int maxDistance(int[] colors) {
3        
4        int dis=0;
5        for(int i=0;i<colors.length;i++){
6            int house=colors[i];
7            for(int j=i+1;j<colors.length;j++){
8                if(house!=colors[j]){
9                    dis=Math.max(dis,(j-i));
10                }
11            }
12            
13        }
14        return dis;
15        
16    }
17}