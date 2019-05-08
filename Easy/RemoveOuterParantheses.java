class Solution {
    public String removeOuterParentheses(String S) {
        if(S.length()==0) {
            return S;
        } else {
            StringBuilder finalResult = new StringBuilder("");
            int sum = 0;
            for(char ch : S.toCharArray()) {
                if(ch=='(') {
                    if(sum>0) {
                        finalResult.append(ch);
                    }
                    sum++;
                } else if(ch==')') {
                    sum--;
                    if(sum>0) {
                        finalResult.append(ch);
                    }
                }
            }
            return finalResult.toString();
        }
    }
}