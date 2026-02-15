// Last updated: 15/02/2026, 09:36:42
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<bulbs.size();i++){
5            if(map.containsKey(bulbs.get(i))){
6                int c=map.get(bulbs.get(i));
7                map.put(bulbs.get(i),c+1);
8            }
9            else{
10                map.put(bulbs.get(i),1);
11            }
12        }
13            ArrayList<Integer> list=new ArrayList<>();
14        for(int v:map.keySet()){
15            if(map.get(v)%2!=0){
16                list.add(v);
17            }
18        }
19        Collections.sort(list);
20        return list;
21        
22    }
23}