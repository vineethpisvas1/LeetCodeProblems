class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A.length; i++) {
            for(int j=0; 2*j<A.length; j++) {
                if(A[i][j]==A[i][A.length-j-1]) {
                    A[i][j]=A[i][A.length-j-1]^=1;
                }
            }
        }
        return A;
    }
}