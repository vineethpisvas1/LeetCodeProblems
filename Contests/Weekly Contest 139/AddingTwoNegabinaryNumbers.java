class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        if(arr1.length==1 && arr1[0]==0) {
            return arr2;
        } else if(arr2.length==1 && arr2[0]==0) {
            return arr1;
        }
        int number = bintodec(arr1) + bintodec(arr2);
        // System.out.println(number);
        return convertIntegers(dectobin(number)); 
    }
    
    public static List<Integer> dectobin(int p) {
		List<Integer> a = new ArrayList<>();
        if(p==0) {
            a.add(0);
			return a;
		}
		int q = p;
		int rem;
		while(q!=0) {
			if(q%2 == 1) {
	            rem = 1
	            q -= (i%2==0 ? 1 : -1)
	        } else {
	            rem = 0
	        }
			q = q / 2;
            a.add(rem);                
            // System.out.print("QUO="+q+", REM="+rem+"\n");
		}
        Collections.reverse(a);
		return a;
	}
    
    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
	public static int bintodec(int[] a) {
		int sum = 0;
		for (int i=a.length-1; i>=0; i--) {
			if(a[i]==1) {
				sum = sum + (int)Math.pow(-2,a.length-1-i);
			}
		}
		return sum;
	}
}