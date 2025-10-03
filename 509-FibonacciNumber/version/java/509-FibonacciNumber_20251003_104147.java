// Last updated: 10/3/2025, 10:41:47 AM
class Solution {
    public int fib(int n) {
        return fi(n);
        
    }
    public static int fi(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;

        }
        return fi(n-1)+fi(n-2);
    }
}