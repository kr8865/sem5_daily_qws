// Last updated: 10/1/2025, 1:54:48 PM
class Solution {
    public int integerReplacement(int n) {
        long num = n;  // use long to avoid overflow
        int c = 0;
        while(num > 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                if(num == 3 || num % 4 == 1) {
                    num -= 1;  // subtract 1
                } else {
                    num += 1;  // add 1
                }
            }
            c++;
        }
        return c;
    }
}
