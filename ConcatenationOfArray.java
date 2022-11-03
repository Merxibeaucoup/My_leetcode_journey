// 1929. Concatenation of Array

/*
Given an integer array nums of length n, you want to create an array ans of length 2n 
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;        
        int [] ans = new int [n*2];
        

        
        /*
        take >>> 121
        length = 3
        
        @i =0..ans[0] =1
        @i =0..ans[0+3].. ans[3] =1
        @i =1..ans[1] =2
        @i =1..ans[1+3].. ans[4] =2
        @i =2..ans[2] =1
        @i =2..ans[2+3]..ans[5] =1
        
        therefore.. ans= [1,2,1,1,2,1]
        
        ..
        */
        
        for(int i =0; i< nums.length; i++){
            
            ans[i]= nums[i];
            ans[i+n] = nums[i];

        }
        return ans;
        
    }
}
