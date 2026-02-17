// Last updated: 17/02/2026, 22:04:06
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        HashMap<String,Integer> map=new HashMap<>();
4        for(int i=0;i<words.length;i++){
5            if(words[i].length()>=k){
6                String prefix=words[i].substring(0,k);
7                if(map.containsKey(prefix)){
8                    int c=map.get(prefix);
9                    map.put(prefix,c+1);
10                }
11                else{
12                    map.put(prefix,1);
13                }
14            }
15            
16        }
17        int a=0;
18        for(String ans:map.keySet()){
19            if(map.get(ans)>=2){
20                a++;
21            }
22        }
23        return a;
24    }
25}