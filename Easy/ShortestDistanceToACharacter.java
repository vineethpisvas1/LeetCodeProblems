class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        List<Integer> indices = new ArrayList<>();
        if(S.length()==1) {
            return result;
        } else {
            for(int i=0; i<S.length(); i++) {
                if(S.charAt(i)==C) {
                    indices.add(i);
                }
            }
            for(int i=0; i<S.length(); i++) {
                result[i] = findMinimumDistance(i, indices);
            }
        }
        return result;
    }
    
    public int findMinimumDistance(int index, List<Integer> positions) {
        int minDistance = 10000;
        for(int position: positions) {
            if(Math.abs(index-position)<minDistance) {
                minDistance = Math.abs(index-position);
            }
        }
        return minDistance;
    }
}