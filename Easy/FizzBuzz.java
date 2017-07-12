import java.util.*;

class FizzBuzz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] a = new String[n];
		for(int i=0; i<n; i++) {
			if((i+1)%3==0 && (i+1)%5==0) {
				a[i] = "FizzBuzz";
			} else if((i+1)%3==0) {
				a[i] = "Fizz";
			} else if((i+1)%5==0) {
				a[i] = "Buzz";
			} else {
				a[i] = Integer.toString(i+1);
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
}