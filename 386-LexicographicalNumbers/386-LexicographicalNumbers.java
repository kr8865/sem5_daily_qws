// Last updated: 7/31/2025, 2:06:03 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll=new ArrayList<>();
        print(n,0,ll);
        ll.remove(0);
        return ll;

        
    }
    public static void print(int n,int curr,List<Integer>ll){
        if(curr>n){
            return;
        }
        ll.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,curr*10+i,ll);
        }
    }
}