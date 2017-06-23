import java.util.*;

class ReverseWordsInString {
	public static String stringReverse(String a) {
		String[] parts = a.split(" ");
		String b = "";
		for (int i=0; i<parts.length; i++) {
			if(i!=0) {
				b = b.concat(" ");
			}
			parts[i] = new StringBuffer(parts[i]).reverse().toString();
			b = b.concat(parts[i]);
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output = stringReverse(input);
		System.out.println(output);
	}
}