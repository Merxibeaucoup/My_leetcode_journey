// 20. Valid Parentheses

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*/

class Solution {
    public boolean isValid(String s) {
        
//         pairs duh
        if(s.length() %2 != 0){
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            
//            push all openings
            
            if(c=='(' || c=='{' || c=='['){
                    stack.push(c);
            }
            
            
//             pop all valid closings
            
            else if (c ==')' && !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
            }
            else if (c =='}' && !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
            }
            else if (c ==']' && !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
            }
            
//             else if negative, return false
            else{
                return false;
            }

        }
        
        return stack.isEmpty();
        
    }
}
