class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int[] noOfWays = new int[n+1];
        noOfWays[0]=noOfWays[1]=1;
        for(int i=2; i<=n; i++) {
            noOfWays[i] = noOfWays[i-1] + noOfWays[i-2];
        }
        return noOfWays[n];
    }
}