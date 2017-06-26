import java.util.*;

class KeyboardRow {
	// Checks if the string can be typed from a single line in the keyboard.
	public static boolean check(String a) {
		a = a.toLowerCase();
		char[] b = a.toCharArray();
		int[] row = new int[b.length];
		int[] hashrows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
		for(int i=0; i<b.length; i++) {
			row[i] = hashrows[(int)b[i]-97];
		}
		int checker = 0;
		for(int i=0; i<b.length; i++) {
			if(row[i]!=row[0]) {
				checker++;
			}
		}
		if(checker>0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give the size of the array: ");
		int size = s.nextInt();
		String[] a = new String[size];
		for(int i=0; i<size; i++) {
			a[i] = s.next();	
		}
		for(int i=0; i<size; i++) {
			if(check(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
	}
}