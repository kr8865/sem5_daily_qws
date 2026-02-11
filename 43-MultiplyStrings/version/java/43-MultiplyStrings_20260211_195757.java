// Last updated: 11/02/2026, 19:57:57
1import java.math.BigInteger;
2
3class Solution {
4    public String multiply(String num1, String num2) {
5        
6        BigInteger v1 = new BigInteger(num1);
7        BigInteger v2 = new BigInteger(num2);
8        
9        BigInteger ans = v1.multiply(v2);
10        
11        return ans.toString();
12    }
13}
14