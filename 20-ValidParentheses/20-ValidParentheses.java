// Last updated: 7/31/2025, 2:08:43 PM
class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()==true){
            return true;
        }
        while(true){
        if(s.contains("()")){
            s=s.replace("()","");
        }
        else if(s.contains("{}")){
            s=s.replace("{}","");
        }
        else if(s.contains("[]")){
            s=s.replace("[]","");
        }
        else{
            return s.isEmpty();
        }
        }
    }
}