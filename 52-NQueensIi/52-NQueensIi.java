// Last updated: 7/31/2025, 2:08:16 PM
class Solution {
    public int totalNQueens(int n) {
        boolean[][] board=new boolean[n][n];
		return print(board,0,n);
    }
    public static int print(boolean[][] board,int row,int tq) {
		if(tq==0) {
			return 1;
		}
        int c=0;
		for(int col=0;col<board[0].length;col++) {
			if(isitsafe(board,row,col)) {
				board[row][col]=true;
				c+=print(board,row+1,tq-1);
				board[row][col]=false;	
			}
		}
		return c;
	}
	public static boolean isitsafe(boolean[][] board,int row,int col) {
		//up
		int r=row;
		while(r>=0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
		//diagonal right
		r=row;
		int c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		//diagonal left
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
}