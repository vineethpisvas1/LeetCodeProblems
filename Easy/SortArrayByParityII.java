class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i=0, j=1;
        int[] result = new int[A.length];
        for(int k=0; k<A.length; k++) {
            if(A[k]%2==0) {
                result[i]=A[k];
                i=i+2;
            } else {
                result[j]=A[k];
                j=j+2;
            }
        }
        return result;
    }
}