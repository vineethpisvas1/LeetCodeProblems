class Solution {
    public String removeDuplicates(String S) {
        if(S.length()==1) {
            return S;
        }
        List<Character> list = new ArrayList<>();
        for(char c : S.toCharArray()) {
            list.add(c);
        }
        while(true) {
            int numberOfElementsRemoved = 0;
            for(int i=0; i<list.size()-1; i++) {
                if(i+1>list.size()-1) {
                    break;
                }
                if(list.get(i)==list.get(i+1)) {
                    list.remove(i+1);
                    list.remove(i);
                    numberOfElementsRemoved += 2;
                    if(i<list.size()-1) {
                        i--;
                    }
                }
            }
            if(numberOfElementsRemoved==0) {
                break;
            }
        }
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list) {
            builder.append(ch);
        }
        return builder.toString();
    }
}