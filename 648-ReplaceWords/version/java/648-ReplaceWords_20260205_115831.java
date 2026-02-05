// Last updated: 05/02/2026, 11:58:31
1class Solution {
2    static class Node{
3        char ch;
4        HashMap<Character, Node> child;
5        boolean isTerminal;
6        Node(char ch){
7            this.ch=ch;
8            child=new HashMap<>();
9        }
10    }
11    public Solution() {
12        root = new Node('*');
13    }
14    private static Node root;
15    private static void insert(String word){
16        Node curr=root;
17        for(int i=0;i<word.length();i++){
18            char ch=word.charAt(i);
19            if(curr.child.containsKey(ch)){
20                curr=curr.child.get(ch);
21            }
22            else{
23                Node nn=new Node(ch);
24                curr.child.put(ch,nn);
25                curr=nn;
26            }
27        }
28        curr.isTerminal=true;
29    }
30    private static String getRoot(String word){
31        Node curr=root;
32        StringBuilder ans=new StringBuilder();
33        for(int i=0;i<word.length();i++){
34            char ch=word.charAt(i);
35            if(!curr.child.containsKey(ch)){
36                return word;
37            }
38            curr=curr.child.get(ch);
39            ans.append(ch);
40            if(curr.isTerminal){
41                return ans.toString();
42            }
43        }
44        return word;
45    }
46    public String replaceWords(List<String> dictionary, String sentence) {
47        for(String s:dictionary){
48            insert(s);
49        }
50        StringBuilder sb=new StringBuilder();
51        String arr[]=sentence.split(" ");
52        for(int i=0;i<arr.length;i++){
53            sb.append(getRoot(arr[i]));
54            if(i<arr.length-1) sb.append(" ");
55        }
56        return sb.toString();
57    }
58}