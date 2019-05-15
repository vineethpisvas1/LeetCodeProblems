class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            } else if(stack.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')) {
              return false;  
            } else if(s.charAt(i)==')' && (char)stack.peek()=='(') {
                stack.pop();
            } else if(s.charAt(i)==']' && (char)stack.peek()=='[') {
                stack.pop();
            } else if(s.charAt(i)=='}' && (char)stack.peek()=='{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}