class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int j=0;
        for(int i=0; i<A.length; i++) {
            if(A[i]%2==0) {
                result[j]=A[i];
                j++;
            }
        }
        for(int i=0; i<A.length; i++) {
            if(A[i]%2==1) {
                result[j]=A[i];
                j++;
            }
        }
        return result;
    }
}