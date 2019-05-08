class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[] columnMaxHeights = new int[grid[0].length];
        int[] rowMaxHeights = new int[grid.length];
        int maxSum = 0;
        for(int i=0; i<grid[0].length; i++) {
            columnMaxHeights[i]=0;
            for(int j=0; j<grid.length; j++) {
                if(columnMaxHeights[i]<grid[j][i]) {
                    columnMaxHeights[i] = grid[j][i];
                }
            }
        }
        for(int i=0; i<grid.length; i++) {
            rowMaxHeights[i]=0;
            for(int j=0; j<grid[0].length; j++) {
                if(rowMaxHeights[i]<grid[i][j]) {
                    rowMaxHeights[i] = grid[i][j];
                }
            }
        }
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]<Math.min(columnMaxHeights[j], rowMaxHeights[i])) {
                    maxSum += Math.min(columnMaxHeights[j], rowMaxHeights[i]) - grid[i][j];
                }
            }
        }
        return maxSum;
    }
}