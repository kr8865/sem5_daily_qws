// Last updated: 7/31/2025, 2:07:56 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean ans = Search(board,i,j,word,0);
					if(ans==true) {
						return true;
					}
					
				}
			}
		}
		return false;

	}
	
	public static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(cr<0 || cc<0 || cc>=board[0].length || cr>=board.length || board[cr][cc]!=word.charAt(idx)) {
			return false;
		}
		board[cr][cc]='*';
		int[] r = {-1,0,1,0};
		int[] c = {0,-1,0,1};
		for(int k=0; k<c.length; k++) {
			boolean ans = Search(board,cr+r[k],cc+c[k],word,idx+1);
			if(ans==true) {
				return true;
			}
		}
		board[cr][cc]=word.charAt(idx);
		return false;
    }
}