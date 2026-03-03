// Last updated: 03/03/2026, 18:46:57
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String prefix="";
4        for(int i=1;i<=(s.length()/2);i++){
5            prefix=s.substring(0,i);
6            int v=prefix.length();
7            if(s.length()%v!=0){
8                continue;
9            }
10            boolean flag=true;
11           for(int j=i;j<s.length();j+=v){
12            if(!prefix.equals(s.substring(j,j+v))){
13                flag=false;
14                break;
15            }    
16
17        }
18        if (flag) return true;
19    }
20    return false;
21    }
22}