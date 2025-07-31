// Last updated: 7/31/2025, 2:08:49 PM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i<s.length()-1){
            
            char d=s.charAt(i+1);
            if(c=='I' && d=='V' || c=='I' && d=='X'){
                ans+=map.get(d)-1;
                i++;
            }
            else if(c=='X' && d=='L' || c=='X' && d=='C'){
                ans+=map.get(d)-10;
                i++;
            }
            else if(c=='C' && d=='D' || c=='C' && d=='M'){
                ans+=map.get(d)-100;
                i++;
            }
            else{
                ans+=map.get(c);
            }
            }
            else{
                ans+=map.get(c);
            }
        }
        return ans;
    }
}