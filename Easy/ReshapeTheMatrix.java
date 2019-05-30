class Solution {
	public int[][] reshape(int[][] a, int r, int c) {
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[r][c];
		if(m*n==r*c) {
			int k=0;
			int[] temp = new int[m*n];
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					temp[k] = a[i][j];
					k++;
				}
			}
			k=0;
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					b[i][j] = temp[k];
					k++;
				}
			}
		} else {
			b = a;
		}
		return b;
	}
}