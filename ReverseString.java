import java.util.*;

class ReverseString {
	public static String reverseString(String a) {
		char[] b = a.toCharArray();
		char temp;
		for(int i=0; i<(b.length/2); i++) {
			temp = b[i];
			b[i] = b[b.length-i-1];
			b[b.length-i-1] = temp;
		}
		String c = new String(b);
		return c;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		System.out.println(reverseString(a));
	}
}