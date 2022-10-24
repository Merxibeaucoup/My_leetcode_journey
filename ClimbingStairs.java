// leetcode 70. climbing stairs 

class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        
//         base cases
        dp[0]=1;
        dp[1]=1;
        // dp[2]=2;
        
//         start from 3 , dp[i] = addition(the previous 2)
            
            for(int i =2; i<=n; i++){
                dp[i] = dp[i-1]+ dp[i-2];
}
        
//         return dp @ n then
        
        return dp[n];
        
        
    }
}
