class Solution {
    public boolean isValid(String s) {
        
        // stack solution
        char[] stack = new char[s.length() + 5];
        int top = 0;

        // traverse the string
        for(int i = 0; i < s.length(); ++i) {
            
            char curChar = s.charAt(i);
            
            if (top == 0) {
                // empty stack, push stack
                stack[top++] = curChar;
            }
            else {
                // when stack not empty
                if (curChar == ')' && stack[top-1] == '(') top --;
                else if (curChar == ']' && stack[top-1] == '[') top --;
                else if (curChar == '}' && stack[top-1] == '{') top --;
                else {
                    stack[top++] = curChar;
                }
            }
        }
        return top == 0 ? true : false;
    }
}
