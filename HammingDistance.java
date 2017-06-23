import java.util.*;

class HammingDistance {
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
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String a1 = dectobin(a);
		String b1 = dectobin(b);
		System.out.println("====================\n"+a1+"\n"+b1+"\n"+"====================\n");
		String zero = "0";
		if(a1.length()>b1.length()) {
			while(a1.length()!=b1.length()) {
				b1 = zero.concat(b1);
			}
		} else if(b1.length()>a1.length()) {
			while(a1.length()!=b1.length()) {
				a1 = zero.concat(a1);
			}
		}
		int count = 0;
		for(int i=0; i<a1.length(); i++) {
			if(a1.charAt(i)!=b1.charAt(i)) {
				count++;
			}
		}
		System.out.println("====================\n"+a1+"\n"+b1+"\n"+"====================\n");
		System.out.println("The Hamming Distance is "+count);
	}
}

/* 

//Solution

public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

*/