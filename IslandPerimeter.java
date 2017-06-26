import java.util.*;

class IslandPerimeter {
	public static void main(String[] args) {
		int islands = 0;
		int neighbours = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Give the no. of rows: ");
		int m = s.nextInt();
		System.out.println("Give the no. of columns: ");
		int n = s.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Give the map: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j]==1) {
					islands++;
					if(i<a.length-1 && a[i+1][j]==1) {
						neighbours++;
					}
					if(j<a[i].length-1 && a[i][j+1]==1) {
						neighbours++;
					}
				}
			}
		}
		System.out.println((islands*4)-(neighbours*2));
	}
}