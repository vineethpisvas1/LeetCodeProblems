class Solution {
    public int missingNumber(int[] nums) {
        int currentSum=0;
        int expectedSum=0;
        expectedSum = (nums.length+1)*(nums.length)/2;
        for(int i=0; i<nums.length; i++) {
            currentSum += nums[i];
        }
        return currentSum == expectedSum ? 0 : expectedSum-currentSum;
    }
}