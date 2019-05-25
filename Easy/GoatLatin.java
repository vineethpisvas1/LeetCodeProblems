class Solution {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        StringBuilder s = new StringBuilder("");
        for(int i=0; i<strings.length; i++) {
            char ch = strings[i].charAt(0);
            if(!(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U')) {
                s.append(strings[i].substring(1, strings[i].length()));
                s.append(ch);
            } else {
                s.append(strings[i]);
            }
            s.append("ma");
            for(int j=0; j<=i; j++) {
                s.append("a");
            }
            if(i!=strings.length-1) {
                s.append(" ");
            }
        }
        return s.toString();
    }
}