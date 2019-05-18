class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[][] occurences = new int[A.length][26];
        for(int i=0; i<A.length; i++) {
            for(char c : A[i].toCharArray()) {
                occurences[i][c-97]++;
            }
        }
        for(int j=0; j<26; j++) {
            int temp = occurences[0][j];
            for(int i=0; i<A.length; i++) {
                temp = Math.min(temp, occurences[i][j]);
            }
            for(int i=0; i<temp; i++) {
                result.add(Character.toString((char)(j+97)));
            }
        }
        return result;
    }
}