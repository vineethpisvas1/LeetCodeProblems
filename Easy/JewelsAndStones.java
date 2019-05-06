class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] jewelArray = J.toCharArray();
        char[] stoneArray = S.toCharArray();
        int occurences = 0;
        for(int i=0; i<J.length(); i++) {
            for(int j=0; j<S.length(); j++) {
                if(jewelArray[i]==stoneArray[j]) {
                    occurences++;
                }
            }
        }
        return occurences;
    }
}