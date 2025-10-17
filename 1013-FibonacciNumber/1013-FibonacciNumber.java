// Last updated: 10/17/2025, 8:03:03 PM
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