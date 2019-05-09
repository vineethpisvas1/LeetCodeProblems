class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0, maxZeroCount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                maxZeroCount++;
            }
        }
        if(maxZeroCount!=0 && maxZeroCount!=nums.length) {
            for(int i=0; i<nums.length; i++) {
                nums[i-zeroCount]=nums[i];
                if(nums[i]==0) {
                    zeroCount++;
                }
            }
            for(int i=nums.length-1; i>=nums.length-maxZeroCount; i--) {
                nums[i] = 0;
            }
        }
    }
}