// Last updated: 25/12/2025, 11:32:36
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for(int i=0; i<board.length; i++) {
4			for(int j=0; j<board[0].length; j++) {
5				if(board[i][j]==word.charAt(0)) {
6					boolean ans = Search(board,i,j,word,0);
7					if(ans==true) {
8						return true;
9					}
10					
11				}
12			}
13		}
14		return false;
15
16	}
17	
18	public static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
19		if(idx==word.length()) {
20			return true;
21		}
22		if(cr<0 || cc<0 || cc>=board[0].length || cr>=board.length || board[cr][cc]!=word.charAt(idx)) {
23			return false;
24		}
25		board[cr][cc]='*';
26		int[] r = {-1,0,1,0};
27		int[] c = {0,-1,0,1};
28		for(int k=0; k<c.length; k++) {
29			boolean ans = Search(board,cr+r[k],cc+c[k],word,idx+1);
30			if(ans==true) {
31				return true;
32			}
33		}
34		board[cr][cc]=word.charAt(idx);
35		return false;
36    }
37}