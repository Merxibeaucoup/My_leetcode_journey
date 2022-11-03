// 2011. Final Value of Variable After Performing Operations

/*
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
*/

//METHOD 1 ... OPTIMAL

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int ans =0;
        
        
        
        for(int i =0; i<operations.length;  i++){
            if(operations[i].charAt(1)=='+')
                ans++;
            else
                ans--;
        }
        
        return ans;
        
    }
}

//METHOD 2

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int ans =0;
        
        for(String s : operations){

        if(s.equals("++X") || s.equals("X++")){
                ans++;
        }
                       
            else if (s.equals("--X")||(s.equals("X--"))) {
        ans--;
        }
        }
        
        
        return ans;
        
    }
}
