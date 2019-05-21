class Solution {
    public int minAddToMakeValid(String S) {
        if(S.length()<=1) {
            return S.length();
        } else {
            Stack stack = new Stack();
            for(char c : S.toCharArray()) {
                if(c=='(') {
                    stack.push(c);
                } else {
                    if(!stack.empty() && (char)stack.peek()=='(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            int result = 0;
            while(!stack.empty()) {
                stack.pop();
                result++;
            }
            return result;
        }
    }
}