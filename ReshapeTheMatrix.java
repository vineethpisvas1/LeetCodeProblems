import java.util.*;

class ReshapeTheMatrix {
	public static int[][] reshape(int[][] a, int r, int c) {
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
			System.out.println("Wrong Combination!!");
			b = a;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give the rows of initial matrix: ");
		int r1 = s.nextInt();
		System.out.println("Give the columns of initial matrix: ");
		int c1 = s.nextInt();
		int[][] a = new int[r1][c1];
		System.out.println("Give the initial matrix: ");	
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Give the rows of final matrix: ");
		int r2 = s.nextInt();
		System.out.println("Give the columns of final matrix: ");
		int c2 = s.nextInt();
		int[][] b = reshape(a, r2, c2);
		System.out.println("The final matrix: \n");	
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}