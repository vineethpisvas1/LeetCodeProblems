class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int max=0, sum=0, grumpySum=0;
        for(int j=0; j<customers.length; j++) {
            if(grumpy[j]==0) {
                grumpySum += customers[j];
            }
        }
        for(int i=0; i<=grumpy.length-X; i++) {
            sum=grumpySum;
            for(int j=i; j<i+X; j++) {
                if(grumpy[j]==1) {
                    sum += customers[j];
                }
            }
            if(max<sum) {
                max=sum;
            }
        }
        return max;
    }
}