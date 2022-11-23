// leetcode. 1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {

        int max =0;
        int depth =0;

        for(char c : s.toCharArray()){
            if(c=='('){

// if '(' increase depth, else if ')' decrease depth

                // return the greater of the two
                max= Math.max(max, ++depth);
            }
            else if(c==')'){
                --depth;
            }
        }

        return max;
        
    }
}
