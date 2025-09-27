// Last updated: 9/27/2025, 2:10:46 PM
class Solution {
    static class Freq implements Comparable<Freq>{
        char ch;
        int f;
        Freq(char ch,int f){
            this.ch=ch;
            this.f=f;
        }
        @Override
        public int compareTo(Freq f2){
            return f2.f-this.f;
        }
        
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Freq> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                int v=map.get(c);
                map.put(c,v+1);
            }
        }
        for(char c:map.keySet()){
            pq.add(new Freq(c,map.get(c)));
            
        }

    StringBuilder sb = new StringBuilder();
       while(!pq.isEmpty()){
        int val=pq.peek().f;
        char b=pq.peek().ch;
        pq.poll();
        for(int i=0;i<val;i++){
            sb.append(b);
        }
       }

        return sb.toString();
    }
}