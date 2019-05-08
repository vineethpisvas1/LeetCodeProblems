class Solution {
    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i]>=65 && charArray[i]<=90) {
                charArray[i] = (char)(charArray[i] + 32);
            }
        }
        return new String(charArray);
    }
}