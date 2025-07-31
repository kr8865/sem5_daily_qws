// Last updated: 7/31/2025, 2:08:13 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ll=new ArrayList<>();
        Print(matrix,ll);
        return ll;
    }
    public static void Print(int[][] arr, ArrayList<Integer> ll) {
		// TODO Auto-generated method stub
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				ll.add(arr[minr][i]);
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				ll.add(arr[i][maxc] );
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				ll.add(arr[maxr][i]);
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				ll.add(arr[i][minc]);
				c++;
			}
			minc++;
		}
	}

}