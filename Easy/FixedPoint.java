class Solution {
    public int fixedPoint(int[] A) {
        if(A[0]>A.length-1 || A[A.length-1]<0) {
            return -1;
        } else {
            for(int i=0; i<A.length; i++) {
                if(A[i]==i) {
                    return i;
                }
            }
            return -1;
        }
    }
}