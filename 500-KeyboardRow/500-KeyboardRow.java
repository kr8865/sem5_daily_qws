// Last updated: 7/31/2025, 2:05:42 PM
class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<String> result = new ArrayList<>();
        for(char c: "qwertyuiop".toCharArray()){
            map.put(c,1);
        }
         for(char c: "asdfghjkl".toCharArray()){
            map.put(c,12);
        }
         for(char c: "zxcvbnm".toCharArray()){
            map.put(c,3);
        }



        for(int i=0;i<words.length;i++){
            String c=words[i];
            String d=c.toLowerCase();
            boolean isvalid=true;
            int row=map.get(d.charAt(0));
            for(int j=0;j<d.length();j++){
                if(map.get(d.charAt(j))!=row){
                    isvalid=false;
                    break;
                }
            }
            if(isvalid){
                result.add(c);
            }

        }
        return result.toArray(new String[0]);
    
        
    }
}