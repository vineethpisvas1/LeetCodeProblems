class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Boolean> occurences = new HashMap<>();
        int i=0;
        for(i=0; i<A.length; i++) {
            if(occurences.containsKey(A[i])) {
                break;
            } else {
                occurences.put(A[i], true);
            }
        }
        return A[i];
    }
}