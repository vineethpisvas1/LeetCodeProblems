class Solution {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[length+1];
        int min=0, max=length;
        for(int i=0; i<length; i++) {
            if(S.charAt(i)=='I') {
                result[i]=min;
                min++;
            } else {
                result[i]=max;
                max--;
            }
        }
        result[length]=min;
        return result;
    }
}