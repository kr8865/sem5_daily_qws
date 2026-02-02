// Last updated: 02/02/2026, 15:05:29
1import java.math.BigInteger;
2
3class Solution {
4    public ListNode doubleIt(ListNode head) {
5
6        ListNode temp = head;
7
8        // 1. Linked list -> BigInteger
9        BigInteger v = BigInteger.ZERO;
10
11        while (temp != null) {
12            v = v.multiply(BigInteger.TEN)
13                 .add(BigInteger.valueOf(temp.val));
14            temp = temp.next;
15        }
16
17        // 2. Double the number
18        BigInteger newvl = v.multiply(BigInteger.valueOf(2));
19
20        // 3. BigInteger -> linked list
21        if (newvl.equals(BigInteger.ZERO)) {
22            return new ListNode(0);
23        }
24
25        ListNode dummy = new ListNode(-1);
26
27        while (newvl.compareTo(BigInteger.ZERO) > 0) {
28            BigInteger[] divRem = newvl.divideAndRemainder(BigInteger.TEN);
29            int d = divRem[1].intValue();
30
31            ListNode node = new ListNode(d);
32            node.next = dummy.next;
33            dummy.next = node;
34
35            newvl = divRem[0];
36        }
37
38        return dummy.next;
39    }
40}
41