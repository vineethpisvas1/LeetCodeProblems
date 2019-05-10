class Solution {
    public int[] sortedSquares(int[] A) {
        int i=0, j=A.length-1;
        int[] result = new int[A.length];
        for(int k=A.length-1; k>=0; k--) {
            if(Math.abs(A[i])>Math.abs(A[j])) {
                result[k] = A[i]*A[i];
                i++;
            } else {
                result[k] = A[j]*A[j];
                j--;
            }
        }
        return result;
    }
}