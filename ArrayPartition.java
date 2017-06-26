import java.util.*;

class ArrayPartition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		for(int i=0; i<size; i++) {
			if((i)%2==0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}