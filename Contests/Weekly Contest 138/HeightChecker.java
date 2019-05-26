class Solution {
    public int heightChecker(int[] heights) {
        int[] hello = new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            hello[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0; i<heights.length; i++) {
            if(heights[i]!=hello[i]) {
                count++;
            }
        }
        return count;
    }
}