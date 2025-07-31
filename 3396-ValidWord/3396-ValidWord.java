// Last updated: 7/31/2025, 2:03:39 PM
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int v=0;
        int l=0;
        String ans=word.toLowerCase();
        for(int i=0;i<ans.length();i++){
            char d=ans.charAt(i);

            if(!Character.isLetterOrDigit(d)){
                return false;

            }
            if(d=='a' || d=='e'||d=='i'||d=='o'||d=='u'){
                v++;
            }
            else if(!Character.isDigit(d)){
                l++;
            }
        }
        if(v<1 ||l<1){
            return false;
        }
        return true;



        
    }
}