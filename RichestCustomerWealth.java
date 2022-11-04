// leetcode 1672. Richest Customer Wealth

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the 
ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth.

Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
*/


class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int res=0;
        
            /*
            for i first array
            loop through the accounts array  ... 
            customer array to hold first array 
            */
        for(int [] customer : accounts){
            int sum =0;
            
            /*
            for j second array
            loop through the customer array 
            do sum
            
            */
            for(int acc : customer){                 
                 sum += acc;
             }
            
            /*
            find max sum 
             check betweenn res and sum to find the max 
            
            assign max sum to res
           
            */
             res = Math.max(res, sum);
            }
        
            /*
            return the max sum 
            */
        
        return res;
           
        
    }
}
