import java.util.*;

class NumberComplement {
	public static String dectobin(int p) {
		if(p==0) {
			String a = "0";
			return a;
		}
		String a = "";
		int q = p;
		int rem;
		while(q!=0) {
			rem = q%2;
			q = q/2;
			a = a.concat(new Integer(rem).toString());
		}
		a = new StringBuffer(a).reverse().toString();
		return a;
	}
	public static int bintodec(String a) {
		int sum = 0;
		a = new StringBuffer(a).reverse().toString();
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='1') {
				sum = sum + (int)Math.pow(2,i);
			}
		}
		return sum;
	}
	public static String strcomplement(String a) {
		String c = "";
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='0') {
				c = c + "1";
			} else {
				c = c + "0";
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String temp = dectobin(a);
		temp = strcomplement(temp);
		System.out.println("The number complement of "+a+" is "+bintodec(temp));
	}
}