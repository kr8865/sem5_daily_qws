// Last updated: 21/12/2025, 10:43:05
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i=0;
4        int j=0;
5        while(i<name.length() && j<typed.length()){
6            if(name.charAt(i)==typed.charAt(j)){
7                i++;
8                j++;
9            }
10            else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
11                    j++;
12            }
13            else{
14                    return false;
15                }
16        }
17        if(i!=name.length()){
18            return false;
19        }
20        while(j<typed.length()){
21            if(name.charAt(i-1)!=typed.charAt(j)){
22               return false;
23        
24            }
25            j++;
26        }
27            
28        
29        
30        
31        return true;
32        
33    }
34}