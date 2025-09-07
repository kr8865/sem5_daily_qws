// Last updated: 9/7/2025, 3:16:17 PM
class Solution {
     class Pair implements Comparable<Pair>{
        String word;
        int freq;
    Pair(String word,int freq){
        this.word=word;
        this.freq=freq;
    }
    @Override
public int compareTo(Pair p2) {
    if (this.freq == p2.freq) {
        return this.word.compareTo(p2.word); // lexicographic order if freq equal
    }
    return p2.freq - this.freq; // higher frequency first
}
     }
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> ll=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(!map.containsKey(words[i])){
                map.put(words[i],1);
            }
            else{
                int c=map.get(words[i]);
                map.put(words[i],c+1);
            }
         }
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
         for(int i=0;i<k;i++){
            ll.add(pq.remove().word);
         }
         return ll;
    }
         
        
    
}